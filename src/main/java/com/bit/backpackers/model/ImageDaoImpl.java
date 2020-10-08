package com.bit.backpackers.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.backpackers.model.entity.UploadFileVo;

@Repository
public class ImageDaoImpl implements ImageDao{

	@Autowired
	SqlSession sqlsession;
	
	@Override
	public UploadFileVo selectbyid(Long fileId) {
		return sqlsession.selectOne("gear.imageselectfileid", fileId);
	}

	@Override
	public void saveUploadfile(UploadFileVo saveFile) {
		sqlsession.insert("gear.saveUploadfile",saveFile);
	}

}
