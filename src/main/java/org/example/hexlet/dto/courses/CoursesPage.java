package org.example.hexlet.dto.courses;

import java.util.List;

import org.example.hexlet.model.Course;


public class CoursesPage {
    private final List<Course> courses;
    private final String header;

    public CoursesPage(List<Course> courses, String header) {
        this.courses = courses;
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
