package com.genetic_algorithm_resource;

import java.util.ArrayList;

/**
 * Department.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class Department {

    private String name;
    private ArrayList<Course> courses;

    public Department(String name, ArrayList<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get Courses.
     *
     * @return courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

}
