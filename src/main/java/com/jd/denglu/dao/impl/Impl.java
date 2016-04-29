package com.jd.denglu.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.jd.denglu.dao.Dao;
import com.jd.denglu.modal.Users;

@Repository
public class Impl  implements Dao{

	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public void adduser(Users users) {
		String sqlString="insert into useraccount(cellphone,password,cellphoneAuth,idcardAuth,nickName) values(?,?,?,?,?);";
		Object[] params=new Object[]{users.getCellphone(),users.getPassword(),users.isCellphoneAuth(),users.isIdcardAuth(),users.getNickName()};
	   jdbcTemplate.update(sqlString, params);
	}

	@Override
	public Users findByCellphone(String cellphone) {
		String sql="select * from useraccount where cellphone=?;";
		Object[] params=new Object[]{cellphone};
		final Users users=new Users();
		
		jdbcTemplate.query(sql, params, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
			users.setUserId(rs.getInt("userId"));
			users.setCellphone(rs.getString("cellphone"));
			users.setCellphoneAuth(rs.getBoolean("cellphoneAuth"));
			users.setIdcardAuth(rs.getBoolean("idcardAuth"));
			users.setNickName(rs.getString("nickName"));
			users.setPassword(rs.getString("password"));
			users.setSessionId(rs.getString("sessionId"));
				
			}
			
		});
		if (users.getUserId() <= 0) {
			return null;
		}
		return users;
	}
	
}
