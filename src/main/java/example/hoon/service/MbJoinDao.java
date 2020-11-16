package example.hoon.service;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import example.hoon.model.MbJoinDto;

public class MbJoinDao extends SqlSessionDaoSupport {
	
	public void mbJoin(MbJoinDto mbJoinDto) {
		getSqlSession().insert("Join.mbjoininsert",mbJoinDto);
	}
	public Map<String,String> mbLogin(String mail) {
		System.out.println("Dto 들고간값="+mail+ "  뱉은값="+ getSqlSession().selectOne("Join.mblogin",mail) );
		return getSqlSession().selectOne("Join.mblogin",mail);
	}
	
}
