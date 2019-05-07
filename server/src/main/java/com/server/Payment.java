package com.server;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Payment {
    @Id @GeneratedValue
    private int id;
    private String status;
    private String method;
}