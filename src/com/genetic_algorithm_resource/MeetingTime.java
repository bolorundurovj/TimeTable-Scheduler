package com.genetic_algorithm_resource;

/**
 * Meeting Time.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class MeetingTime {

    private String id;
    private String time;

    public MeetingTime(String id, String time) {
        this.id = id;
        this.time = time;
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
     * Get Time.
     *
     * @return time
     */
    public String getTime() {
        return time;
    }

}
