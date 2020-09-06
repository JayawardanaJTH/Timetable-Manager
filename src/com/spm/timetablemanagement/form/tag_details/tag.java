/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.tag_details;

/**
 *
 * @author hvdil
 */
public class tag {
    
    private int id;
    private String tag;
    
    public tag(int ID, String tag){
        this.id = ID;
        this.tag = tag;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getTag()
    {
        return tag;
    }
}
