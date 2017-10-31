package com.Dao;

import java.util.List;
import com.model.*;

public interface OrderDAO 
   {
	public void insertOrder(OrderDetails order);
	public List<OrderDetails> retrieveOrders(String username);

}
