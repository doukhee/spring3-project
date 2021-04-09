package kr.co.demo.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.demo.user.vo.UserLoginTimeVO;
import kr.co.demo.user.vo.UserRoleVO;
import kr.co.demo.user.vo.UserVO;
import kr.co.demo.util.Criteria;

@Repository(value = "userDaoAdmin")
public class UserDaoAdminImpl implements UserDao{

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
		return null;
	}

	@Override
	public UserVO findByUserEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findByUserAndRole(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO UserInfo(String user) {
		// TODO Auto-generated method stub
		return null;
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
	public boolean InsertLoginTime(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean InsertUserRole(UserRoleVO role) {
		// TODO Auto-generated method stub
		return session.insert("userRoleInsertAdmin", role) == 1;
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
	public UserVO userInfoAll(UserVO user) {
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
	public List<UserVO> getPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectList("PagingUser", cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectOne("getTotalCount");
	}

	@Override
	public UserVO UserInfo(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
