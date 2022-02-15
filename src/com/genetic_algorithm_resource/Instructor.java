package com.genetic_algorithm_resource;

/**
 * Instructor.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class Instructor {

    private String id;
    private String name;

    public Instructor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get ID.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Get Name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

}
