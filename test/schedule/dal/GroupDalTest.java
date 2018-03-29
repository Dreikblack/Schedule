/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.dal;

import schedule.dal.GroupDal;
import java.util.List;
import schedule.model.Group;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupDalTest {
    
    public GroupDalTest() {
    }

    /**
     * Test of selectAll method, of class GroupDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("GroupDal selectAll");
        GroupDal instance = new GroupDal();
        List<Group> result = instance.selectAll();
       // System.out.println(result);
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class GroupDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("GroupDal selectById");
        int id = 1;
        GroupDal instance = new GroupDal();
        Group result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==1);
    }

    
    
}
