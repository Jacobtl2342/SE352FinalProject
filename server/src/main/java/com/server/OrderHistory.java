package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class OrderHistory {
    @Id @GeneratedValue
    private int id;
    private int payment_id;
    private float total_price;
}