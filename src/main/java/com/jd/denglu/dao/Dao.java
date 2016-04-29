package com.jd.denglu.dao;

import com.jd.denglu.modal.Users;

public interface Dao {

	public void adduser(Users users);
	public Users findByCellphone(String cellphone);
}
