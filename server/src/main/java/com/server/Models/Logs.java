package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Logs")
public class Logs implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String Event;


    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return int return the Event
     */
    public String getEvent() {
        return Event;
    }

    /**
     * @param Event the Event to set
     */
    public void setNum_star(String Event) {
        this.Event = Event;
    }
    
    @Override
    public String toString() {
        return "Logs{" +
                "id='" + id + '\'' +
                "Event='" + Event + 
                '}';
    }
}