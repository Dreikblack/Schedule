
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import schedule.model.Lesson;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonLessonMapper 
{
    public static Lesson fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Lesson lesson =mapper.readValue(json,Lesson.class);
            return lesson;
        } catch (IOException ex) {
            Logger.getLogger(JsonLessonMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Lesson lesson)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(lesson);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonLessonMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Lesson> lessons)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(lessons);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonLessonMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
