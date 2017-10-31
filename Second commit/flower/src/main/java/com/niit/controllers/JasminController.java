package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImpl.JasminDAOImpl;
import com.model.Jasmin;

@Controller
public class JasminController {
	@Autowired
	JasminDAOImpl cakesDAOImpl;
	private JasminDAOImpl jasminDAOImpl;

	@RequestMapping("/jasmin")
	public ModelAndView getAllJasmin()
	{
		 List<Jasmin>ll=jasminDAOImpl.getAllJasmin();
		 ModelAndView ss=new ModelAndView("jasmin","alljasmin",ll);
		 return ss;
	}
	
	@RequestMapping(value="insertjasmin",method=RequestMethod.POST)
	public String createRose(@ModelAttribute("jasmin")Jasmin jasmin,Model m) {
		jasminDAOImpl.createJasmin(jasmin);
		return "redirect:/jasmin";
	}	
	
	/*@RequestMapping(value="searchbyIDjasmin",method=RequestMethod.POST)
	public ModelAndView searchbreadID(@ModelAttribute("jasmin")Jasmin jasmin,Model m) {
		Jasmin j=jasminDAOImpl.getJasmin(jasmin.getID());
		return new ModelAndView("editrose","rose",r);
	}*/	
	
	@RequestMapping(value="searchbyJasminName",method=RequestMethod.POST)
	public ModelAndView searchroseName(@ModelAttribute("jasmin")Jasmin jasmin,Model m) {
		JasminDAOImpl jasminDAOImpl = null;
		Jasmin jasmin1=jasminDAOImpl.getJasminName(jasmin.getNAME());
		System.out.println(jasmin1.getNAME());
		return new ModelAndView("showjasmin","jasmin",jasmin);
	}
	
	
	
	@RequestMapping(value="/editjasmsinid/{id}",method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id){  
		Jasmin j=jasminDAOImpl.getJasmin(id);  
        System.out.println("====================================> rose namer : "+j.getNAME());
        return new ModelAndView("editjasminid","jasmin",j);  
    }  
	
    /* It updates model object. */  
    @RequestMapping(value="editsavejasmin",method=RequestMethod.POST)  
    public ModelAndView editsavejasmin(@ModelAttribute("jasmin")Jasmin jasmin,Model m){  
    	System.out.println("---------------------->rose name after editing"+jasmin.getNAME());
    	  
    	jasminDAOImpl.updateJasmin(jasmin);
    	 List<Jasmin>jasminlist=jasminDAOImpl.getAllJasmin();
		 ModelAndView mv=new ModelAndView("jasmin","alljasmin",jasminlist);
		 return mv;
    	
    }  
	
	@RequestMapping(value="/deletejasmin/{id}")
	public ModelAndView delterose(@PathVariable int id) {
		Jasmin j=jasminDAOImpl.getJasmin(id);
		jasminDAOImpl.deleteJasmin(j);
		return new ModelAndView("redirect:/jasmin");
	}
	
}
