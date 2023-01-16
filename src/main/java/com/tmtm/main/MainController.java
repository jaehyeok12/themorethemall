package com.tmtm.main;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

	@GetMapping(value="/")
	public String main(Model model, HttpSession session) {
		
		return "login";
	}
	
	@GetMapping(value="/index.go")
	public String index(Model model) {
		model.addAttribute("page", "main");
		return "index";
	}
	
	@GetMapping(value="/{page}.go")
	public String innerPage(Model model, @PathVariable String page) {
		model.addAttribute("page", page);
		return "index";
	}
}
