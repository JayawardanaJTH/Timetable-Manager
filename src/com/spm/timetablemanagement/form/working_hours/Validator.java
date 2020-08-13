/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.working_hours;

import java.awt.Label;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author Tiran Harsha
 */
public class Validator {
    public static boolean validateLenght(String type, int hcount, int mcount){
        
        if(type.contains("hour")){
            
            if(hcount > 1)
                return true;
        }else{
           
            if(mcount > 2){
                
                return true;
            }
        }
        return false;
    }
    public static boolean filterInt(KeyEvent evt, String type, JLabel error){
        
        int key = evt.getKeyCode();
        
        if((key < 48) ||(key > 57) ){
            
            if((key < 96) || (key > 105)){
                 error.setText("Input only numbers");
                 if(type.contains("hour")){
                     evt.setKeyCode(1);
                      return true;
                 }
                 else{
                     evt.setKeyCode(1);
                     return true;
                 }
            }
            else
                error.setText("");
        }else{
            error.setText("");
        }
        return false;
    }
}
