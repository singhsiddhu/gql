package com.sid.gql.entities;

import com.sid.gql.enums.Animal;
import lombok.Data;

@Data
public class Pet {
    private long id;
    private String name;
    private Animal type;
    private int age;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(Animal a) {
        this.type = a;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Animal getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

}
