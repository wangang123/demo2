package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findById")
	public @ResponseBody Map<String, Object> findUserById( String id) {
		Map<String, Object> retMap = new HashMap<String, Object>();

		try {
			Student user = userService.findUserById(id);
			
			retMap.put("data", user);
			retMap.put("result", true);
			retMap.put("message", "");
			return retMap;
		} catch (Exception e) {
			retMap.put("result", false);
			retMap.put("message", "系统内部错误！");
			return retMap;
		}
	}

	@RequestMapping(value="/findAll")
	public @ResponseBody Map<String, Object> findUserList() {
		Map<String, Object> retMap = new HashMap<String, Object>();

		try {
			List<Student> userList = userService.findUserList();
			
			retMap.put("data", userList);
			retMap.put("result", true);
			retMap.put("message", "");
			return retMap;
		} catch (Exception e) {
			retMap.put("result", false);
			retMap.put("message", "系统内部错误！");
			return retMap;
		}
	}


	
}
