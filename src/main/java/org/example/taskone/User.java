package org.example.taskone;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder @ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}