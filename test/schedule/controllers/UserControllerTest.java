/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.controllers;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import schedule.model.User;

/**
 *
 * @author petro
 */
public class UserControllerTest {
    
    public UserControllerTest() {
    }
    
    @Test
    public void testGetAllUsers() {
        System.out.println("AdminController getAllAdmin");
        UserController instance = new UserController();
        List<User> result = instance.getAllUsers();
        assertTrue(result!=null && result.size()>0);
    }

 
    @Test
    public void testGetUserById() {
        System.out.println("AdminController getAdminById");
        int id = 2;
        UserController instance = new UserController();
        User result = instance.getUserById(id);
        assertTrue(result!=null && result.getId()==2);
    }
    
}
