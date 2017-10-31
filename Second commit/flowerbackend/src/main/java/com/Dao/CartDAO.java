package com.Dao;

import java.util.List;
import com.model.*;

public interface CartDAO {
	
	
	public void insertCart(Cart cart);
	public Cart getCart(int citemid);
	public List<Cart> retrive(String username);
	public void removeCart(Cart cart);
	public void updateCart(Cart cart);
	public Cart getnCartID(String username);
	
   	 
}