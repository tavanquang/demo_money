package com.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String login(Model model, 
			@RequestParam(name = "e", required = false) String error) {

		model.addAttribute("e", error);

		return "admin/login";
	}
	
	@GetMapping(value = "/home")
	public String home(Model model) {

		return "client/home";
	}

}
