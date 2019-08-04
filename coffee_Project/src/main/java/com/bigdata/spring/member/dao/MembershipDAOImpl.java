package com.bigdata.spring.member.dao;

import java.util.List;

import com.bigdata.spring.member.vo.MembershipVO;

public interface MembershipDAOImpl {
	public List<MembershipVO> memberList();
	public void insertMember(MembershipVO mvo);
	public MembershipVO viewMember(String name);
	public void deleteMember(String no);
	public void updaeMember(MembershipVO mvo);
	public String checkIdPwd(String id, String pwd);
}
