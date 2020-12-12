package com.hangong.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	public int insertUser(UserVO vo) {
		return sqlSession.insert("User.insertUser",vo);
	}
	public int updateUser(UserVO vo) {
		return sqlSession.update("User.updateUser",vo);
	}
	public int deleteUser(int seq) {
		return sqlSession.delete("User.deleteUser",seq);
	}
	public UserVO getUser(int seq) {
		return sqlSession.selectOne("User.getUser",seq);
	}
	public List<UserVO> getUserList(){
		 
		return sqlSession.selectList("User.getUserList");
			
	
	}
}
