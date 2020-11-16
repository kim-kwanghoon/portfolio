package example.hoon.model;

import java.util.Date;

public class BoardDto {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	
	private int fileNo;
	private String fileOr;
	private String fileCh;
	private int fileSi;

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileOr() {
		return fileOr;
	}

	public void setFileOr(String fileOr) {
		this.fileOr = fileOr;
	}

	public String getFileCh() {
		return fileCh;
	}

	public void setFileCh(String fileCh) {
		this.fileCh = fileCh;
	}

	public int getFileSi() {
		return fileSi;
	}

	public void setFileSi(int fileSi) {
		this.fileSi = fileSi;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
}