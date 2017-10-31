package com.niit.controllers;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImpl.ProductDAOImpl;
import com.DaoImpl.RoseDAOImpl;
import com.model.Product;


@Controller
public class ProductController 
  {
	@Autowired
	ProductDAOImpl productDAOImpl;
	@Autowired
	RoseDAOImpl roseDAOImpl;
	
	@RequestMapping(value="/addproductrose/{id}",method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id,HttpSession session,Model m){  
		Product product=new Product();
		String username=(String)session.getAttribute("username");
		product.setProductid(1001);
		product.setStatus("N");
		product.setUsername(username); 
		product.setUsername(product.getUsername());
		product.setPrice(product.getPrice());
		productDAOImpl.insertProduct(product);
		List<Product> list=productDAOImpl.retrive(username);
		m.addAttribute("productitems", list);
		return new ModelAndView("product","product",list);
    } 
	
	@RequestMapping(value="/deleteProductItem/{pitemid}",method=RequestMethod.GET)
	public ModelAndView deleteProductItem(@PathVariable("pitemid")int pitemid,HttpSession session,Model m)
	{
		System.out.println("hello");
		Product product=(Product)productDAOImpl.getProduct(pitemid);
		productDAOImpl.removeProduct(product);
		String username=(String)session.getAttribute("username");
		List<Product> list=productDAOImpl.retrive(username);
		return new ModelAndView("product","productitems",list);
		
	}
	
	@RequestMapping(value="/myproduct",method=RequestMethod.GET)
	public ModelAndView viewmyproduct(HttpSession session,Model m)
	{
		String username=(String)session.getAttribute("username");
		List<Product>list=productDAOImpl.retrive(username);
		return new ModelAndView("product","productitems",list);
		
	}


}
