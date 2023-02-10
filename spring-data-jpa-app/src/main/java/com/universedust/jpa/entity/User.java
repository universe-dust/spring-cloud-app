package com.universedust.jpa.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity(name = "sys_user")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -6823927468321935601L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;

    private Integer age;


}
