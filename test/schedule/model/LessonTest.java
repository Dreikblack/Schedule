/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.model;

import java.sql.Time;
import schedule.model.Lesson;
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
public class LessonTest {
    
    public LessonTest() {
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
     * Test of equals method, of class Lesson.
     */
    @Test
    public void testCreateLesson() {
       System.out.println("test create");
       Lesson lesson = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        
       assertEquals(lesson.getId(), 1);
       assertEquals(lesson.getIdGroup(), 1);
       assertEquals(lesson.getDay(), 0);
       assertEquals(lesson.getTimeStart(), new Time(13,0,0));
        assertEquals(lesson.getTimeEnd(), new Time(14,0,0));
       assertEquals(lesson.getIdTrainer(), 1);
    }
    
   
    /**
     * Test of equals method, of class Lesson.
     */
    @Test
    public void testEquals() {
        System.out.println("test equals");
       
        Lesson lesson1 = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson2 = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson3 = new Lesson(2, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
    
         assertTrue(lesson1.equals(lesson2));
         assertFalse(lesson1.equals(lesson3));
    }
}
