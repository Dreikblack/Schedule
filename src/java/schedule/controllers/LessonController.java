package schedule.controllers;

import java.util.List;
import schedule.dal.GroupDal;
import schedule.dal.LessonDal;
import schedule.model.Group;
import schedule.model.Lesson;
/**
 *
 * @author petro
 */
public class LessonController {
       protected LessonDal lessonDal;
    public LessonController() {
        lessonDal= new LessonDal();
    }
    
    public List<Lesson> getAllLessons()
    {
        return lessonDal.selectAll();
    }
    
    public Lesson getLessonById(int id)
    {
        return lessonDal.selectById(id);
    }
    
    public int insertLesson(Lesson lesson)
    {
        return lessonDal.insert(lesson);
    }
    
     public int updateLesson(Lesson lesson)
    {
        return lessonDal.update(lesson);
    } 
     
      public int deleteLesson(int id)
    {
        return lessonDal.delete(id);
    } 
}
