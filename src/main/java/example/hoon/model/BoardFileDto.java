package example.hoon.model;

public class BoardFileDto {
	private int bno;
	private int fileNo;
	private String fileOr;
	private String fileCh;
	private int fileSi;

	@Override
	public String toString() {
		return "BoardFileDto [bno=" + bno + ", fileNo=" + fileNo + ", fileOr=" + fileOr + ", fileCh=" + fileCh
				+ ", fileSi=" + fileSi + "]";
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

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
}
