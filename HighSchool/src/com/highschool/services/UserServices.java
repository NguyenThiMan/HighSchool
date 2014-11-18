package com.highschool.services;

import java.util.List;

import com.highschool.model.User;
/**
 * 
 * @author NguyenThiMan
 *
 */

public interface UserServices {
	public List<User> getList(User user);
	public User insert(User user);
    public void delete(User user,String id);
    public void update();
    

}
