/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.lecturer;

import com.spm.timetablemanagement.models.Building;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class AddLecturer extends javax.swing.JPanel {

    private ArrayList<Building> buildingList = new ArrayList();
    private ArrayList<String> faculty = new ArrayList();
    private ArrayList<String> center = new ArrayList();
    private ArrayList<String> level = new ArrayList();
    private ArrayList<String> department = new ArrayList();
    
    private static String buildings[];
    private static String faculties[];
    private static String centers[];
    private static String levels[];
    private static String departments[];
        
    private static PreparedStatement statement1, statement2, statement3, statement4;
    private static ResultSet resultSet;

    /**
     * Creates new form AddLecturer
     */
    public AddLecturer() {
        initComponents();
        execute();
        txt_lec_id.setDocument(new ChkCount((6)));
    }
    
    private void execute(){
        try {
            try {
                statement1 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_BUILDINGS));
                statement2 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_FACULTY));
                statement3 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_CENTER));
                statement4 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_LEVEL));
                
                resultSet = statement1.executeQuery();
                
                while(resultSet.next()){
                    Building building = new Building();
                    
                    building.setId(resultSet.getInt(1));
                    building.setName(resultSet.getString(2));
                    buildingList.add(building);
                    
                }
                resultSet.close();
                resultSet = statement2.executeQuery();
                
                while(resultSet.next()){
                    faculty.add(resultSet.getString("name"));
                }
                resultSet.close();
                resultSet = statement3.executeQuery();
                
                while(resultSet.next()){
                    center.add(resultSet.getString("name"));
                }
                resultSet.close();
                resultSet = statement4.executeQuery();
                
                while(resultSet.next()){
                    level.add(resultSet.getString("name"));
                }
                resultSet.close();
                
        } catch (ParserConfigurationException | SAXException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        buildings = new String[buildingList.size()];
        for(int i = 0; i < buildingList.size();i++){
            buildings[i] = buildingList.get(i).getName();
        }
        cmb_lec_building.setModel(new DefaultComboBoxModel<>(buildings));
        
        faculties = new String[faculty.size()+1];
        faculties[0] = "Select";
        for(int i = 1; i <= faculty.size();i++){
            faculties[i] = faculty.get(i-1);
        }
        cmb_lec_faculty.setModel(new DefaultComboBoxModel<>(faculties));
        
        centers = new String[center.size()];
        for(int i = 0; i < center.size();i++){
            centers[i] = center.get(i);
        }
        cmb_lec_center.setModel(new DefaultComboBoxModel<>(centers));
        
        levels = new String[level.size()];
        for(int i = 0; i < level.size();i++){
            levels[i] = level.get(i);
        }
        cmb_lec_level.setModel(new DefaultComboBoxModel<>(levels));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_lec_rank = new javax.swing.JTextField();
        txt_lec_name = new javax.swing.JTextField();
        txt_lec_id = new javax.swing.JTextField();
        cmb_lec_faculty = new javax.swing.JComboBox<>();
        cmb_lec_dept = new javax.swing.JComboBox<>();
        cmb_lec_center = new javax.swing.JComboBox<>();
        cmb_lec_building = new javax.swing.JComboBox<>();
        cmb_lec_level = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(90, 30, 172));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Lecturer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel1.setText("Name");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel2.setText("Employee ID");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel3.setText("Faculty");
        jLabel3.setMaximumSize(null);
        jLabel3.setMinimumSize(null);
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel4.setText("Department");
        jLabel4.setMaximumSize(null);
        jLabel4.setMinimumSize(null);
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel5.setText("Center");
        jLabel5.setMaximumSize(null);
        jLabel5.setMinimumSize(null);
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel6.setText("Building");
        jLabel6.setMaximumSize(null);
        jLabel6.setMinimumSize(null);
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel8.setText("Level");
        jLabel8.setMaximumSize(null);
        jLabel8.setMinimumSize(null);
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 30));

        jButton1.setText("Generate Rank");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMaximumSize(new java.awt.Dimension(80, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 20));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        txt_lec_rank.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_rank.setName(""); // NOI18N
        txt_lec_rank.setPreferredSize(new java.awt.Dimension(100, 20));

        txt_lec_name.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_name.setName(""); // NOI18N
        txt_lec_name.setPreferredSize(new java.awt.Dimension(100, 30));

        txt_lec_id.setMinimumSize(new java.awt.Dimension(60, 20));
        txt_lec_id.setName(""); // NOI18N
        txt_lec_id.setPreferredSize(new java.awt.Dimension(100, 30));

        cmb_lec_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmb_lec_faculty.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_faculty.setPreferredSize(new java.awt.Dimension(140, 30));
        cmb_lec_faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_lec_facultyActionPerformed(evt);
            }
        });

        cmb_lec_dept.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_dept.setPreferredSize(new java.awt.Dimension(140, 30));

        cmb_lec_center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_lec_center.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_center.setPreferredSize(new java.awt.Dimension(100, 30));

        cmb_lec_building.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_building.setPreferredSize(new java.awt.Dimension(140, 30));

        cmb_lec_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_lec_level.setMinimumSize(new java.awt.Dimension(100, 20));
        cmb_lec_level.setPreferredSize(new java.awt.Dimension(100, 30));

        btn_reset.setText("Reset");

        btn_save.setText("Save");
        btn_save.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_reset)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_lec_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_reset, btn_save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_lec_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lec_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 173, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_reset, btn_save});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
        txt_lec_rank.setText(cmb_lec_level.getSelectedItem().toString() + "." + txt_lec_id.getText());
    }//GEN-LAST:event_jButton1MousePressed

    private void cmb_lec_facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_lec_facultyActionPerformed
        int faculty = cmb_lec_faculty.getSelectedIndex();
        department.clear();
        try {
             statement1 = DBconnection.getConnection().prepareStatement(CreateQuery.getQuery(Constant.GET_DEPARTMENT));
             statement1.setInt(1, faculty);
             
             resultSet = statement1.executeQuery();
             
             while(resultSet.next()){
                 department.add(resultSet.getString("name"));
             }
             
             resultSet.close();
             departments = new String[department.size()];
             
            for(int i = 0; i < department.size();i++){
                departments[i] = department.get(i);
            }
            cmb_lec_dept.setModel(new DefaultComboBoxModel<>(departments));
             
        } catch (ParserConfigurationException | SAXException | SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_lec_facultyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cmb_lec_building;
    private javax.swing.JComboBox<String> cmb_lec_center;
    private javax.swing.JComboBox<String> cmb_lec_dept;
    private javax.swing.JComboBox<String> cmb_lec_faculty;
    private javax.swing.JComboBox<String> cmb_lec_level;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_lec_id;
    private javax.swing.JTextField txt_lec_name;
    private javax.swing.JTextField txt_lec_rank;
    // End of variables declaration//GEN-END:variables
}
class ChkCount extends PlainDocument{
    
    int limit;

    public ChkCount(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
       if(offs == limit)
           return;
       
       if( (getLength() + str.length()) <= limit){
           
           super.insertString(offs, str, a);
       }
    }
    
    
}