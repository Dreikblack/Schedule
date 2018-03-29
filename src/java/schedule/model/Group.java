package schedule.model;

import java.util.List;
import java.util.Objects;

public class Group 
{
    private long id;
    private String name;
    private String place;
    private List<Lesson> lesson;

    public Group() {
    }

    public Group(long id, String name, String place, List<Lesson> lesson) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.lesson = lesson;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public List<Lesson> getLesson() {
        return lesson;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setLesson(List<Lesson> lesson) {
        this.lesson = lesson;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.place);
        return hash;
    }

    
    public boolean addLesson(Lesson lesson)
    {
        if(!this.lesson.contains(lesson))
        {
            this.lesson.add(lesson);
            return true;
        }
        return false;
            
    }
    
    public boolean removeLesson(Lesson lesson)
    {
        if(this.lesson.contains(lesson))
        {
            this.lesson.remove(lesson);
            return true;
        }
        return false;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Group other = (Group) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.place, other.place)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", place=" + place + ", lesson=" + lesson + '}';
    }
    
    
    
    
    
    
}
