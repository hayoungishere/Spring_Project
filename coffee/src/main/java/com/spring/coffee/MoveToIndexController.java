package com.spring.coffee;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoveToIndexController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("index")
		public String spring(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//request.setAttribute 같은의미
		model.addAttribute("serverTime", formattedDate );
		
		//model을 가지고 prefix+"home"+suffix로 보내라 
		return "index";
		///prefix+"home"+suffix
		}
}
