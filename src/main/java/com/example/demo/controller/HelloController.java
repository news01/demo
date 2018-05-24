//package com.example.demo.controller;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.pojo.old.GirlDomain;
//
//@RestController
//public class HelloController {
//	
//	@Autowired
//	private GirlDomain gilr; 
//
//	@RequestMapping(value = "/hello",method = RequestMethod.GET)
//	public String say(){
//		GirlDomain girlDomain = new GirlDomain();
//		BeanUtils.copyProperties(gilr, girlDomain);
//		
//		return girlDomain.toString();
//		
//	}
//}
