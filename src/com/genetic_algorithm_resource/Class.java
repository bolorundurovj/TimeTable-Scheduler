package com.genetic_algorithm_resource;

/**
 * Class.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public class Class {

    private int id;
    private Department dept;
    private Course course;
    private Instructor instructor;
    private MeetingTime meetingTime;
    private Room room;

    /**
     *
     * @param id
     * @param dept
     * @param course
     */
    public Class(int id, Department dept, Course course) {
        this.id = id;
        this.dept = dept;
        this.course = course;
    }

    /**
     * Set Instructor.
     *
     * @param instructor
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * Set Meeting Time.
     *
     * @param meetingTime
     */
    public void setMeetingTime(MeetingTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    /**
     * Set Room.
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Get ID.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get Department.
     *
     * @return department
     */
    public Department getDept() {
        return dept;
    }

    /**
     * Get Course
     *
     * @return course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Get Instructor
     *
     * @return instructor
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Get Meeting Time
     *
     * @return meetingTime
     */
    public MeetingTime getMeetingTime() {
        return meetingTime;
    }

    /**
     * Get Room
     *
     * @return room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * To String
     *
     * @return string
     */
    public String toString() {
        return "{" + dept.getName() + "," + course.getName() + "," + instructor.getName() + "," + meetingTime.getTime() + "}";
    }

}
