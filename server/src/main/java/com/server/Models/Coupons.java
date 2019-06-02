package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Coupons")
public class Coupons implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String Discount;



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
     * @return String return the Discout
     */
    public String getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discout to set
     */
    public void setDiscout(String Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                "Discount='" + Discount + 
                '}';
    }

}