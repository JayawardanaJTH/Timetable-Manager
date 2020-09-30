/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.lecturer.timetable;

import com.spm.timetablemanagement.models.Lecturer;
import com.spm.timetablemanagement.models.Session;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class Generater {
    
    PreparedStatement statement;
    Connection connection;
    ResultSet resultSet;
    
    Lecturer lecturer = new Lecturer();
    Session session = new Session();
    
    public Map<Integer,Lecturer> _lecturesList = new Hashtable<>();
    public Map<Integer,Session> _sessionList = new Hashtable<>();
    
    public void loadData() throws ParserConfigurationException, SAXException, IOException, SQLException{
        getConnection();
        
        statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
        resultSet = statement.executeQuery();
        
        while(resultSet.next()){
            lecturer.setId(resultSet.getInt("id"));
            lecturer.setName(resultSet.getString("name"));
            lecturer.setLec_id(resultSet.getString("emp_id"));
            lecturer.setFaculty(resultSet.getString("faculty"));
            lecturer.setDepartment(resultSet.getString("department"));
            lecturer.setCenter(resultSet.getString("center"));
            lecturer.setBuilding(resultSet.getString("building"));
            lecturer.setLevel(resultSet.getString("level"));
            lecturer.setRank(resultSet.getString("rank"));
            
            _lecturesList.put(lecturer.getId(),lecturer);
        }
        
        statement.close();
        resultSet.close();
        
        statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION));
        resultSet = statement.executeQuery();
        
        while(resultSet.next()){
            session.setId(resultSet.getInt("id"));
            session.setSub(resultSet.getString("subject"));
            session.setSubc(resultSet.getString("sub_code"));
            session.setTag(resultSet.getString("tag"));
            session.setDuration(resultSet.getString("tag_duration"));
            session.setGroupID(resultSet.getString("group_id"));
            session.setSubgroupID(resultSet.getString("subgroup_id"));
            session.setStu_count(resultSet.getInt("stu_count"));
            
            _sessionList.put(session.getId(),session);
        }
        
        System.out.println("Data loaded");
    }
    
    public void getConnection(){
        try {
            connection = DBconnection.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(Generater.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
