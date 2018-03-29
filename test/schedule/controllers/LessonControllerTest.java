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
import schedule.model.Lesson;

/**
 *
 * @author petro
 */
public class LessonControllerTest {
    
    public LessonControllerTest() {
    }
    
    @Test
    public void testGetAllLessons() {
        System.out.println("LessonController getAllLessons");
        LessonController instance = new LessonController();
        List<Lesson> result = instance.getAllLessons();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetLessonById() {
        System.out.println("LessonController getLessonById");
        int id = 2;
        LessonController instance = new LessonController();
        Lesson result = instance.getLessonById(id);
        assertTrue(result!=null && result.getId()==2);
    }
    
}
