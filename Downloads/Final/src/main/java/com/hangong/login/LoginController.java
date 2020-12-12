package com.hangong.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller

@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	CustomerServiceImpl service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value="/loginOK",method=RequestMethod.POST)
		public String loginCheck(HttpSession session,MemberVO vo) {
		String returnURL="";
		if(session.getAttribute("login")!=null) {
			session.removeAttribute("login");
		}
		
		MemberVO loginvo = service.getMember(vo);
		if(loginvo != null) {
			session.setAttribute("login", loginvo);
			returnURL="redirect:/product/productlist";
			System.out.println("로그인 성공 !");
		}else {
			System.out.println("로그인 실패!");
			returnURL = "redirect:/login/login";
		}
		return returnURL;
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login/login";
	}
}
