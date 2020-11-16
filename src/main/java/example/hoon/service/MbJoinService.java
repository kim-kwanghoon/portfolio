package example.hoon.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.hoon.model.MbJoinDto;


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
