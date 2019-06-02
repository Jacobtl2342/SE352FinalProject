package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Reviews")
public class Reviews implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private int Num_star;

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
     * @return int return the Num_star
     */
    public int getNum_star() {
        return Num_star;
    }

    /**
     * @param Num_star the Num_star to set
     */
    public void setNum_star(int Num_star) {
        this.Num_star = Num_star;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                "Num_star='" + Num_star + 
                '}';
    }
}


