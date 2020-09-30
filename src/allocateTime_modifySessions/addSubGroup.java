/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hvdil
 */
public class addSubGroup extends javax.swing.JPanel {

    Connection connection;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form addSubGroup
     */
    public addSubGroup() {
        initComponents();
        txt_id.setVisible(false);
        SgIdSelection();
        showSubGroupIdIdList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_time_from = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_time_to = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_addSgId = new javax.swing.JButton();
        btn_updateSgId = new javax.swing.JButton();
        btn_deleteSgId = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        select_SgId = new javax.swing.JComboBox<>();
        select_day = new javax.swing.JComboBox<>();
        txt_error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SgId = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sub-Group ID");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Day");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Time Period");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("From");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_time_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_time_fromActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("To");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txt_time_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_time_toActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_addSgId.setBackground(new java.awt.Color(255, 255, 255));
        btn_addSgId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addSgId.setText("Insert");
        btn_addSgId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addSgId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSgIdActionPerformed(evt);
            }
        });
        jPanel3.add(btn_addSgId);

        btn_updateSgId.setBackground(new java.awt.Color(255, 255, 255));
        btn_updateSgId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_updateSgId.setText("Update");
        btn_updateSgId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateSgIdActionPerformed(evt);
            }
        });
        jPanel3.add(btn_updateSgId);

        btn_deleteSgId.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteSgId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteSgId.setText("Delete");
        btn_deleteSgId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteSgId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSgIdActionPerformed(evt);
            }
        });
        jPanel3.add(btn_deleteSgId);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel3.add(jButton1);

        select_SgId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        select_SgId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_SgIdActionPerformed(evt);
            }
        });

        select_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        select_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_dayActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(select_day, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(select_SgId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_time_to, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_time_from, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(select_SgId)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(select_day))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_time_from)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(txt_time_to))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tbl_SgId.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub-Group ID", "Day", "Time Period"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SgId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SgIdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SgId);
        if (tbl_SgId.getColumnModel().getColumnCount() > 0) {
            tbl_SgId.getColumnModel().getColumn(0).setResizable(false);
            tbl_SgId.getColumnModel().getColumn(1).setResizable(false);
            tbl_SgId.getColumnModel().getColumn(2).setResizable(false);
            tbl_SgId.getColumnModel().getColumn(3).setResizable(false);
        }

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 139, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(579, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3907, Short.MAX_VALUE))
        );

        add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_time_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_time_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_time_fromActionPerformed

    private void txt_time_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_time_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_time_toActionPerformed

    private void btn_addSgIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSgIdActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel model = (DefaultTableModel)tbl_SgId.getModel();
            connection = DBconnection.getConnection();

            if(select_SgId.getSelectedItem().equals("Select") && 
                    select_day.getSelectedItem().equals("Select") && 
                    txt_time_from.getText().equals("") && 
                    txt_time_from.getText().equals("")){
            
            txt_error.setText("Enter Deatils*");
            }
            else{
                txt_error.setText("");


                PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SP2_SUB_GROUP_WISE_TABLE));
                statement.setString(1, select_SgId.getSelectedItem().toString());
                statement.setString(2, select_day.getSelectedItem().toString());
                statement.setString(3, txt_time_from.getText());
                statement.setString(4, txt_time_to.getText());
                statement.executeUpdate();
                model.setRowCount(0);
                showSubGroupIdIdList();
                setDefault();
                JOptionPane.showMessageDialog(null, "Inserting Successful!");
                            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_addSgIdActionPerformed

    private void btn_updateSgIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateSgIdActionPerformed
        // TODO add your handling code here:
        String id =txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_SgId.getModel();
            Statement smt = connection.createStatement();

            if(txt_id.getText().equals("")){
                txt_error.setText("Select First*");
            }
            else{
                if(select_SgId.getSelectedItem().equals("Select") && 
                    select_day.getSelectedItem().equals("Select") && 
                    txt_time_from.getText().equals("") && 
                    txt_time_from.getText().equals("")){
            
                txt_error.setText("Enter Deatils*");
                }
                else{
                    txt_error.setText("");

                    smt.execute("UPDATE sp2_sub_group_wise SET sGid = '"+select_SgId.getSelectedItem().toString()+"',"
                        + "day = '"+select_day.getSelectedItem().toString()+"', "
                        + "time_from = '"+txt_time_from.getText()+"', "
                        + "time_to = '"+txt_time_to.getText()+"' WHERE id = "+id);
                    model.setRowCount(0);
                    showSubGroupIdIdList();
                    setDefault();
                    JOptionPane.showMessageDialog(null, "Record Updated!");
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_updateSgIdActionPerformed

    private void btn_deleteSgIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSgIdActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_SgId.getModel();
            Statement smt = connection.createStatement();

            if(txt_id.getText().equals("")){
                txt_error.setText("Select First*");
            }
            else{

                smt.execute("DELETE FROM sp2_sub_group_wise WHERE id = "+id);
                JOptionPane.showMessageDialog(null, "Record Deleted!");

            }
            model.setRowCount(0);
            showSubGroupIdIdList();
            txt_id.setText("");

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteSgIdActionPerformed

    private void select_SgIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_SgIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_select_SgIdActionPerformed

    private void select_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_dayActionPerformed

    private void tbl_SgIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SgIdMouseClicked
        // TODO add your handling code here:
        int i = tbl_SgId.getSelectedRow();
        TableModel model = tbl_SgId.getModel();
        String time[]= model.getValueAt(i,3).toString().split("-");
        
        txt_id.setText(model.getValueAt(i, 0).toString());
        select_SgId.setSelectedItem(model.getValueAt(i,1).toString());
        select_day.setSelectedItem(model.getValueAt(i,2).toString());
        txt_time_from.setText(time[0]);
        txt_time_to.setText(time[1]);

    }//GEN-LAST:event_tbl_SgIdMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        setDefault();
    }//GEN-LAST:event_jButton1MousePressed

    public  void SgIdSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from generated_sub_group_id";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String sGid = rs.getString("sGid");
            select_SgId.addItem(sGid);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public ArrayList<SubGroupId> GetSubGroupIdList()
    {
        ArrayList<SubGroupId> list = new ArrayList<SubGroupId>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from sp2_sub_group_wise";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        SubGroupId SGID;
        while(rs.next())
        {
            SGID = new SubGroupId(rs.getInt("id"), rs.getString("sGid"),rs.getString("day"),rs.getString("time_from"),rs.getString("time_to"));
            list.add(SGID);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSubGroupIdIdList()
    {
        ArrayList<SubGroupId> list = GetSubGroupIdList();
        DefaultTableModel model = (DefaultTableModel)tbl_SgId.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSGid();
            row[2] = list.get(i).getday();
            row[3] = list.get(i).gettime_from()+" - "+list.get(i).gettime_to();
            
            model.addRow(row);
        }
    }
    
    public void setDefault(){
        txt_time_from.setText("");
        txt_time_to.setText("");
        select_SgId.setSelectedIndex(0);
        select_day.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addSgId;
    private javax.swing.JButton btn_deleteSgId;
    private javax.swing.JButton btn_updateSgId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> select_SgId;
    private javax.swing.JComboBox<String> select_day;
    private javax.swing.JTable tbl_SgId;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_time_from;
    private javax.swing.JTextField txt_time_to;
    // End of variables declaration//GEN-END:variables
}
