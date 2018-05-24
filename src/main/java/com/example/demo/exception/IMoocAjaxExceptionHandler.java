package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.pojo.IMoocJSONResult;

@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public IMoocJSONResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		System.out.println("defaultErrorHandler<<<<<<ajax<<<<<<<<<<<<<<");
		e.printStackTrace();
		return IMoocJSONResult.errorException(e.getMessage());
	}
}
