package com.bigdata.spring.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model model) {
		
		model.addAttribute("msg","메인화면 입니다.");
		
		// /WEB-INF/views/main.jsp
		return "main";
		
	}
	
}
