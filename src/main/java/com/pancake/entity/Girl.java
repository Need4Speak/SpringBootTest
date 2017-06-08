package com.pancake.entity;

import sun.awt.SunHints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by m on 2017/6/7.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private int id;
    @Min(value = 18, message = "未成年")
    private String age;
    private int size;

    public Girl() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
