package com.niit.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.DaoImpl.RoseDAOImpl;
import com.DaoImpl.JasminDAOImpl;
import com.DaoImpl.LilyDAOImpl;
import com.model.Jasmin;
import com.model.Lily;
import com.model.Rose;
import org.springframework.ui.Model;


@Controller
public class IndexController {
   @Autowired
   RoseDAOImpl roseDAOImpl1;
   @Autowired
   JasminDAOImpl jasminDAOImpl1;
   @Autowired
   LilyDAOImpl lilyDAOImpl1;
   
   @RequestMapping("/")
   public String index() {
         return "index";
   }
   
   @RequestMapping("/receipt")
   public String gotoreceipt() {
         return "receipt";
   }
   
    
   @RequestMapping("/home")
   public String gotoHome() {
         return "home";
   }
   
   @RequestMapping("/aboutus")
   public String gotoAboutus() {
         return "aboutus";
   }
      
   @RequestMapping("/newrose")
   public ModelAndView gotonewrose() {
        ModelAndView mv=new ModelAndView("newrose","rose",new Rose());
        return mv;
   }
   
   @RequestMapping("/newjasmin")
   public ModelAndView gotonewjasmin() {
        ModelAndView mv=new ModelAndView("newjasmin","jasmin",new Jasmin());
        return mv;
   }
   
   @RequestMapping("/newlily")
   public ModelAndView gotonewlily() {
        ModelAndView mv=new ModelAndView("newlily","lily",new Lily());
        return mv;
   }
  
   @RequestMapping("/register")
   public String gotoRegister() {
         return "register";
   }
   
   @RequestMapping("/login")
   public String gotoLogin() {
         return "login";
   }
   @RequestMapping(value="searchbyAll",method=RequestMethod.POST)
	public ModelAndView searchall(@ModelAttribute("rose")Rose rose,Jasmin jasmin,Lily lily,Model m) {
		System.out.println(rose.getNAME());
		String n=rose.getNAME();
		Jasmin j = new Jasmin();
		 Rose r = new Rose();
		 Lily l = new Lily();
		 int flag=1;
		 int flag1=1;
		r = roseDAOImpl1.getRoseName(n);
		 
		 
		try{
			r.getNAME();
		}
		catch(NullPointerException e){
			
          	System.out.println("Not Found in Rose");
          	j= jasminDAOImpl1.getJasminName(n);
          	try{
          	 j.getNAME();	
          	}
          	catch(NullPointerException f){
          		System.out.println("Not Found in Jasmin Table");
    			l = lilyDAOImpl1.getLilyName(n);
    			                               try{
    			                            	   l.getNAME();
    			                               }
    			                               catch(NullPointerException h)
    			                               {
    			                            	   System.out.println("Not Found Anywhere");
    			                            	                   	   flag1=0;
    			                               }
    			                               finally{
    			                            	  if(flag1==1) 
    			                            	  {
    			                            		  r = roseDAOImpl1.setData(r.getID(), r.getNAME(), r.getDESCRIPTION(), r.getPRICE());
    			                          			  flag=0;
    			                            	  }
    			                            	  
    			                            	  if(flag1==0)
    			                            	  {
    			                            		  r=roseDAOImpl1.setData(0, "NOT FOUND", "NOT FOUND",0);
    			                            		  flag=0;
    			                            	  }
    			                               }
    			                               
    			
          	}
          	finally{
          		if(flag==1)
          		{
          			r =roseDAOImpl1.setData(j.getID(), j.getNAME(), j.getDESCRIPTION(), j.getPRICE());
          		}
          	}
          	

		}
				
		 		
		return new ModelAndView("showrose","rose",r);
	}// end of search all
   
   
      
}