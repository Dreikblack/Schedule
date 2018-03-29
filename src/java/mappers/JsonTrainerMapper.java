
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import schedule.model.Trainer;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonTrainerMapper 
{
    public static Trainer fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Trainer trainer =mapper.readValue(json,Trainer.class);
            return trainer;
        } catch (IOException ex) {
            Logger.getLogger(JsonTrainerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Trainer trainer)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(trainer);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonTrainerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Trainer> trainers)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(trainers);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonTrainerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
