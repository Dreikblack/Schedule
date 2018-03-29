/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.dal;

import schedule.dal.TrainerDal;
import java.util.List;
import schedule.model.Trainer;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainerDalTest {
    
    public TrainerDalTest() {
    }

    /**
     * Test of selectAll method, of class TrainerDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("TrainerDal selectAll");
        TrainerDal instance = new TrainerDal();
        List<Trainer> result = instance.selectAll();
       // System.out.println(result);
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class TrainerDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("TrainerDal selectById");
        int id = 1;
        TrainerDal instance = new TrainerDal();
        Trainer result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==1);
    }

    
    
}
