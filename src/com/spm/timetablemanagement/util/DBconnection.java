/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.util;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Tiran Harsha
 */
public class DBconnection {
    public static final Properties PROPERTIES = new Properties();
    
    private static Connection connection;
    
    public static String dbName = "timetablemanagement";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        
        if(connection == null || connection.isClosed()){
            
            //get property file to acces data
            PROPERTIES.load(Constant.class.getResourceAsStream(Constant.PROPERTIES) );
            
            try{
                connection = DriverManager.getConnection(PROPERTIES.getProperty(Constant.DB_URL)+dbName, 
                    PROPERTIES.getProperty(Constant.DB_USERNAME), PROPERTIES.getProperty(Constant.DB_PASSWORD));
            }
            catch(MySQLSyntaxErrorException ex){
                
               System.out.println("Database not found \n" + ex.getMessage());
               
            }
        }
        return connection;
    }
}
