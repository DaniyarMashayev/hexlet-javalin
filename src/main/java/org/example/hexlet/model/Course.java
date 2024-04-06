package org.example.hexlet.model;

import lombok.Setter;
import lombok.ToString;


@Setter
@ToString
public class Course {
    private Long id;

    private String name;
    private String description;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
