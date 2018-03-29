package schedule.controllers;

import java.util.List;
import schedule.dal.GroupDal;
import schedule.dal.UserDal;
import schedule.model.Group;
import schedule.model.User;


public class GroupController 
{
    protected GroupDal groupDal;
    public GroupController() {
        groupDal= new GroupDal();
    }
    
    public List<Group> getAllGroups()
    {
        return groupDal.selectAll();
    }
    
    public Group getGroupById(int id)
    {
        return groupDal.selectById(id);
    }
    
    public int insertGroup(Group group)
    {
        return groupDal.insert(group);
    }
    
     public int updateGroup(Group group)
    {
        return groupDal.update(group);
    }
     
    public int deleteGroup(int id)
    {
        return groupDal.delete(id);
    } 
}
