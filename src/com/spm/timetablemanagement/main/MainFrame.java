/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.main;

import com.spm.timetablemanagement.form.working_hours.EditWorkingDayHours;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import com.spm.timetablemanagement.menu.MenuItem;
import com.spm.timetablemanagement.form.working_hours.InsertWorkingHoursWD;
import com.spm.timetablemanagement.form.working_hours.InsertWorkingHoursWE;
import com.spm.timetablemanagement.form.working_hours.ViewWorkingDayHours;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiran Harsha
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        execute();
    }

    private void execute(){
        ImageIcon iconWorkingDay = null;
        ImageIcon iconSubmenu = null;
        try{
         iconWorkingDay = new ImageIcon(MainFrame.class.getResource("workingTime.png"));
         iconSubmenu = new ImageIcon(getClass().getResource("/com/spm/timetablemanagement/resource/images/next.png"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //ID generates sub items
        MenuItem s1IDGenerate = new MenuItem(iconSubmenu, "Group ID", null);
        MenuItem s2IDGenerate = new MenuItem(iconSubmenu, "Sub-Group ID", null);
        
        //Lecturer submenu items
        MenuItem s1Lecturer = new MenuItem(iconSubmenu, "Add Lecturer Details", null);
        MenuItem s2Lecturer = new MenuItem(iconSubmenu, "View Lecturer Details", null);
        
        //Student submenu items
        MenuItem s1Student = new MenuItem(iconSubmenu, "Add Student Details", null);
        MenuItem s2Student = new MenuItem(iconSubmenu, "ID Generates", null, s1IDGenerate, s2IDGenerate);
        MenuItem s3Student = new MenuItem(iconSubmenu, "View Student Details", null);
        
        //WorkingDay submenu items
        MenuItem s1WorkingDay = new MenuItem(iconSubmenu, "Weekday Details",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               panelBody.removeAll();
               panelBody.add(new InsertWorkingHoursWD());
               panelBody.repaint();
               panelBody.revalidate();
            }
        });
        MenuItem s2WorkingDay = new MenuItem(iconSubmenu, "Weekend Details", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new InsertWorkingHoursWE());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem s3WorkingDay = new MenuItem(iconSubmenu, "View Details", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new ViewWorkingDayHours());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem s4WorkingDay = new MenuItem(iconSubmenu, "Edit Details", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new EditWorkingDayHours());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        //Subject submenu items
        MenuItem s1Subject = new MenuItem(iconSubmenu, "Add Subject Details", null);
        MenuItem s2Subject = new MenuItem(iconSubmenu, "View Subject Details", null);
        
        //Location submenu items
        MenuItem s1Location = new MenuItem(iconSubmenu, "Add Location Details", null);
        MenuItem s2Location = new MenuItem(iconSubmenu, "View Location Details", null);
        
        //Tag submenu items Statistics
        MenuItem s1Tag = new MenuItem(iconSubmenu, "Add Tag Details", null);
        MenuItem s2Tag = new MenuItem(iconSubmenu, "View Tag Details", null);
        
        //Statistics submenu items Allocate Room
        MenuItem s1Statistics = new MenuItem(iconSubmenu, "View Statistics Details", null);
        
        //Allocate Room submenu items Allocate Room
        MenuItem s1AllocateRoom = new MenuItem(iconSubmenu, "Reserve Rooms", null);
        
        //Handle Session submenu items
        MenuItem s1HandleSession = new MenuItem(iconSubmenu, "Create Sessions", null);
        MenuItem s2HandleSession = new MenuItem(iconSubmenu, "View Sessions", null);
        MenuItem s3HandleSession = new MenuItem(iconSubmenu, "Search Sessions", null);
        
        //Allocate Time Session submenu items
        MenuItem s1AllocateTime = new MenuItem(iconSubmenu, "Allocate Not Available Time", null);
        MenuItem s2AllocateTime = new MenuItem(iconSubmenu, "Consective Sessions", null);
        MenuItem s3AllocateTime = new MenuItem(iconSubmenu, "Parallel Sessions", null);
        
        //Generate Timetable submenu items
        MenuItem s1GenerateTimeTable = new MenuItem(iconSubmenu, "Generate", null);
        MenuItem s2GenerateTimeTable = new MenuItem(iconSubmenu, "View Time Table", null);
        
        //main menu items
        MenuItem menuHome = new MenuItem(iconSubmenu, "Home", null);
        MenuItem menuLecturer = new MenuItem(iconWorkingDay, "Lecturer", null, s1Lecturer, s2Lecturer);
        MenuItem menuStudent = new MenuItem(iconWorkingDay, "Student", null, s1Student, s2Student, s3Student);
        MenuItem menuWorkingDay = new MenuItem(iconWorkingDay, "Working Day and Hours", null,s1WorkingDay,
                s2WorkingDay, s3WorkingDay, s4WorkingDay);
        MenuItem menuSubject = new MenuItem(iconSubmenu, "Subject", null, s1Subject, s2Subject);
        MenuItem menuLocation = new MenuItem(iconSubmenu, "Location", null, s1Location, s2Location);
        MenuItem menuTag = new MenuItem(iconSubmenu, "Tag", null, s1Tag, s2Tag);
        MenuItem menuStatistics = new MenuItem(iconSubmenu, "Statistics", null, s1Statistics);
        MenuItem menuAllocateRoom = new MenuItem(iconSubmenu, "Allocate Room", null, s1AllocateRoom);
        MenuItem menuCreateSession = new MenuItem(iconSubmenu, "Handle Session", null, s1HandleSession, 
                s2HandleSession, s3HandleSession);
        MenuItem menuAllTime = new MenuItem(iconSubmenu, "Allocate Time and Modify Sessions", null, s1AllocateTime,
                s2AllocateTime, s3AllocateTime);
        MenuItem menuView = new MenuItem(iconSubmenu, "View Details", null);
        MenuItem menuGenerateTimetable = new MenuItem(iconSubmenu, "Generate Timetable", null, s1GenerateTimeTable, 
                s2GenerateTimeTable);
        
        
        
        addMenu(menuHome, menuLecturer, menuStudent, menuWorkingDay, menuSubject, menuLocation, 
                menuTag, menuStatistics, menuAllocateRoom, menuCreateSession, menuAllTime, menuView, 
                    menuGenerateTimetable);
    }
    
    private void addMenu(MenuItem... menu){
        
        ArrayList<MenuItem> subMenu = new ArrayList();
        
        for(int i = 0; i < menu.length; i++){
            
            menus.add(menu[i]);
            
            subMenu = menu[i].getSubMenu();
            
            for(int j = 0; j < subMenu.size(); j++){
                addMenu(subMenu.get(j));
                
            }
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

        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(13, 125, 231));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABC Institute");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time Table Management System");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setPreferredSize(new java.awt.Dimension(250, 413));
        panelMenu.setRequestFocusEnabled(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 820, 550);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
