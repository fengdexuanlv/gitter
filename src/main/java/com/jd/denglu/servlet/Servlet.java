package com.jd.denglu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jd.denglu.dao.Dao;
import com.jd.denglu.exception.ValException;
import com.jd.denglu.modal.Register;
import com.jd.denglu.modal.Users;

@Service
public class Servlet {

	@Autowired
	public Dao dao;
	
	public void addUser(Register register) throws ValException
	{
		//1.手机号是否存在
		Users u=dao.findByCellphone(register.getCellphone());
		if (u!=null) {
			throw new ValException("手机号已经被注册");
		}
	//2.判断验证码是否正确
		if (!register.getVerifyCode().equals("8888")) {
			throw new ValException("验证码不正确");
		}
		//3.判断两次密码是否一致
		if (!register.getPassword().equals(register.getRePassword())) {
			throw new ValException("两次密码不一致");
		}
		
		Users users=new Users();
		users.setCellphone(register.getCellphone());
		users.setPassword(register.getPassword());
		users.setCellphoneAuth(false);
		users.setIdcardAuth(false);
		users.setNickName(register.getCellphone());
		dao.adduser(users);
	}
}
