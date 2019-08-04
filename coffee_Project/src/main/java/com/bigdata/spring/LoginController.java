package com.bigdata.spring;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bigdata.spring.member.service.StoreManageService;
import com.bigdata.spring.member.service.StoreManageServiceImpl;

@Controller
public class LoginController {
	
	@Inject
	StoreManageService storeManageService;

		@RequestMapping("login")
		public String moveToLoginPage() {
			System.out.println("login Request called");
			return "login";
		}
	
	   @RequestMapping("login_check.do")
	   public ModelAndView login_check(@RequestParam String id, String pwd,
	                     HttpSession session,
	                     ModelAndView mav) {

	      System.out.println("id : "+id);
	      System.out.println("pwd : "+pwd);
	      
	      
	      
	      String loginID = storeManageService.checkIdPwd(id,pwd);
	      if(loginID !=null) {
	         session.setAttribute("id",loginID);
	      }
	      if(loginID !=null) {
	         mav.setViewName("main");
	         // 이동할 경로를 적어줌
	      }else {
	         mav.setViewName("login");
	         mav.addObject("msg","error");
	         // 넘길 값을 넣어줌(key, value)
	      }
	      return mav;
	   }
	
} 
