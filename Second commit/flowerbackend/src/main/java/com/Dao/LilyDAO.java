package com.Dao;

import java.util.List;
import com.model.Lily;

public interface LilyDAO {
	
	
	public List<Lily> getAllLily();
	public Lily getLily(int ID);
	public Lily getLilyName(String Name);
	public void createLily(Lily lily);
	public void updateLily(Lily lily);
	public void deleteLily(Lily lily);
	
   	 
}