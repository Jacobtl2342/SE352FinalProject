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
    private Long id;
    private @NonNull String name;
    //private @NonNull String address;
    //private @NonNull Int menu;

}