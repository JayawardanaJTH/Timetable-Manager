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
public class SubGroupNo {
    private int id;
    private String SGno;
    
    public SubGroupNo(int ID, String sgn){
        this.id = ID;
        this.SGno = sgn;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getSGno()
    {
        return SGno;
    }
}
