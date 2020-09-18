/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.allocateroom;

import com.spm.timetablemanagement.form.room.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ysraf
 */
public class allocateProcess extends allocate{
    public allocateProcess(){
        allocate();
    }
public void addRoom (String id, String type) throws SQLException{
        String sql = "INSERT INTO roomsForATag VALUES('"+id+"','"+type+"')";
        st.executeUpdate(sql);
    }
    
    public void getRoom(DefaultTableModel dtm) throws SQLException{
        String sql = "SELECT * FROM roomsForATag";
        
        rs = st.executeQuery(sql);
        Object[] data = new Object[2];
        
        while (rs.next()){
            data[0] = rs.getString("tag");
            data[1] = rs.getString("room");
            dtm.addRow(data);
        }
        
    }
    public void deleteRoom (String id,String type) throws SQLException{
        String sql = "DELETE FROM roomsForATag WHERE tag = '"+id+"' AND room = '"+type+"'" ;
        st.executeUpdate(sql);
    }
    
//-------------------------------------------------------------------------------------------------------------    
    
    
   public void addsubRoom (String id, String type,String sub) throws SQLException{
        String sql = "INSERT INTO roomssubtags VALUES('"+id+"','"+type+"','"+sub+"')";
        st.executeUpdate(sql);
    }
    
    public void getsubRoom(DefaultTableModel dtm) throws SQLException{
        String sql = "SELECT * FROM roomssubtags";
        
        rs = st.executeQuery(sql);
        Object[] data = new Object[3];
        
        while (rs.next()){
            data[0] = rs.getString("tag");
            data[1] = rs.getString("room");
            data[2] = rs.getString("subject");
            dtm.addRow(data);
        }
        
    }
    public void deletesubRoom (String id,String type,String sub) throws SQLException{
        String sql = "DELETE FROM roomssubtags WHERE tag = '"+id+"' AND room = '"+type+"' AND subject = '"+sub+"'" ;
        st.executeUpdate(sql);
    }
    
}
