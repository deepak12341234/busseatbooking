package com.pck.daoclasses;




import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pck.bean.Signin;
import com.pck.bean.Signup_data;
import com.pck.bean.admin;
import com.pck.bean.seat;
import com.pck.daoclasses.daointerface;
@Repository
public class Daoimpl implements daointerface{
  //  Transaction txn = null;

    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public void signup(Signup_data s) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(s);
		//txn.commit();
}

	@Override
	public void signin(Signin s) {
		//Session session=sessionFactory.getCurrentSession();
		//session.saveOrUpdate(s);
		
	}




	@Override
	public void save(admin admin) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(admin);
		
	}




	@Override
	public List<admin> getbuses(String arrival, String destination,String date) {
		Session session=sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		TypedQuery<admin> qry = session.createQuery("from admin a where a.arrival_place= ? and a.dest_place=? and a.date=?");
	       qry.setParameter(0,arrival);
	       qry.setParameter(1 ,destination);
	       qry.setParameter(2 ,date);
		List<admin> l =qry.getResultList();
		System.out.println("Total Number Of Records : "+l.size());
		return l;
	}
	



	@Override
	public admin getbus(int bus_number) {
		Session session=sessionFactory.getCurrentSession();
		
		return session.get(admin.class, bus_number);
	}
	public void update_remaining(admin a) {
		Session session=sessionFactory.getCurrentSession();
		
		 session.update(a);
	}



  public seat insert_seat(seat s) {
	  
	  Session session=sessionFactory.getCurrentSession();
	  
	  session.save(s);
	  return s;
  }

	

}
