package com.data_structure;

import javax.swing.JOptionPane;
import java.sql.*;

public class DBConnect1 {

    public static Connection con;
    public static ResultSet rs;
    public static Statement st;

    public static void connect() {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/time_table_scheduling?serverTimezone=UTC", "root", "rootroot");
            con = DriverManager.getConnection("jdbc:sqlite:timetable.db");
            st = con.createStatement();
            st.executeUpdate("drop table if exists app_user");
            st.executeUpdate("drop table if exists class");
            st.executeUpdate("drop table if exists meeting_time");
            st.executeUpdate("create table app_user (user_id integer, username string, firstname string, lastname string, password string)");
            st.executeUpdate("insert into app_user values(1, 'admin', 'admin', 'admin', 'admin')");
            st.executeUpdate("create table if not exists class_courses (id integer primary key autoincrement, course_id integer, class_id integer)");
            st.executeUpdate("create table if not exists class_room (class_room_id integer primary key autoincrement, class_room_name string, space_capacity integer)");
            st.executeUpdate("create table if not exists course (course_id integer primary key autoincrement, course_name string, maximum_number_of_student integer)");
            st.executeUpdate("create table if not exists course_instructor (id integer primary key autoincrement, course_id integer, instructor_id integer)");
            st.executeUpdate("create table if not exists instructor (instructor_id integer primary key autoincrement, instructor_name string, phone integer, gender string)");
            st.executeUpdate("create table if not exists meeting_time (time_id integer primary key autoincrement, time_title string)");
            st.executeUpdate("create table if not exists class (class_id integer primary key autoincrement, class_name string)");
            st.executeUpdate("insert into class values(1, '100 Level'), (2, '200 Level'), (3, '300 Level'), (4, '400 Level'), (5, '500 Level')");
            st.executeUpdate("insert into meeting_time values (1, 'MON: 08 AM -- 09 AM'),\n"
                    + "(2, 'MON: 09 AM -- 10 AM'),\n"
                    + "(3, 'MON: 10 AM -- 11 AM'),\n"
                    + "(4, 'MON: 11 AM -- 12 PM'),\n"
                    + "(5, 'MON: 12 AM -- 01 PM'),\n"
                    + "(7, 'MON: 02 PM -- 03 PM'),\n"
                    + "(8, 'MON: 03 PM -- 04 PM'),\n"
                    + "(9, 'MON: 04 PM -- 05 PM'),\n"
                    + "(10, 'MON: 05 PM -- 06 PM'),\n"
                    + "(11, 'TUE: 08 AM -- 09 AM'),\n"
                    + "(12, 'TUE: 09 AM -- 10 AM'),\n"
                    + "(13, 'TUE: 10 AM -- 11 AM'),\n"
                    + "(14, 'TUE: 11 AM -- 12 PM'),\n"
                    + "(15, 'TUE: 12 AM -- 01 PM'),\n"
                    + "(16, 'TUE: 02 PM -- 03 PM'),\n"
                    + "(17, 'TUE: 03 PM -- 04 PM'),\n"
                    + "(18, 'TUE: 04 PM -- 05 PM'),\n"
                    + "(19, 'TUE: 05 PM -- 06 PM'),\n"
                    + "(20, 'WED: 08 AM -- 09 AM'),\n"
                    + "(21, 'WED: 09 AM -- 10 AM'),\n"
                    + "(22, 'WED: 10 AM -- 11 AM'),\n"
                    + "(23, 'WED: 11 AM -- 12 PM'),\n"
                    + "(24, 'WED: 12 AM -- 01 PM'),\n"
                    + "(25, 'WED: 02 PM -- 03 PM'),\n"
                    + "(26, 'WED: 03 PM -- 04 PM'),\n"
                    + "(27, 'WED: 04 PM -- 05 PM'),\n"
                    + "(28, 'WED: 05 PM -- 06 PM'),\n"
                    + "(29, 'THU: 08 AM -- 09 AM'),\n"
                    + "(30, 'THU: 09 AM -- 10 AM'),\n"
                    + "(31, 'THU: 10 AM -- 11 AM'),\n"
                    + "(32, 'THU: 11 AM -- 12 PM'),\n"
                    + "(33, 'THU: 12 AM -- 01 PM'),\n"
                    + "(34, 'THU: 02 PM -- 03 PM'),\n"
                    + "(35, 'THU: 03 PM -- 04 PM'),\n"
                    + "(36, 'THU: 04 PM -- 05 PM'),\n"
                    + "(37, 'THU: 05 PM -- 06 PM'),\n"
                    + "(38, 'FRI: 08 AM -- 09 AM'),\n"
                    + "(39, 'FRI: 09 AM -- 10 AM'),\n"
                    + "(40, 'FRI: 10 AM -- 11 AM'),\n"
                    + "(41, 'FRI: 11 AM -- 12 PM'),\n"
                    + "(42, 'FRI: 12 AM -- 01 PM'),\n"
                    + "(43, 'FRI: 02 PM -- 03 PM'),\n"
                    + "(44, 'FRI: 03 PM -- 04 PM'),\n"
                    + "(45, 'FRI: 04 PM -- 05 PM'),\n"
                    + "(46, 'FRI: 05 PM -- 06 PM')");
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Cannot connect to the database", "Issue!", JOptionPane.OK_OPTION);
        }
    }
}
