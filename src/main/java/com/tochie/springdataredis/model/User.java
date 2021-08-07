package com.tochie.springdataredis.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {

    private String id;
    private long salary;
    private String name;

    public User(String id, long salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
}
