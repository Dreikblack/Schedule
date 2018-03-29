/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.model;

import schedule.model.Trainer;
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
public class TrainerTest {
    
    public TrainerTest() {
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
     * Test of equals method, of class Trainer.
     */
    @Test
    public void testCreateTrainer() {
        System.out.println("equals");
        
        Lesson lesson1 = new Lesson(1, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson2 = new Lesson(2, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        Lesson lesson3 = new Lesson(3, 1, 0, new Time(13,0,0), new Time(14,0,0), 1);
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(lesson1);
        lessonList.add(lesson2);
        lessonList.add(lesson3);
        
        Trainer trainer = new Trainer(1,"name",lessonList);
        
        assertEquals(trainer.getId(), 1);
        assertEquals(trainer.getName(), "name");
        assertTrue(trainer.getLesson().containsAll(lessonList) );
       
    }


    /**
     * Test of equals method, of class Trainer.
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
        
        Trainer trainer1 = new Trainer(1,"name",lessonList);
        Trainer trainer2 = new Trainer(1,"name",lessonList);
        Trainer trainer3 = new Trainer(3,"name",lessonList);
        
        assertTrue(trainer1.equals(trainer2));
        assertFalse(trainer2.equals(trainer3));
    }

}
