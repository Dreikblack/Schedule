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
import schedule.model.Group;

/**
 *
 * @author petro
 */
public class GroupControllerTest {
    
    public GroupControllerTest() {
    }
    
    @Test
    public void testGetAllGroups() {
        System.out.println("GroupController getAllGroups");
        GroupController instance = new GroupController();
        List<Group> result = instance.getAllGroups();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetGroupById() {
        System.out.println("GroupController getGroupById");
        int id = 2;
        GroupController instance = new GroupController();
        Group result = instance.getGroupById(id);
        assertTrue(result!=null && result.getId()==2);
    }
}
