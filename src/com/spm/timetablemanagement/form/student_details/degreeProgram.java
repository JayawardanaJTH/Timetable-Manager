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
public class degreeProgram {
    
    private int id;
    private String dp;
    
    public degreeProgram(int ID, String dp){
        this.id = ID;
        this.dp = dp;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getDP()
    {
        return dp;
    }
    
}
