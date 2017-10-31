package com.niit.controllers;
import java.util.List;
import org.h2.util.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.DaoImpl.RoseDAOImpl;
import com.model.Rose;

@Controller
public class RoseController {

	@Autowired
	RoseDAOImpl roseDAOImpl;

	@RequestMapping("/rose")
	public ModelAndView getAllRose()
	{
		 List<Rose>roselist=roseDAOImpl.getAllRose();
		  ModelAndView ss=new ModelAndView("rose","allrose",roselist);
		 
		 return ss;
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String createRose(@ModelAttribute("rose")Rose rose,Model m) {
		roseDAOImpl.createRose(rose);
		return "redirect:/rose";
	}	
	
	@RequestMapping(value="searchbyID",method=RequestMethod.POST)
	public ModelAndView searchbreadID(@ModelAttribute("rose")Rose rose,Model m) {
		Rose r=roseDAOImpl.getRose(rose.getID());
		return new ModelAndView("editrose","rose",r);
	}	
	
	@RequestMapping(value="searchbyName",method=RequestMethod.POST)
	public ModelAndView searchbreadName(@ModelAttribute("rose")Rose rose,Model m) {
		Rose r=roseDAOImpl.getRoseName(rose.getNAME());
		return new ModelAndView("showrose","rose",r);
	}
	
	
	@RequestMapping(value="/editroseid/{id}",method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id){  
		Rose r=roseDAOImpl.getRose(id);  
        System.out.println("====================================> rose name : "+r.getNAME());
        return new ModelAndView("editrose","rose",r);  
    }  
	
    /* It updates model object. */  
    @RequestMapping(value="editsave",method=RequestMethod.POST)  
    public ModelAndView editsavebread(@ModelAttribute("rose") Rose rose,Model m){  
    	System.out.println("---------------------->rose name after editing"+rose.getNAME());
    	  
    	roseDAOImpl.updateRose(rose);
    	 List<Rose>ll=roseDAOImpl.getAllRose();
		 ModelAndView mv=new ModelAndView("rose","allrose",ll);
		 return mv;
    	
    }  
	
	@RequestMapping(value="/deleterose/{id}")
	public ModelAndView delterose(@PathVariable int id) {
		Rose r=roseDAOImpl.getRose(id);
		roseDAOImpl.deleteRose(r);
		return new ModelAndView("redirect:/rose");
	}	
	
	

}
