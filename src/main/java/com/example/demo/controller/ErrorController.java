package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.IMoocJSONResult;
import com.example.demo.pojo.SysUser;
import com.example.demo.service.UserService;


@Controller
@RequestMapping("err")
public class ErrorController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/error")
	public String error() {
		System.out.println("error<<<<<<<<<<<<<<<<<<<");
		
		int a = 1 / 0;
		
		return "thymeleaf/error";
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		
		return "thymeleaf/ajaxerror";
	}
	
	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public IMoocJSONResult getAjaxerror() {
		System.out.println("getAjaxerror<<<<<<<<<<<<<<");
		
		int a = 1 / 0;
		
		return IMoocJSONResult.ok();
	}
	
	
	@RequestMapping(value = "/getAllSysuser", method = RequestMethod.GET)
	@ResponseBody
	public IMoocJSONResult getAllSysuser() {
		List<SysUser> list = userService.getAllSysuser();
		for (SysUser sysUser : list) {
			System.out.println(sysUser.toString());
		}

		return IMoocJSONResult.ok(userService.getAllSysuser());
	}
}