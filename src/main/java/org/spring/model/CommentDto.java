package org.spring.model;

import java.util.Date;

public class CommentDto {
	int bno;
	String commentText;
	String commentId;
	String commentPw;
	Date commentDa;
	int commentNo;
	
	
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentPw() {
		return commentPw;
	}
	public void setCommentPw(String commentPw) {
		this.commentPw = commentPw;
	}
	
	public Date getCommentDa() {
		return commentDa;
	}
	public void setCommentDa(Date commentDa) {
		this.commentDa = commentDa;
	}
	@Override
	public String toString() {
		return "CommentDto [bno=" + bno + ", commentText=" + commentText + ", commentId=" + commentId + ", commentPw="
				+ commentPw + "]";
	}
	
	
}
