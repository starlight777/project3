package com.bit.backpackers.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.bit.backpackers.model.ImageDao;
import com.bit.backpackers.model.entity.UploadFileVo;


@Service
public class ImageServiceImpl implements ImageService{

//	@Override
//	public UploadFileVo store(MultipartFile file) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public UploadFileVo load(Long fileId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Autowired
	ImageDao imageDao;
	
	//Path rootLocation; // d:/image/
	String rootLocation = "c:/image/";

	
	
	public UploadFileVo store(MultipartFile file) throws Exception {                
		//		 fileName : 예류2.jpg
		//		 filePath : d:/images/uuid-예류2.jpg
		//		 saveFileName : uuid-예류2.png
		//		 contentType : image/jpeg
		//		 size : 4994942
		//		 registerDate : 2020-02-06 22:29:57.748
		System.out.println(file.getOriginalFilename());
		try {
			if(file.isEmpty()) {
				throw new Exception("Failed to store empty file " + file.getOriginalFilename());
			}
			
			String saveFileName = fileSave(rootLocation.toString(), file);           
			UploadFileVo saveFile = new UploadFileVo();
			saveFile.setFileName(file.getOriginalFilename());
			saveFile.setSaveFileName(saveFileName);
			saveFile.setContentType(file.getContentType());
			saveFile.setSize(file.getSize());
			saveFile.setFilePath(rootLocation.toString().replace(File.separatorChar, '/') +'/' + saveFileName);   
			imageDao.saveUploadfile(saveFile);
			return saveFile;
			
		} catch(IOException e) {
			throw new Exception("Failed to store file " + file.getOriginalFilename(), e);
		}
		
		
	}

	public UploadFileVo load(Long fileId) {
		//return uploadFileRepository.findById(fileId).get();
		return imageDao.selectbyid(fileId);
	}
	
	public String fileSave(String rootLocation, MultipartFile file) throws IOException {
		File uploadDir = new File(rootLocation);
		
		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}
		
		// saveFileName 생성
		UUID uuid = UUID.randomUUID();
		String saveFileName = uuid.toString() + file.getOriginalFilename();
		File saveFile = new File(rootLocation, saveFileName);
		FileCopyUtils.copy(file.getBytes(), saveFile);
		
		return saveFileName;
	}
}
