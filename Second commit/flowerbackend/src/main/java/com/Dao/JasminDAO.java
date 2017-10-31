package com.Dao;

import java.util.List;
import com.model.Jasmin;

public interface JasminDAO {
	
	
	public List<Jasmin> getAllJasmin();
	public Jasmin getJasmin(int ID);
	public Jasmin getJasminName(String Name);
	public void createJasmin(Jasmin jasmin);
	public void updateJasmin(Jasmin jasmin);
	public void deleteJasmin(Jasmin jasmin);
	
   	 
}