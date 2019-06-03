package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Restaurant {
    @Id @GeneratedValue
    private int id;
    private @NonNull String name;
    private int menu_id;
    private int admin_id;
    //private @NonNull String address;
    //private @NonNull Int menu;

}