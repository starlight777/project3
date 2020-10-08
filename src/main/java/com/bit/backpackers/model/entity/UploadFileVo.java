package com.bit.backpackers.model.entity;

public class UploadFileVo {
	
	private Long id;
	
	private String fileName;                //예류.jpg
	
	private String saveFileName;            //uuid예류.jpg
	
	private String filePath;                // D:/image/uuid예류.jpg
	
	private String contentType;             // image/jpeg
	
	private long size;                      // 4476873 (byte)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSaveFileName() {
		return saveFileName;
	}

	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public UploadFileVo() {
		// TODO Auto-generated constructor stub
	}
	public UploadFileVo(Long id, String fileName, String saveFileName, String filePath, String contentType, long size) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.saveFileName = saveFileName;
		this.filePath = filePath;
		this.contentType = contentType;
		this.size = size;
	}
	
	
}

