/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.models;

/**
 *
 * @author hvdil
 */
public class GroupNo {
    private int id;
    private String gNo;
    
    public GroupNo(int ID, String gn){
        this.id = ID;
        this.gNo = gn;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getGn()
    {
        return gNo;
    }
    
}
