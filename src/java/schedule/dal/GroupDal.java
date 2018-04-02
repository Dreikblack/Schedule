package schedule.dal;

import java.util.List;
import schedule.model.Group;
import org.apache.ibatis.session.SqlSession;


public class GroupDal extends BaseDal
{
      public GroupDal  () {
        super();
    }
    
    public List<Group> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Group> list = session.selectList("group.selectAll");
      session.close();
      return list;
    }
    
     public Group selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Group group = session.selectOne("group.selectById",id);
      session.close();
      return group;
    }
    
    public int insert(Group group)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("group.insert",group);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Group group)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("group.update",group);
      session.commit();
      session.close();
      return count;
    }
    
        
    public int delete(int id)
    {
      SqlSession session = sqlSessionFactory.openSession();
      session.delete("group.delete_lesson",id);
      session.commit();
      int count =  session.delete("group.delete",id);
      session.commit();
      session.close();
      return count;
    }
}
