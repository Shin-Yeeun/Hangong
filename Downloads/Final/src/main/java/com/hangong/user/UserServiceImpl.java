package com.hangong.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;
	
	
	

	@Override
	public int insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(vo);
	}


	@Override
	public int updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(vo);
	}


	@Override
	public int deleteUser(int seq) {
		// TODO Auto-generated method stub
		return userDAO.deleteUser(seq);
	}


	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return userDAO.getUserList();
	}

	public UserVO getUser(int seq) {
		// TODO Auto-generated method stub
		return userDAO.getUser(seq);
	}
}
