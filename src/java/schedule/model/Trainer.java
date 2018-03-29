package schedule.model;

import java.util.List;
import java.util.Objects;

public class Trainer 
{
    private long id;
    private String name;
    private List<Lesson> lesson;

    public Trainer() {
    }

    public Trainer(long id, String name, List<Lesson> lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
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
    
    public void setLesson(List<Lesson> lesson) {
        this.lesson = lesson;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final Trainer other = (Trainer) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", lesson=" + lesson + '}';
    }
    
}
