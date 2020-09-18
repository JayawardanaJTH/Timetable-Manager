/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.allocateroom;

import com.spm.timetablemanagement.form.room.*;
import com.spm.timetablemanagement.form.tag_details.tag;
import com.spm.timetablemanagement.models.Room;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiran Harsha
 */
public class allocateRoom extends javax.swing.JPanel {

    private String ID;
    private String Type;
    private String Sub;
    allocateProcess rp;
    private DefaultTableModel dtm;
    
    
    /**
     * Creates new form InsertWorkingHours
     */
    public allocateRoom() throws ClassNotFoundException {
        initComponents();
        rp = new allocateProcess();
        getRoom();
        getsubRoom();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/timetablemanagement";
            Connection con = DriverManager.getConnection(databaseURL, "root", "0713025880");
            Statement stat = con.createStatement();    
            String selectQuery="select Tag from tag";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                tag.addItem(rs.getString("Tag"));
                t1.addItem(rs.getString("Tag"));
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//-------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/timetablemanagement";
            Connection con = DriverManager.getConnection(databaseURL, "root", "0713025880");
            Statement stat2 = con.createStatement();    
            String selectQuery="select id from room";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                room.addItem(rs.getString("id"));
                r1.addItem(rs.getString("id"));
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//-------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/timetablemanagement";
            Connection con = DriverManager.getConnection(databaseURL, "root", "0713025880");
            Statement stat2 = con.createStatement();    
            String selectQuery="select name from subject";
            ResultSet rs=stat2.executeQuery(selectQuery);
            while(rs.next())
            {
                sub1.addItem(rs.getString("name"));
               
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txt_error = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tag = new javax.swing.JComboBox<>();
        room = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JComboBox<>();
        sub1 = new javax.swing.JComboBox<>();
        add1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Allocate Rooms for Tags");

        jLabel2.setText("Tag");

        jLabel3.setText("Room");

        add.setText("Allocate");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag", "Room"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Add Rooms for Subjects and Tags");

        jLabel5.setText("Tag");

        jLabel6.setText("Room");

        jLabel7.setText("Subject");

        add1.setText("Allocate");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag", "Room", "Subject"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(delete))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(delete))
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add1)
                            .addComponent(delete1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addRoom();
        getRoom();
       
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteRoom();
        getRoom();
         
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tableClicked();
    }//GEN-LAST:event_jTable1MouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        addsubRoom();
        getsubRoom();
    }//GEN-LAST:event_add1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        deletesubRoom();
        getsubRoom();
    }//GEN-LAST:event_delete1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        tableClicked1();
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> r1;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JComboBox<String> sub1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> tag;
    private javax.swing.JLabel txt_error;
    // End of variables declaration//GEN-END:variables

//--------------------------------------------------------------------------------------
       public void addRoom(){
        String STag = tag.getSelectedItem().toString();
        String SRoom = room.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                rp.addRoom(ID, Type);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }

    
    public void deleteRoom(){
        String STag = tag.getSelectedItem().toString();
        String SRoom = room.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                
                rp.deleteRoom(ID,Type);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public void getRoom(){
        try {
            dtm = (DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            rp.getRoom(dtm);
            jTable1.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClicked(){
        
        
        
       tag.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
       room.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
    }
    
//--------------------------------------------------------------------------------------
       public void addsubRoom(){
        String STag = t1.getSelectedItem().toString();
        String SRoom = r1.getSelectedItem().toString();
        String SSub = sub1.getSelectedItem().toString();
        
        if (STag.isEmpty() || SRoom.isEmpty() || SSub.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select details");
        }else{
            try {
                ID = STag;
                Type = SRoom;
                Sub = SSub;
                rp.addsubRoom(ID, Type, Sub);
                JOptionPane.showMessageDialog(this, "Successfully Added");
            } catch (SQLException ex) {
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }

    
    public void deletesubRoom(){
        String STag = t1.getSelectedItem().toString();
        String SRoom = r1.getSelectedItem().toString();
        String SSub = sub1.getSelectedItem().toString();
        
        if(STag.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error!");
        }else{
                
            try {
                ID = STag;
                Type = SRoom;
                Sub = SSub;
                
                rp.deletesubRoom(ID,Type,Sub);
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Failed!");
                Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public void getsubRoom(){
        try {
            dtm = (DefaultTableModel)jTable2.getModel();
            dtm.setRowCount(0);
            rp.getsubRoom(dtm);
            jTable2.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(allocateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableClicked1(){

       t1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
       r1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
       sub1.setSelectedItem(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
       
    }
    
}
