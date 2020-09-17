/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.lecturer;

import com.spm.timetablemanagement.models.Lecturer;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class ViewLecturer extends javax.swing.JPanel {

    ArrayList<Lecturer> lecturers = new ArrayList<>();
    TableModel model;
    EditModel editModel = new EditModel();
    int row ;
    int col ;
    /**
     * Creates new form ViewLecturer
     */
    public ViewLecturer() {
        initComponents();
        execute();
    }

    private void execute(){
        
        try {
            Connection connection =  DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
                Lecturer l = new Lecturer();
                
                l.setId(resultSet.getInt("id"));
                l.setName(resultSet.getString("name"));
                l.setFaculty(resultSet.getString("faculty"));
                l.setDepartment(resultSet.getString("department"));
                l.setCenter(resultSet.getString("center"));
                l.setBuilding(resultSet.getString("building"));
                l.setRank(resultSet.getString("rank"));
                
                lecturers.add(l);
                
                mod.setRowCount(0);
                
                createTable();
            }
        } catch (SQLException | ClassNotFoundException | IOException | 
                ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ViewLecturer.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(90, 30, 172));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("View Lecturer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
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
                "ID", "Lecture name", "Faculty", "Department", "Center", "Building", "Rank", "Action", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jButton1.setText("Refresh");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(746, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel2);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        model = jTable1.getModel();
        
        if(col == 8){
            int x = JOptionPane.showConfirmDialog(ViewLecturer.this, "Are you sure to Delete", "Delete", JOptionPane.YES_NO_OPTION);
            if(x==0){
                deleteData(row);
            }
            
        }
        else if(col == 7){
            editModel.setVisible(true);
            editModel.setPreferredSize(new Dimension(200, 400));
            editModel.setLocationRelativeTo(this);
            editModel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            editModel.txt_lec_name.setText(model.getValueAt(row, 1).toString());
            editModel.txt_lec_id.setText(model.getValueAt(row, 6).toString().substring(2));
            editModel.cmb_lec_faculty.setSelectedItem(model.getValueAt(row, 2));
            editModel.cmb_lec_dept.setSelectedItem(model.getValueAt(row, 3));
            editModel.cmb_lec_center.setSelectedItem(model.getValueAt(row, 4));
            editModel.cmb_lec_building.setSelectedItem(model.getValueAt(row, 5));
            editModel.cmb_lec_level.setSelectedIndex(Integer.parseInt(model.getValueAt(row, 6).toString().substring(0,1))-1);
            editModel.txt_lec_rank.setText(model.getValueAt(row, 6).toString());
            editModel.txt_id.setText(model.getValueAt(row, 0).toString());
            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        refreshTable();
    }//GEN-LAST:event_jButton1MouseClicked

    private void deleteData(int row){
        boolean error = false;
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        
         try {
             int id = (int) model.getValueAt(row, 0);
            
             
            Connection connection =  DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.DELETE_LECTURER));
            
            statement.setInt(1, id);
            statement.execute();
            
        } catch (SQLException | ClassNotFoundException | IOException | 
                ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ViewLecturer.class.getName()).log(Level.SEVERE, null, ex);
            error = true;
            
             JOptionPane.showMessageDialog(ViewLecturer.this, "Delete Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
         if(!error){
             JOptionPane.showMessageDialog(ViewLecturer.this, "Delete Succes", "Succes", JOptionPane.DEFAULT_OPTION);
             mod.removeRow(row);
             
             refreshTable();
         }
    }

    private void createTable(){
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        
        Object [] data = new Object[9];
        
        for(int i = 0;i < lecturers.size(); i++){
            data[0] = lecturers.get(i).getId();
            data[1] = lecturers.get(i).getName();
            data[2] = lecturers.get(i).getFaculty();
            data[3] = lecturers.get(i).getDepartment();
            data[4] = lecturers.get(i).getCenter();
            data[5] = lecturers.get(i).getBuilding();
            data[6] = lecturers.get(i).getRank();
            data[7] = "Edit";
            data[8] = "Delete";
            
            mod.addRow(data);
           
        }
        
    }
    /**
     * Refresh data table
     */
    protected void refreshTable(){
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        mod.setRowCount(0);
        try {
            Connection connection =  DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
            ResultSet resultSet = statement.executeQuery();
            
            
            Object [] data = new Object[9];
                
            while(resultSet.next()){
                Lecturer l = new Lecturer();
        
                data[0] = resultSet.getInt("id");
                data[1] = resultSet.getString("name");
                data[2] = resultSet.getString("faculty");
                data[3] = resultSet.getString("department");
                data[4] = resultSet.getString("center");
                data[5] = resultSet.getString("building");
                data[6] = resultSet.getString("rank");
                data[7] = "Edit";
                data[8] = "Delete"; 
           
               
                mod.addRow(data);
            }
        } catch (SQLException | ClassNotFoundException | IOException | 
                ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ViewLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
}
