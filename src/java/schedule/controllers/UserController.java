/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.controllers;

import java.util.List;
import schedule.dal.UserDal;
import schedule.model.User;

public class UserController {
    protected UserDal userDal;
    public UserController() {
        userDal = new UserDal();
    }
    
    public List<User> getAllUsers()
    {
        return userDal.selectAll();
    }
    
    public User getUserById(int id)
    {
        return userDal.selectById(id);
    }
    
    public int insertUser(User user)
    {
        return userDal.insert(user);
    }
    
     public int updateUser(User user)
    {
        return userDal.update(user);
    }
    
    public int deleteUser(int id)
    {
        return userDal.delete(id);
    }
}
