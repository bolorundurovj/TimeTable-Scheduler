package com.data_structure;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 * MyTable.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public class MyTable {
    private static JTable table;
    private static ResultSetTableModel tableModel;
    
    /**
     * Create Table
     * @param defQuery
     * @param metaD
     * @return table
     */
    public static JTable createTable (String defQuery, String[] metaD){
	final String DEFAULT_QUERY = defQuery;
        String meta[]=metaD;
        try {
            tableModel = new ResultSetTableModel(DEFAULT_QUERY, meta);
            tableModel.setQuery(DEFAULT_QUERY);
        }catch (ClassNotFoundException | SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        //for setting the table with the information
        table = new JTable(tableModel);
        table.setFont(new Font("Tahoma", Font.PLAIN, 12));
        table.setBackground(Color.WHITE);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        table.setSelectionForeground(Color.WHITE);
 
        return table;
    }
}
