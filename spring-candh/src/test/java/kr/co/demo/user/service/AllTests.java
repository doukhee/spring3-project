package kr.co.demo.user.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({UserServiceTest.class, UserAdminServiceTest.class})
public class AllTests {

}
