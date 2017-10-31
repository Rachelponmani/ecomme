package com.Dao;

import java.util.List;
import com.model.Product;

public interface ProductDAO 
 {
	
	public void insertProduct(Product product);
	public Product getProduct(int pitemid);
	public List<Product> retrive(String username);
	public void removeProduct(Product product);
	public void updateProduct(Product product);
	public Product getnProductID(String username);

}
