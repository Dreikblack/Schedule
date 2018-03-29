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
import schedule.model.Trainer;

/**
 *
 * @author petro
 */
public class TrainerControllerTest {
    
    public TrainerControllerTest() {
    }
    
    @Test
    public void testGetAllTrainers() {
        System.out.println("TrainerController getAllTrainers");
        TrainerController instance = new TrainerController();
        List<Trainer> result = instance.getAllTrainers();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetTrainerById() {
        System.out.println("TrainerController getTrainerById");
        int id = 2;
        TrainerController instance = new TrainerController();
        Trainer result = instance.getTrainerById(id);
        assertTrue(result!=null && result.getId()==2);
    }
}
