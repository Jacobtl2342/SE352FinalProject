package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class RestaurantAdmin {
    @Id @GeneratedValue
    private int id;
    private int restuarant_id;
    //private int order_id;
}