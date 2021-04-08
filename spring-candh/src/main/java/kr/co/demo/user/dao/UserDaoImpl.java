package kr.co.demo.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.demo.vo.UserLoginTimeVO;
import kr.co.demo.vo.UserRoleVO;
import kr.co.demo.vo.UserVO;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlSession session;

	@Override
	public boolean InsertUser(UserVO user) {
		// TODO Auto-generated method stub
		return session.insert("registeUser", user) == 1;
	}

	@Override
	public boolean InsertRuleDefault(String email) {
		// TODO Auto-generated method stub
		return session.insert("InsertRoleDefault", email) == 1;
	}

	@Override
	public boolean UserLoginTime(String email) {
		// TODO Auto-generated method stub
		return session.insert("InsertLoginTime", email) == 1;
	}

	@Override
	public UserVO loginUser(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findByUserVO(UserVO user) {
		// TODO Auto-generated method stub
		return session.selectOne("findUserByObj", user);
	}
	
	@Override
	public UserVO findByUserEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserVO findByUserAndRole(UserVO user) {
		// TODO Auto-generated method stub
		return session.selectOne("findUserByObjAndRole", user);
	}
	
	@Override
	public UserVO UserInfo(String user) {
		// TODO Auto-generated method stub
		return session.selectOne("findUserDetail", user);
	}
	
	@Override
	public boolean UpdateUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UserDelete(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InsertUserRole(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InsertLoginTime(UserLoginTimeVO time) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateUserAll(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateUserRole(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserLoginTimeVO> getLoginTimesbyUserVO(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserLoginTimeVO getLastLoginTime(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UserDeleteAdmin(UserVO email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UserDeleteList(List<UserVO> users, int user_length) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO userInfoAll(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
