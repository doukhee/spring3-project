package kr.co.demo.user.dao;



import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.demo.user.vo.UserRoleEnum;
import kr.co.demo.user.vo.UserRoleVO;
import kr.co.demo.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserAdminDaoTest {
	
	@Inject
	@Named(value = "userDaoAdmin")
	private UserDao dao;

	@Before
	public void BeforeTest() {
		System.out.println("Admin User Dao Test");
	}

	@Test
	public void InsertRoleTest() {
		System.out.println("Admin User Role Add Test");
		UserVO user = new UserVO();
		UserRoleVO roles = new UserRoleVO();
		user.setEmail("test@co.kr");
		roles.setUser(user);
		roles.setRole(UserRoleEnum.ADMIN.getRoleName());
		
		if(dao.InsertUserRole(roles)) {
			System.out.println("User Role Insert Success");
		}else {
			System.out.println("User Role Insert Failed");
		}
	}
}
