package schedule.dal;

import java.util.List;
import schedule.model.Lesson;
import org.apache.ibatis.session.SqlSession;


public class LessonDal extends BaseDal
{
    public LessonDal () {
        super();
    }
    
    public List<Lesson> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Lesson> list = session.selectList("lesson.selectAll");
      session.close();
      return list;
    }
    
     public Lesson selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Lesson lesson = session.selectOne("lesson.selectById",id);
      session.close();
      return lesson;
    }
    
    public int insert(Lesson lesson)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("lesson.insert",lesson);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Lesson lesson)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("lesson.update",lesson);
      session.commit();
      session.close();
      return count;
    }
    
        
    public int delete(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("lesson.delete",id);
      session.commit();
      session.close();
      return count;
    }
}
