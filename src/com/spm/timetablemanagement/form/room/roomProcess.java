/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.room;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ysraf
 */
public class roomProcess extends room{
    public roomProcess(){
        room();
    }
    
    public void addRoom (String id, String type) throws SQLException{
        String sql = "INSERT INTO room VALUES('"+id+"','"+type+"')";
        st.executeUpdate(sql);
    }
    
    public void updateRoom (String id, String type) throws SQLException{
        String sql = "UPDATE room SET type = '"+type+"' WHERE id = '"+id+"'";
        st.executeUpdate(sql);
    }
    public void getRoom(DefaultTableModel dtm) throws SQLException{
        String sql = "SELECT * FROM room";
        
        rs = st.executeQuery(sql);
        Object[] data = new Object[2];
        
        while (rs.next()){
            data[0] = rs.getString("id");
            data[1] = rs.getString("type");
            dtm.addRow(data);
        }
        
    }
    public void deleteRoom (String id) throws SQLException{
        String sql = "DELETE FROM room WHERE id = '"+id+"'";
        st.executeUpdate(sql);
    }
    
}
