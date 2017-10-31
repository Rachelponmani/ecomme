package com.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Component
public class Product implements Serializable
   {
	@Id
	int pitemid;
	int productid,quantity;
	float price;
	String username,status;

	public int getPitemid() {
		return pitemid;
	}
	public void setPitemid(int pitemid) {
		this.pitemid = pitemid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
