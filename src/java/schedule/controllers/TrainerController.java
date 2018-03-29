package schedule.controllers;

import java.util.List;
import schedule.dal.TrainerDal;
import schedule.model.Trainer;


public class TrainerController 
{
    protected TrainerDal trainerDal;
    public TrainerController() {
        trainerDal= new TrainerDal();
    }
    
    public List<Trainer> getAllTrainers()
    {
        return trainerDal.selectAll();
    }
    
    public Trainer getTrainerById(int id)
    {
        return trainerDal.selectById(id);
    }
    
    public int insertTrainer(Trainer trainer)
    {
        return trainerDal.insert(trainer);
    }
    
     public int updateTrainer(Trainer trainer)
    {
        return trainerDal.update(trainer);
    }
     
    public int deleteTrainer(int id)
    {
        return trainerDal.delete(id);
    }
}
