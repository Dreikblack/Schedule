/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.model;

import schedule.model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testCreteUser() {
        System.out.println("test create");

        User user = new User(1,"user","password");
        assertEquals(user.getId(), 1);
        assertEquals(user.getLogin(), "user");
        assertEquals(user.getPassword(), "password");
        
        user.setId(2);
        assertEquals(user.getId(), 2);
        
        user.setLogin("user2");
        assertEquals(user.getLogin(), "user2");
        
        user.setPassword("p2");
        assertEquals(user.getPassword(), "p2");
    }

     /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
         User user1 = new User(1,"user1","password1");
         User user2 = new User(1,"user1","password1");
         User user3 = new User(2,"user1","password1");

         assertTrue(user1.equals(user2));
         assertFalse(user1.equals(user3));
         
         
         User user4 = new User(1,"user4","password1");
         User user5 = new User(1,"user1","password5");
         
         assertFalse(user1.equals(user4));
         assertFalse(user1.equals(user5));
    }
 
}
