package schedule.dal;

import java.util.List;
import schedule.model.Trainer;
import org.apache.ibatis.session.SqlSession;


public class TrainerDal extends BaseDal
{
      public TrainerDal  () {
        super();
    }
    
    public List<Trainer> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Trainer> list = session.selectList("trainer.selectAll");
      session.close();
      return list;
    }
    
     public Trainer selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Trainer trainer = session.selectOne("trainer.selectById",id);
      session.close();
      return trainer;
    }
    
    public int insert(Trainer trainer)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("trainer.insert",trainer);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Trainer trainer)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("trainer.update",trainer);
      session.commit();
      session.close();
      return count;
    }
    
        
    public int delete(int id)
    {
      SqlSession session = sqlSessionFactory.openSession();
      session.delete("trainer.delete_lesson",id);
      int count =  session.delete("trainer.delete",id);
      session.commit();
      session.close();
      return count;
    }
}
