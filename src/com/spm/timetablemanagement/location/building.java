/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.location;

import com.spm.timetablemanagement.form.room.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ysraf
 */
public class building {
    

    Connection c;
    ResultSet rs;
    PreparedStatement statement;
    Statement st;
    

    public void building() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement","root","0713025880");
            st = c.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertBuilding.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
