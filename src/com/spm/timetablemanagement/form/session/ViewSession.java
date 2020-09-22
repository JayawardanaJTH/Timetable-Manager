/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.session;

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
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class ViewSession extends javax.swing.JPanel {
    PreparedStatement statement,statement1;
    Connection connection;
    ResultSet resultSet;
    TableModel tableModel;
    DefaultTableModel dtm;
    
    Dictionary<Integer, Lecturer> lecturerList;
    Dictionary<Integer, Session> sessionList;
    Dictionary<Integer, Integer> session_lecList;
    
    String[] lecture;
    Object [] data = new Object[8];
    int i = 0;
    /**
     * Creates new form ViewSession
     */
    public ViewSession() {
        this.lecturerList = new Hashtable<>();
        this.sessionList = new Hashtable<>();
        this.session_lecList = new Hashtable<>();
        dtm = (DefaultTableModel) jTable1.getModel();
        tableModel = jTable1.getModel();
        
        initComponents();
        
        try {
            connection = DBconnection.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on connection create"+ex.getMessage(), "Data error", JOptionPane.ERROR_MESSAGE);
        }
        loadData();
    }

    private void loadData(){
        i = 0;
        loadLecturers();
        
        Session session = new Session();
        
        try {
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION));
            statement1 = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_LECT));
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                session.setId(resultSet.getInt("id"));
                session.setSub(resultSet.getString("subject"));
                session.setSubc(resultSet.getString("subject"));
                session.setTag(resultSet.getString("tag"));
                session.setDuration(resultSet.getString("tag_duration"));
                session.setGroupID(resultSet.getString("group_id"));
                session.setSubgroupID(resultSet.getString("subgroup_id"));
                session.setStu_count(resultSet.getInt("stu_count"));
                
                sessionList.put(i, session);
            }
            resultSet.close();
            
            resultSet = statement1.executeQuery();
            
            while(resultSet.next()){
                session_lecList.put(resultSet.getInt("session_id"),resultSet.getInt("lec_id"));
            }
            
            for(i = 0;i < sessionList.size(); i++){
                session = sessionList.get(i);
                
                for(int j =0;j < session_lecList.size(); j++){
                    
                    for(int t=0;t < lecturerList.size();t++){
                        if(session_lecList.get(session.getId())== lecturerList.get(j).getId()){
                            
                        }
                    }
                }
            }
            
        } catch (SQLException | ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on data Load"+ex.getMessage(), "Data error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadLecturers(){
        try {
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Lecturer l = new Lecturer();
                
                l.setId(resultSet.getInt("id"));
                l.setName(resultSet.getString("name"));
                l.setLec_id(resultSet.getString("emp_id"));
                
                lecturerList.put(l.getId(), l);
            }
            
//            if(lecturerList.size()>0){
//                lecture = new String[lecturerList.size()+1];
//                lecture[0] = "Select";
//            }
//            else{
//                lecture = new String[1];
//                lecture[0] = "No Items";
//            }
//            
//            for(i =1;i <= lecturerList.size();i++){
//                
//                lecture[i] = lecturerList.get(i).getName();
//            }
            statement.close();
            resultSet.close();
        } catch (ParserConfigurationException | SAXException | IOException | SQLException ex) {
            Logger.getLogger(AddSession.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this, "Error on load lecturers data", "Data load error", JOptionPane.ERROR_MESSAGE);
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

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(90, 30, 172));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("View Sessions");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer(s)", "Subject", "Tag", "Duration", "GroupID", "SubgroupID", "Student Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
