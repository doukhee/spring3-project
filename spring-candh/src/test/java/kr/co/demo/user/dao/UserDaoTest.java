package kr.co.demo.user.dao;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.demo.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDaoTest {
	
	@Resource(name = "userDao")
	private UserDao dao;

	@Before
	public void BeforeTest() {
		System.out.println("User Dao Test");
	}
	@Transactional
	@Test
	public void InsertUser() {
		System.out.println("User Insert Test");
		UserVO user = new UserVO();
		user.setEmail("test@co.kr");
		user.setPassword("test");
		user.setName("tester");
		if(dao.InsertUser(user)) {
			System.out.println("User Insert Success");
			
		}else {
			System.out.println("User Insert Failed");
		}
	}
	
	@Test
	public void RoleInsertDefaultTest() {
		System.out.println("User Role Default Insert Test");
		UserVO user = new UserVO();
		user.setEmail("test@co.kr");
		user.setPassword("test");
		user.setName("tester");
		if(dao.InsertUser(user)) {
			System.out.println("User Insert Success");
			if(dao.InsertRuleDefault(user.getEmail())) {
				System.out.println("User Role Insert Success");
			}else {
				System.out.println("User Role Insert Failed");
			}
		}else {
			System.out.println("User Insert Failed");
		} 
	}
	
	@Test
	public void FindUserObjTest() {
		System.out.println("User Find Test");
		UserVO user = new UserVO();
		user.setEmail("test@co.kr");
		user.setName("tester");
		user = dao.findByUserVO(user);
		if(user != null) {
			System.out.println(user.toString());
		}else {
			System.out.println("User is null");
		}
	}
	
	@Test
	public void FindUserAndRoleTest() {
		System.out.println("User Find And Role Test");
		UserVO user = new UserVO();
		user.setEmail("test@co.kr");
		user = dao.findByUserAndRole(user);
		if(user != null) {
			System.out.println(user.toString());
			System.out.println("Get User Role");
			user.getRoles().forEach(items->{
				System.out.println(items.toString());
			});
		}else {
			System.out.println("User is null");
		}
	}
	
	@Test
	public void UserInfoTest() {
		System.out.println("User Info Get By String email Test");
		
		String email = "test@co.kr";
		UserVO user = dao.UserInfo(email);
		if(user != null) {
			System.out.println(user.toString());
			user.getRoles().forEach(items->{
				System.out.println(items.toString());
			});
		}else {
			System.out.println("User is null");
		}
	}

}
