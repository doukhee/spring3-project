package kr.co.demo.user.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/user")
public class UserAdminCtrl {

	@GetMapping(value= {"","/"})
	public String MainPage() {
		return "redirect:/admin/user/list";
	}
	
	@GetMapping(value="/list")
	public String ListPage() {
		return "admin/user/listPage";
	}
	
	@GetMapping(value="/detail")
	public String DetailPage() {
		return "";
	}
	
	@DeleteMapping(value = "/delete")
	public String DeleteDo() {
		return "";
	}
	
	@DeleteMapping(value = "/deleteList")
	public String DeleteListDo() {
		return "";
	}
	
	@PutMapping(value = "/update")
	public String UpdateDo() {
		return "";
	}
	
	
	
}
