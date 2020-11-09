package org.spring.service;


import java.util.Map;

import org.spring.model.MbJoinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MbJoinService {
	
	@Autowired
	MbJoinDao mbDao;
	
	public void mbJoin(MbJoinDto mbJoinDto) {
		mbDao.mbJoin(mbJoinDto);
	}
	public Map<String,String> mbLogin(String mail) {
		return mbDao.mbLogin(mail);
	}

	
}
