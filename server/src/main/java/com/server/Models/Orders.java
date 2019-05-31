package com.server.Models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document (collection = "Orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String Customer_Id;
    private String Restaurant;
    private String Items;
    private String Status;
    //private Double TotalPrice;

    /** @return String return the id */
    public String getId() { return id; }

    /** @param id the id to set */
    public void setId(String id) { this.id = id; }

    /**
     * @return String return the Customer_Id
     */
    public String getCustomer_Id() {
        return Customer_Id;
    }

    /**
     * @param Customer_Id the Customer_Id to set
     */
    public void setCustomer_Id(String Customer_Id) {
        this.Customer_Id = Customer_Id;
    }

    /**
     * @return String return the Restaurant
     */
    public String getRestaurant() {
        return Restaurant;
    }

    /**
     * @param Restaurant the Restaurant to set
     */
    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    /**
     * @return String return the Items
     */
    public String getItems() {
        return Items;
    }

    /**
     * @param Items the Items to set
     */
    public void setItems(String Items) {
        this.Items = Items;
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

    
     // @return String return the TotalPrice
    //public Double getTotalPrice() {
        //return TotalPrice;
    //}

    
     // @param TotalPrice the TotalPrice to see
   // public void setTotalPrice(Double TotalPrice) {
     //   this.TotalPrice = TotalPrice;
   // }

    @Override
    public String toString() {
        return "Orders{" +
                "Customer_Id='" + Customer_Id + '\'' +
                "Restaurant='" + Restaurant + '\'' +
                ", Items='" + Items + '\'' +
                ", Status=" + Status + 
                //", Total Price=" + TotalPrice.toString() + 
                '}';
    }

}