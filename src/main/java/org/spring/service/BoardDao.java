package org.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.spring.model.BoardDto;
import org.spring.model.BoardFileDto;
import org.spring.model.CommentDto;

public class BoardDao extends SqlSessionDaoSupport {
	
	public List<BoardDto> getListAdd() {
		return getSqlSession().selectList("board.getlistAdd");
	}

	public void writeInsert(BoardDto boardDto) {
		getSqlSession().insert("board.writeInsert",boardDto);	
	}
	
	public int maxBon() {
		return getSqlSession().selectOne("board.maxBon");
	}

	public void fileInforInsert(BoardFileDto boardFileDto) {
		getSqlSession().insert("board.fileInforInsert",boardFileDto);		
	}

	public List<BoardDto> getViewPage(int bno) {
		return getSqlSession().selectList("board.getViewPage",bno);
	}

	public int contentViewPage_comment_insert(CommentDto commentDto) {
		return getSqlSession().insert("board.contentViewPage_comment_insert",commentDto);
	}

	public List<CommentDto> contentViewPage_comment_list(int bno) {
		return getSqlSession().selectList("board.contentViewPage_comment_list",bno);		
	}

	public CommentDto contentViewPage_comment_add(int commentNo) {
		return getSqlSession().selectOne("board.contentViewPage_comment_add",commentNo);
	}

	public int count() {
		return getSqlSession().selectOne("board.count");
	}

	public List<BoardDto> getList(int start, int per) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("start",start);
		m.put("per",per);
		return getSqlSession().selectList("board.list",m);
	}
	
}
