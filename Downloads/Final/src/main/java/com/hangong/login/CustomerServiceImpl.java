package com.hangong.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl {
	@Autowired
	MemberDAO memberDAO;
	public MemberVO getMember(MemberVO vo) {
		return memberDAO.getMember(vo);
	}

}
