package com.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.RegisterService;

@Controller
public class LoginController {

	@Autowired
	RegisterService rs;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/login")
	public String viewLogin() {

		System.out.println("login called");
		return "login";
	}

	@RequestMapping(path = "/dologin", method = RequestMethod.POST)
	public String loginuser(@RequestParam("lemail") String uname, @RequestParam("lpassword") String upassword,
			Model m) {
		List<com.Models.Register> list = rs.getAllUserData();
		Iterator<com.Models.Register> itr = list.iterator();
		while (itr.hasNext()) {
			com.Models.Register userData = itr.next();
			if (userData.getEmail().equals(uname) && userData.getPassword().equals(upassword)) {
				m.addAttribute("loginmsg", "Login Successfully");
				m.addAttribute("usermail", uname);
				HttpSession session = request.getSession();
				session.setAttribute("username", userData.getName());
				return "index";
			}

		}
		m.addAttribute("loginfail", "Invalid email & Password, Please try again");
		return "login";
	}

	@RequestMapping(path = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
}