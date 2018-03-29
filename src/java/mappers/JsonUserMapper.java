
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import schedule.model.User;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonUserMapper 
{
    public static User fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User user =mapper.readValue(json,User.class);
            return user;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(User user)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(user);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<User> users)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(users);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
