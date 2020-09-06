/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.student_details;

/**
 *
 * @author hvdil
 */
public class YnS {
    
    private int id;
    private String yNs;
    
    public YnS(int ID, String yNs){
        this.id = ID;
        this.yNs = yNs;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getYnS()
    {
        return yNs;
    }
    
}
