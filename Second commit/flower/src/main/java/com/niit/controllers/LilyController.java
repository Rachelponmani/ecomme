package com.niit.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.Dao.LilyDAO;
import com.DaoImpl.RoseDAOImpl;
import com.DaoImpl.LilyDAOImpl;
import com.model.Lily;

@Controller
public class LilyController {

	@Autowired
	LilyDAOImpl lilyDAOImpl;

	@RequestMapping("/lily")
	public ModelAndView getAllUsers()
	{
		 List<Lily>ll=lilyDAOImpl.getAllLily();
		 ModelAndView ss=new ModelAndView("lily","alllily",ll);
		 return ss;
	}
	
	
	@RequestMapping(value="insertlily",method=RequestMethod.POST)
	public String createLily(@ModelAttribute("lily")Lily lily,Model m) {
		lilyDAOImpl.createLily(lily);
		return "redirect:/lily";
	}	
	
	@RequestMapping(value="searchbyLilyName",method=RequestMethod.POST)
	public ModelAndView searchroseName(@ModelAttribute("lily")Lily lily,Model m) {
		Lily l=lilyDAOImpl.getLilyName(lily.getNAME());
		System.out.println(l.getNAME());
		return new ModelAndView("showlily","jasmin",l);
	}
	
	@RequestMapping(value="/editlilyid/{id}",method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id){  
        Lily l=lilyDAOImpl.getLily(id);  
        System.out.println("====================================> rose namer : "+l.getNAME());
        return new ModelAndView("editlily","lily",l);  
    }  
	
    /* It updates model object. */  
    @RequestMapping(value="editsavelily",method=RequestMethod.POST)  
    public ModelAndView editsavejasmin(@ModelAttribute("jasmin")Lily lily,Model m){  
    	System.out.println("---------------------->rose name after editing"+lily.getNAME());
    	  
    	lilyDAOImpl.updateLily(lily);
    	 List<Lily>jasminlist=lilyDAOImpl.getAllLily();
		 ModelAndView mv=new ModelAndView("lily","alllily",jasminlist);
		 return mv;
    	
    }  
    
    @RequestMapping(value="/deletelily/{id}")
	public ModelAndView deltelily(@PathVariable int id) {
		 Lily l=lilyDAOImpl.getLily(id);
		lilyDAOImpl.deleteLily(l);
		return new ModelAndView("redirect:/lily");
	}
	
	
}
