/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.dal;

import schedule.dal.LessonDal;
import java.util.List;
import schedule.model.Lesson;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class LessonDalTest {
    
    public LessonDalTest() {
    }

    /**
     * Test of selectAll method, of class LessonDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("LessonDal selectAll");
        LessonDal instance = new LessonDal();
        List<Lesson> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }
    /**
     * Test of selectById method, of class LessonDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("LessonDal selectById");
        int id = 1;
        LessonDal instance = new LessonDal();
        Lesson result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==1);
    }

   
    
}
