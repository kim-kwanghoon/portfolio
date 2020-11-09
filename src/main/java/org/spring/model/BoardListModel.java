package org.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.spring.service.Paging;


public class BoardListModel {
	private int count;
	private List<BoardDto> boardList;// 현재 페이지에서 보여질 글들
	private int requestPage;// 요청페이지
	private int totalPageCount;// 전체 페이지 수
	private int startRow;// 시작글
	private Paging p; 

	public BoardListModel() {
		this(new ArrayList<BoardDto>(), 0, 0, 0, new Paging(), 0);
	}

	public BoardListModel(List<BoardDto> boardList, int requestPage, int totalPageCount, int startRow, Paging p,
			int count) {
		super();
		this.boardList = boardList;
		this.requestPage = requestPage;
		this.totalPageCount = totalPageCount;
		this.startRow = startRow;
		this.p = p;
		this.count = count;
	}

	public List<BoardDto> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<BoardDto> boardList) {
		this.boardList = boardList;
	}

	public int getRequestPage() {
		return requestPage;
	}

	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public Paging getP() {
		return p;
	}

	public void setP(Paging p) {
		this.p = p;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

}
