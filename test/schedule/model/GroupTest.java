/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.model;

import schedule.model.Group;
import schedule.model.Lesson;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Time;

/**
 *
 * @author Alex
 */
public class GroupTest {
    
    public GroupTest() {
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
     * Test of equals method, of class Group.
     */
    @Test
    public void testCreateGroup() {
        System.out.println("equals");
        
        Lesson lesson1 = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson2 = new Lesson(2, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson3 = new Lesson(3, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(lesson1);
        lessonList.add(lesson2);
        lessonList.add(lesson3);
        
        Group group = new Group(1,"name","place",lessonList);
        
        assertEquals(group.getId(), 1);
        assertEquals(group.getName(), "name");
        assertEquals(group.getPlace(), "place");
        //todo error equels
        assertTrue(group.getLesson().containsAll(lessonList) );
       
    }


    /**
     * Test of equals method, of class Group.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
       
        Lesson lesson1 = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson2 = new Lesson(2, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson3 = new Lesson(3, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(lesson1);
        lessonList.add(lesson2);
        lessonList.add(lesson3);
        
        Group group1 = new Group(1,"name","place",lessonList);
        Group group2 = new Group(1,"name","place",lessonList);
        Group group3 = new Group(3,"name","place",lessonList);
        
        assertTrue(group1.equals(group2));
        assertFalse(group2.equals(group3));
    }

}
