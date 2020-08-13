/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.main;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import com.spm.timetablemanagement.menu.MenuItem;
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
        MenuItem s1IDGenerate = new MenuItem(iconSubmenu, "Group ID");
        MenuItem s2IDGenerate = new MenuItem(iconSubmenu, "Sub-Group ID");
        
        //Lecturer submenu items
        MenuItem s1Lecturer = new MenuItem(iconSubmenu, "Add Lecturer Details");
        MenuItem s2Lecturer = new MenuItem(iconSubmenu, "View Lecturer Details");
        
        //Student submenu items
        MenuItem s1Student = new MenuItem(iconSubmenu, "Add Student Details");
        MenuItem s2Student = new MenuItem(iconSubmenu, "ID Generates", s1IDGenerate, s2IDGenerate);
        MenuItem s3Student = new MenuItem(iconSubmenu, "View Student Details");
        
        //WorkingDay submenu items
        MenuItem s1WorkingDay = new MenuItem(iconSubmenu, "Weekday Details");
        MenuItem s2WorkingDay = new MenuItem(iconSubmenu, "Weekend Details");
        MenuItem s3WorkingDay = new MenuItem(iconSubmenu, "View Details");
        MenuItem s4WorkingDay = new MenuItem(iconSubmenu, "Edit Details");
        
        //Subject submenu items
        MenuItem s1Subject = new MenuItem(iconSubmenu, "Add Subject Details");
        MenuItem s2Subject = new MenuItem(iconSubmenu, "View Subject Details");
        
        //Location submenu items
        MenuItem s1Location = new MenuItem(iconSubmenu, "Add Location Details");
        MenuItem s2Location = new MenuItem(iconSubmenu, "View Location Details");
        
        //Tag submenu items Statistics
        MenuItem s1Tag = new MenuItem(iconSubmenu, "Add Tag Details");
        MenuItem s2Tag = new MenuItem(iconSubmenu, "View Tag Details");
        
        //Statistics submenu items Allocate Room
        MenuItem s1Statistics = new MenuItem(iconSubmenu, "View Statistics Details");
        
        //Allocate Room submenu items Allocate Room
        MenuItem s1AllocateRoom = new MenuItem(iconSubmenu, "Reserve Rooms");
        
        //Handle Session submenu items
        MenuItem s1HandleSession = new MenuItem(iconSubmenu, "Create Sessions");
        MenuItem s2HandleSession = new MenuItem(iconSubmenu, "View Sessions");
        MenuItem s3HandleSession = new MenuItem(iconSubmenu, "Search Sessions");
        
        //Allocate Time Session submenu items
        MenuItem s1AllocateTime = new MenuItem(iconSubmenu, "Allocate Not Available Time");
        MenuItem s2AllocateTime = new MenuItem(iconSubmenu, "Consective Sessions");
        MenuItem s3AllocateTime = new MenuItem(iconSubmenu, "Parallel Sessions");
        
        //Generate Timetable submenu items
        MenuItem s1GenerateTimeTable = new MenuItem(iconSubmenu, "Generate");
        MenuItem s2GenerateTimeTable = new MenuItem(iconSubmenu, "View Time Table");
        
        //main menu items
        MenuItem menuHome = new MenuItem(iconSubmenu, "Home");
        MenuItem menuLecturer = new MenuItem(iconWorkingDay, "Lecturer", s1Lecturer, s2Lecturer);
        MenuItem menuStudent = new MenuItem(iconWorkingDay, "Student", s1Student, s2Student, s3Student);
        MenuItem menuWorkingDay = new MenuItem(iconWorkingDay, "Working Day and Hours",s1WorkingDay,
                s2WorkingDay, s3WorkingDay, s4WorkingDay);
        MenuItem menuSubject = new MenuItem(iconSubmenu, "Subject", s1Subject, s2Subject);
        MenuItem menuLocation = new MenuItem(iconSubmenu, "Location", s1Location, s2Location);
        MenuItem menuTag = new MenuItem(iconSubmenu, "Tag", s1Tag, s2Tag);
        MenuItem menuStatistics = new MenuItem(iconSubmenu, "Statistics", s1Statistics);
        MenuItem menuAllocateRoom = new MenuItem(iconSubmenu, "Allocate Room", s1AllocateRoom);
        MenuItem menuCreateSession = new MenuItem(iconSubmenu, "Handle Session", s1HandleSession, 
                s2HandleSession, s3HandleSession);
        MenuItem menuAllTime = new MenuItem(iconSubmenu, "Allocate Time and Modify Sessions", s1AllocateTime,
                s2AllocateTime, s3AllocateTime);
        MenuItem menuView = new MenuItem(iconSubmenu, "View Details");
        MenuItem menuGenerateTimetable = new MenuItem(iconSubmenu, "Generate Timetable", s1GenerateTimeTable, 
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

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

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
