package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class MenuItems {
    @Id @GeneratedValue
    private int id;
    private String name;
    private int menu_id_id;
    private float price;
}