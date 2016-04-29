package com.jd.denglu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jd.denglu.modal.Register;
import com.jd.denglu.modal.Result;
import com.jd.denglu.servlet.Servlet;


@RestController
public class Controller {

	@Autowired
	public Servlet servlet;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Result addUserAndView(Register register)
	{
		
		try {
			servlet.addUser(register);
		} catch (Exception e) {
			return Result.fail(e.getMessage());
		}
		return Result.success("恭喜您注册成功！", null);
	}
	
}
