package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.RegisterService;

@Controller
public class Register {
	@Autowired
	private RegisterService rs;

	@RequestMapping("/register")
	public String showRegister() {
		System.out.println("Register called");
		return "register";

	}

	@RequestMapping(path = "/doregister", method = RequestMethod.POST)
	public String handlereg(@ModelAttribute com.Models.Register reg,@RequestParam("email") String email, Model m) {
		
		List<com.Models.Register> userList = rs.getAllUserData();
		
		for (com.Models.Register user: userList) {
			 if (!user.getEmail().equals(email)) {
				 int id = this.rs.createUser(reg);
			 m.addAttribute("succesmsg","User Registerd Sucessfully!");
			 return "login";
			}
		 }
		m.addAttribute("alreadyReg", "You are already register! Try Again with different email");
		return "register";
	}


}
