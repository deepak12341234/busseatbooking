package com.pck.mvctiles;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pck.bean.Search;
import com.pck.bean.Signin;
import com.pck.bean.Signup_data;
import com.pck.bean.admin;
import com.pck.bean.seat;
import com.pck.empservice.Serviceimpl;

@Controller

public class hellocontroler {
	
	
	  @Autowired 
	  
	  private Serviceimpl sr;
	 
	@RequestMapping("/")
	public String helloworld(Model m) {
		//String message="helloWorld,springmvc";
		 m.addAttribute("command", new Signup_data());  
		
		 
		return "hello";
		
	}
	 
	@RequestMapping("/signup")
	 public String signup(@Valid @ModelAttribute("command") Signup_data s ,BindingResult result,ModelMap model,HttpSession session) {
		// model.addAttribute("command", new Signup_data()); 
		
     if(result.hasErrors()) {
    	 
    	 return "hello";
     }
        model.addAttribute("name", s.getEmail());
        model.addAttribute("password", s.getPassword());  
        String email=s.getEmail();
        session.setAttribute("user1",email);
       boolean isValid= sr.findUser(s);
       if(isValid)
       {
    	  model.addAttribute("message","User already exist");
    	   return "hello";
       }else {
    	   sr.signup(s);
    	  
    	   return "userpage";
       }
       
	}
	
	@RequestMapping("/signin")
	
	 public String signin(@ModelAttribute("command") Signin s ,BindingResult result,ModelMap model,HttpSession session) {
		// model.addAttribute("command", new Signup_data()); 
	    
		//model.addAttribute("command", new Contact()); 
		
        String mail=s.getEmail();
        session.setAttribute("user",mail);
       boolean isValid1= sr.validateuser(s);
       if(isValid1)
       {
        return "userpage";
       }
       else if(s.getEmail().equals("admin")&&s.getPassword().equals("admin")) {
           return "adminpage";
       }
    	   
      
       else {
    	   model.addAttribute("command", new Signin());
    	   model.addAttribute("signmessage","User or password wrong ");
    	   return "hello";
       }
       
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST/*consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}*/)
	public String Save(@ModelAttribute("admin") admin admin,Model model,BindingResult result/* @RequestParam CommonsMultipartFile[] fileUpload*/) {
		 model.addAttribute("command", new admin());
		 model.addAttribute("command", new Signin());
		model.addAttribute("msg","successfull saved");
		
		
		  admin.setRemaining_seat(admin.getSeat());
		  sr.save(admin);
		  
		return "adminpage";
		
		
	}
	
			@RequestMapping("/search")
			public String Search1(@ModelAttribute("command") Search s ,BindingResult result,ModelMap model) {
				
			  
			     model.addAttribute("s", s);
			     
		         List<admin> l= sr.getbuses(s.getArriving_palace(),
		        		 s.getDestination_palace(),s.getDate());
		          
		         model.addAttribute("l", l);
				return "result";
				
			}
			 @RequestMapping(value="/send/{bus_number}")    
			    public String edit( @PathVariable int bus_number, Model m,HttpSession session){ 
				 String name=(String)session.getAttribute("user");
				 String name1=(String)session.getAttribute("user1");
				 m.addAttribute("command", new seat());
		 
				 System.out.println(name);
				 if(name!=null ||name1!=null) { 
				     
					 session.setAttribute("busnumber", bus_number);
				
             return "redirect:/bookbus";
				
			    } 
		
				 else {
					 m.addAttribute("command", new Signin());
					
					 return "redirect:/hello";
				 }
			 }
			 @GetMapping("/hello")
				public String hello(Model m) {
				 m.addAttribute("command", new Signin());
				 m.addAttribute("a","plese sign in before booking");
					  return "hello";
				}
				@GetMapping("/bookbus")
				public String bookbus(@ModelAttribute("command")seat seat,Model m,HttpSession session) {

					int busnumber=(Integer)session.getAttribute("busnumber");
					System.out.println(busnumber);
					 
				    admin a=sr.getbus(busnumber);
				    m.addAttribute("a",a);
			        int b= a.getDistace();
			        System.out.println(b);
	                int x=(b*3)/10;
	                System.out.println(x);
	               m.addAttribute("x",x);
	     			  return "bookbus";
				}
				
				@SuppressWarnings({ "unchecked", "rawtypes" })
				@RequestMapping("/adddetailandpayment")
				
				 public String adddetailandpayment(@ModelAttribute("command")  seat s ,BindingResult result,ModelMap model,HttpSession session) {
					 
					
					
					int busnumber=(Integer)session.getAttribute("busnumber");
					s.setId(busnumber);
				    String userid=(String)session.getAttribute("user");
					 String userid1=(String)session.getAttribute("user1");
					 if(userid!=null) { 
						 s.setUserid(userid);
					 }
					 else {
						 s.setUserid(userid1);
					 }
					 sr.insert(s);
				  
					
					 model.addAttribute("s", s);
					 
					 
				    int fs=	s.getFemaleseat();
				    int ms=	s.getMaleseat();
				    
				    
				    admin a=sr.getbus(busnumber);
				    model.addAttribute("a", a);
			        
			        int rseat= a.getRemaining_seat();
			        
			        
					int booked=  fs     +         ms;
					
					if(booked<=rseat) {
					int b= a.getDistace();
			        System.out.println(b);
	                int x=((b*3)/10)*booked;
					model.addAttribute("ticket", x);
					int i;
					int[] array = new int[rseat+2];
					for( i=1;i<=rseat;i++) {
						
					array[i]=i;
					System.out.println(array[i]);
					}
					List listA = new ArrayList();
					int i1 = 0;
					for(int f=1;f<=booked;f++) {
						listA.add(rseat);
					
					    rseat=rseat-1;
					
					System.out.println("hello"+listA);
					}
					
				//	List l=array1[i1];
					model.addAttribute("l", listA);
					
				    rseat=rseat-booked;
				    
				    a.setRemaining_seat(rseat);
				    sr.update_remain(a);
					System.out.println(rseat);
					return "finalprint";
					}
					else {
						model.addAttribute("msg", "seat should be less then remaining seat");
						return "bookbus";
					}
					
				}
				
				@GetMapping("/logout")
				public String logout(HttpSession session ) {
					  if(session.getAttribute("user") != null||session.getAttribute("user1")!=null){
				            session.removeAttribute("user");
				            session.removeAttribute("user1");
				}
					  return "redirect:/";
				}
}
				 

				

