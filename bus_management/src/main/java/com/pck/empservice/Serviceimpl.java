package com.pck.empservice;



import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pck.bean.Signin;
import com.pck.bean.Signup_data;
import com.pck.bean.admin;
import com.pck.bean.seat;
import com.pck.daoclasses.Daoimpl;
@Service
@Transactional
public class Serviceimpl implements Empservice{
	 @Autowired
	    private Daoimpl bus_service;

	    @Autowired
	    private SessionFactory sessionFactory;
	   
	  @Transactional
	@Override
	
	public void signup(Signup_data s) {
		  bus_service.signup(s);
	
	}
	  
	 
	  Signup_data s1;
	@SuppressWarnings("rawtypes")
	public boolean findUser(Signup_data sd) {
		String email=sd.getEmail();
		
			 boolean isValidUser = false;
			 Session session=sessionFactory.getCurrentSession();
			
			org.hibernate.query.Query qry = session.createQuery("from Signup_data s");

				List l =qry.list();
				System.out.println("Total Number Of Records : "+l.size());
				Iterator it = l.iterator();

				while(it.hasNext())
				{
					Object o = (Object)it.next();
					 s1 = (Signup_data)o;
					

			 try {
		           String email1=s1.getEmail();
		            if(email1.equals(email)) {
		                 isValidUser = true;
		            }
		        } catch(Exception e) {
		            isValidUser = false;
		            }
				}
		        return isValidUser;
		    }

	@SuppressWarnings("rawtypes")
	public boolean validateuser(Signin sd) {
		String email=sd.getEmail();
		String password=sd.getPassword();
			 boolean isValidUser = false;
			 Session session=sessionFactory.getCurrentSession();
			
			org.hibernate.query.Query qry = session.createQuery("from Signup_data s");
          
				List l =qry.list();
				System.out.println("Total Number Of Records : "+l.size());
				Iterator it = l.iterator();
				

				while(it.hasNext())
				{
					Object o = (Object)it.next();
					 s1 = (Signup_data)o;
					

			 try {
		           String email1=s1.getEmail();
		           String Password=s1.getPassword();
		            if(email1.equals(email)&& Password.equals(password)) {
		                 isValidUser = true;
		            
		            }
		            else {
		            	isValidUser = false;
		            }
		           
		            
		        } catch(Exception e) {
		            isValidUser = false;
		            }
				}
		        return isValidUser;
		    }

	@Override
	@Transactional
	public void save(admin admin) {
		// TODO Auto-generated method stub
		bus_service.save(admin);
	}

	@Override
	@Transactional
	public List<admin> getbuses(String arrival, String destination,String date) {
		// TODO Auto-generated method stub
		return bus_service.getbuses(arrival, destination,date);
	}

	@Override
	@Transactional
	public admin getbus(int busnumber) {
		return bus_service.getbus(busnumber);

	}
	@Transactional
	public seat insert(seat s1) {
		
		return bus_service.insert_seat(s1);
	}
	@Transactional
	public void update_remain(admin a) {
		
		 bus_service.update_remaining(a);
	}
	  


}
