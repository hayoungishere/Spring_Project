package com.bigdata.spring.member.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.spring.member.service.MemberServiceImpl;

@Controller
@RequestMapping("member/*")
public class MemberController {
	
	@Inject
	MemberServiceImpl memberService;
	
	@RequestMapping(value="memberlist.do", method=RequestMethod.GET)
	public String memberlist(Model model) {
		model.addAttribute("mlist",memberService.memberList());
		return "member/member_list";
	}
	/*
	 * @RequestMapping(value="member/memberWrite.do", method=RequestMethod.GET)
	 * public String memberWrite() {
	 * 
	 * return "member/member_list"; }
	 */
}
