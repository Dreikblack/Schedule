/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule.model;

import java.util.Objects;
import java.sql.Time;
/**
 *
 * @author petro
 */
public class Lesson {
   private int id;
    private int idGroup;
    private int day;
    private Time timeStart;
    private Time timeEnd;
    private int idTrainer;

    public Lesson() {
    }

    public Lesson(int id, int idGroup, int day, Time timeStart, Time timeEnd, int idTrainer) {
        this.id = id;
        this.idGroup=idGroup;
        this.day = day;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.idTrainer = idTrainer;
    }

    public int getId() {
        return id;
    }

    public int getIdGroup() {
        return idGroup;
    }
    
    public int getDay() {
        return day;
    }

    public Time getTimeStart() {
        return timeStart;
    }
    
    public Time getTimeEnd() {
        return timeEnd;
    }

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

     public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
    }
     
    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + this.idGroup;
        hash = 59 * hash + this.day;
        hash = 59 * hash + Objects.hashCode(this.timeStart);
        hash = 59 * hash + Objects.hashCode(this.timeEnd);
        hash = 59 * hash + this.idTrainer;
        return hash;
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
        final Lesson other = (Lesson) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idGroup != other.idGroup) {
            return false;
        }
        if (!Objects.equals(this.day, other.day)) {
            return false;
        }
        if (!Objects.equals(this.timeStart, other.timeStart)) {
            return false;
        }
        if (!Objects.equals(this.timeEnd, other.timeEnd)) {
            return false;
        }
        if (!Objects.equals(this.idTrainer, other.idTrainer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lesson{" + "id=" + id +", idGroup="+idGroup+ ", day=" + day + ", timeStart=" + timeStart+ ", timeEnd=" + timeEnd + ", idTrainer=" + idTrainer + '}';
    }
}
