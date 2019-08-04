package com.bigdata.spring.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bigdata.spring.member.vo.MembershipVO;

@Repository
public class MembershipDAO implements MembershipDAOImpl {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MembershipVO> memberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MembershipVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MembershipVO viewMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updaeMember(MembershipVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pwd", pwd);
		return sqlSession.selectOne("membership.login_check",map);
		                             //namespace.id
	}

	

}
