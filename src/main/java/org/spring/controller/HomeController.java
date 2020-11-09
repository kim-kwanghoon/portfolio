package org.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.spring.model.MbJoinDto;
import org.spring.service.MbJoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	MbJoinService service;

	@RequestMapping(value = "/main.com", method = RequestMethod.GET)
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/about.com", method = RequestMethod.GET)
	public String aboutPageMove() {
		return "about";
	}

	@RequestMapping(value = "/portfoilo.com", method = RequestMethod.GET)
	public String portfoiloPageMove() {
		return "portfoilo";
	}

	@RequestMapping(value = "/contact.com", method = RequestMethod.GET)
	public String contactPageMove() {
		return "contact";
	}

	@RequestMapping(value = "/mb_join.com", method = RequestMethod.GET)
	public String mbJoinPageMove() {
		return "mb_join";
	}

	@RequestMapping(value = "/mb_join_insert.com", method = RequestMethod.POST)
	public String mb_join_insert(MbJoinDto mbJoinDto) {
		service.mbJoin(mbJoinDto);
		return "login";
	}

	@RequestMapping(value = "/mb_login.com", method = RequestMethod.POST)
	public ModelAndView mblogin(String mail, String pass, HttpSession session) {
		ModelAndView mav = new ModelAndView("main");
		Map<String, String> loginMap = service.mbLogin(mail);
		if (loginMap == null) {
			mav.addObject("check", 0);
			mav.setViewName("login");
		} else if (!loginMap.get("pass").equals(pass)) {
			mav.addObject("check", 1);
			mav.setViewName("login");
		} else {
			session.setAttribute("mail", mail);
			mav.setViewName("main");
		}
		return mav;
	}

}
