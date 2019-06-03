package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String Method;
    private String Status;

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
     * @return String return the Method
     */
    public String getMethod() {
        return Method;
    }

    /**
     * @param Method the Method to set
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * @return String return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                "Method='" + Method + '\'' +
                ",Status=" + Status + 
                '}';
    }

}