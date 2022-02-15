package com.genetic_algorithm_resource;

/**
 * Room.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class Room {

    private String number;
    private int seatingCapacity;

    public Room(String number, int seatingCapacity) {
        this.number = number;
        this.seatingCapacity = seatingCapacity;
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
     * Get Seating Capacity
     *
     * @return seatingCapacity
     */
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

}
