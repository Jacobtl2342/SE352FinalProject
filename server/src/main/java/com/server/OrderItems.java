package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class OrderItems {
    @Id @GeneratedValue
    private int id;
    private int order_id;
    private int menu_item_id;
    private int quantity;
}