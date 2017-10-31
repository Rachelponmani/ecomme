package com.Dao;

import java.util.List;
import com.model.Rose;


public interface RoseDAO {
	
	
	public List<Rose> getAllRose();
	public Rose getRose(int ID);
	public Rose getRoseName(String Name);
	public Rose getAllName(String Name);
	public void createRose(Rose rose);
	public void updateRose(Rose rose);
	public void deleteRose(Rose rose);
	public Rose setData(int iD, String nAME, String dESCRIPTION, float pRICE);
	
   	 
}