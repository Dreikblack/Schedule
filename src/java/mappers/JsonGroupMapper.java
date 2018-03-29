
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import schedule.model.Group;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonGroupMapper 
{
    public static Group fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Group group =mapper.readValue(json,Group.class);
            return group;
        } catch (IOException ex) {
            Logger.getLogger(JsonGroupMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Group group)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(group);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonGroupMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Group> groups)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(groups);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonGroupMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
