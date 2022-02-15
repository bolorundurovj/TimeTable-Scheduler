package com.genetic_algorithm_resource;

import java.util.ArrayList;

/**
 * Course.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class Course {

    private String number = null;
    private String name = null;
    private int maxNumberOfStudents;
    private ArrayList<Instructor> instructors;

    public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumberOfStudents) {
        this.number = number;
        this.name = name;
        this.instructors = instructors;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    /**
     * Get Number
     *
     * @return number
     */
    public String getNumber() {
        return number;
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
     * Get Instructors
     *
     * @return instructors
     */
    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    /**
     * Get Max No of Students
     *
     * @return maxNumberOfStudents
     */
    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    /**
     * To String
     *
     * @return string
     */
    public String toString() {
        return name;
    }

}
