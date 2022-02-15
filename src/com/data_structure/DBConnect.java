package com.data_structure;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 * DB Connection.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public class DBConnect {
    public static Connection con;
    public static ResultSet rs;
    public static Statement st;
    public static void connect(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/time_table_scheduling?serverTimezone=UTC", "root", "rootroot");
            st=con.createStatement();
        }catch (SQLException e){ 
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Cannot connect to the database","Issue!", JOptionPane.OK_OPTION);
        } 
    }
}
