package com.bigdata.spring.member.dao;

import java.util.List;

import com.bigdata.spring.member.vo.MemberVO;

public interface MemberDAOImpl {
	public List<MemberVO> memberList();
	public void insertMember(MemberVO mvo);
	public MemberVO viewMember(String name);
	public void deleteMember(String no);
	public void updateMember(MemberVO mvo);
	public boolean checkIdPwd(String id, String pwd);
	
}
