package kr.co.demo.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.demo.user.dao.UserDao;
import kr.co.demo.user.vo.UserLoginTimeVO;
import kr.co.demo.user.vo.UserRoleVO;
import kr.co.demo.user.vo.UserVO;
import kr.co.demo.util.Criteria;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name = "userDao")
	private UserDao dao;
	
	@Override
	@Transactional
	public boolean RegisteUser(UserVO user) {
		// TODO Auto-generated method stub
		if(dao.InsertUser(user) == true) {
			if(dao.InsertRuleDefault(user.getEmail()) == true) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean UpdateUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUser(UserVO user) {
		// TODO Auto-generated method stub
		return dao.UserDelete(user);
	}

	@Override
	public UserVO InfoUser(UserVO user) {
		// TODO Auto-generated method stub
		return dao.UserInfo(user);
	}

	@Override
	public UserVO findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findUserByObj(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public UserVO LoginUser(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * Admin Function 
	 * 
	 */

	@Override
	public List<UserVO> pagingUser(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean RoleAdd(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UserRoleDelete(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserLoginTimeVO> getUserLoginTime(UserLoginTimeVO loginTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserLoginTimeVO> getUserLoginTime(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UserDeleteList(List<UserVO> users, int length) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
