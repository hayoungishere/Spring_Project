package com.bigdata.spring.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.spring.member.dao.MemberDAOImpl;
import com.bigdata.spring.member.vo.MemberVO;

@Service
@RequestMapping("member/*")
public class MemberService implements MemberServiceImpl {

	@Inject
	MemberDAOImpl memberDAO;
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return memberDAO.memberList();
	}

	@Override
	public void insertMember(MemberVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO viewMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
