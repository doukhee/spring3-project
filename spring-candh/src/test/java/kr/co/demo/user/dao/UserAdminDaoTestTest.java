package kr.co.demo.user.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserAdminDaoTestTest {

	@Before
	public void BeforeTest() {
		System.out.println("Admin User Dao Test");
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
