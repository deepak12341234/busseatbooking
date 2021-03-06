package com.pck.daoclasses;



import java.util.List;

import com.pck.bean.Signin;
import com.pck.bean.Signup_data;
import com.pck.bean.admin;


public interface daointerface {
	public void signup(Signup_data s);
	public void signin(Signin s);
	public void save(admin admin);
	public List<admin> getbuses(String arrival,String destination,String date);
	 public admin getbus(int busnumber);
}
