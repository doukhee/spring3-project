package kr.co.demo.user.service;


import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.demo.user.vo.UserVO;


@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserServiceTest {
	
	@Inject
	@Named(value = "userService")
	private UserService service;

	@Before
	public void BoforeTest() {
		 System.out.println("User Service Test");
	}
	
	@Test
	public void SingInTest() {
		System.out.println("User Sign In Test");
		UserVO user = new UserVO();
		boolean flag = false;
		user.setEmail("service@co.kr");
		user.setName("test2");
		user.setPassword("1234");
		user.setPhone("01010101010");
		user.setAddress1("testeer");
		user.setAddress2("home");
		
		flag = service.RegisteUser(user);
		
		if(flag == true) {
			System.out.println("User Sign In Success");
		}else {
			System.out.println("User Sign In Failed");
		}
		
	}

	
	@Test
	public void UserInfoTest() {
		System.out.println("User Info Service Test");
		UserVO user = new UserVO();
		user.setEmail("test@co.kr");
		user = service.InfoUser(user);
		
		if(user != null) {
			System.out.println(user.toString());
			user.getRoles().forEach(role->{
				System.out.println(role.toString());
			});
		}
	}
}
