//package com.example.demo.controller;
//
//import java.util.Date;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.pojo.old.GirlDomain;
//import com.example.demo.pojo.old.User;
//import com.example.demo.utils.JsonUtils;
//
//@RestController
//public class UserController {
//
//	@RequestMapping(value = "/toUser", method = RequestMethod.GET)
//	public String showUser(User user) {
//		user.setAge(18);
//		user.setBirthday(new Date());
//		user.setDesc("第一个用户");
////		user.setName("news");
//		user.setAge(123456);
//		String result = JsonUtils.objectToJson(user);
//		return new GirlDomain().toString();
//	}
//}
