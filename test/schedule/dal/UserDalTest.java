package schedule.dal;

import schedule.dal.UserDal;
import java.util.List;
import schedule.model.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDalTest {
    
    public UserDalTest() {
    }

    /**
     * Test of selectAll method, of class UserDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("UserDal selectAll");
        UserDal dal = new UserDal();
        List<User> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    /**
     * Test of selectById method, of class UserDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 0;
        UserDal instance = new UserDal();
        User expResult = null;
        User result = instance.selectById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of insert method, of class UserDal.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        User user = new User(4,"login","password");
        UserDal instance = new UserDal();
        int expResult = 1;
        int result = instance.insert(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UserDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User user = new User(4,"login0","password");;
        UserDal instance = new UserDal();
        int expResult = 1;
        int result = instance.update(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class UserDal.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        UserDal instance = new UserDal();
        int expResult = 1;
        int result = instance.delete(4);
        assertEquals(expResult, result);
    }
    
}
