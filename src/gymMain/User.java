/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymMain;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.RowFilter;

/**
 *
 * @author jx
 */
public class User {
    private int class_id;
    private String class_day;
    private String class_name;
    private String start_time;
    private String end_time;
    private String instructor;
    private int available_spots;
    
    public User(int ID, String ClassDay, String ClassName, String StartTime, String EndTime, String Instructor, int AvailableSpots){
        this.class_id = ID;
        this.class_day = ClassDay;
        this.class_name = ClassName;
        this.start_time = StartTime;
        this.end_time = EndTime;
        this.instructor = Instructor;
        this.available_spots = AvailableSpots;
    }
    
    public int getclass_id(){
        return class_id;
    }
    
    public String getclass_day(){
        return class_day;
    }
    
    public String getclass_name(){
        return class_name;
    }
    
    public String getstart_time(){
        return start_time;
    }

    public String getend_time() {
        return end_time;
    }
    
    public String getinstructor() {
        return instructor;
    }
    
    public int getavailable_spots() {
        return available_spots;
    }

}
