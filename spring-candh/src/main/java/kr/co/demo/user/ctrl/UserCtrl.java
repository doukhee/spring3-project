package kr.co.demo.user.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserCtrl {
	
	@GetMapping(value= {"/", ""})
	public String MainPage() {
		return "";
	}
	
	@GetMapping(value="/signup")
	public String RegistePage() {
		return"";
	}
	
	@PostMapping(value="/signup")
	public String RegisteDo() {
		return "";
	}
	
	@GetMapping(value="/info")
	public String UserInfoPage() {
		return "";
	}
	
	@PutMapping(value="/update")
	public String UserUpdateDo() {
		return "";
	}
	
	@DeleteMapping(value="/delete")
	public String UserDeleteDo() {
		return "";
	}

}
