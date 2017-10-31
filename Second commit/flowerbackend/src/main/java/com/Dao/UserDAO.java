package com.Dao;
import java.util.List;

import com.model.Lily;
import com.model.User;

public interface UserDAO {

	public  List<User> getAllUser();
	public void insertUpdateUser(User user);
	public User getUserName(String Name);
	public void updateuser(User user);
}
