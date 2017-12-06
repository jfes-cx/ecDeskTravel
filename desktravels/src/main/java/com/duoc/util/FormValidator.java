/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.util;

import java.awt.*;
import javax.swing.*;
 
public class FormValidator {
    public static final int INTEGER=0;
    public static final int BYTE=1;
    public static final int LONG=2;
    public static final int DOUBLE=3;
     
    public static boolean isVacioComponents(Component[] cs) {
        for(Component c : cs) {
            if(c instanceof JTextField) {
                if(((JTextField)c).isEnabled())
                    if(((JTextField)c).getText().length()<1) return true;
            } else if(c instanceof JComboBox) {
                if(((JComboBox)c).getSelectedIndex() == 0) return true;
            } else if(c instanceof JPanel) {
                if(isVacioComponents(((JPanel)c).getComponents())) return true;
            }
        }
        return false;
    }
    
    public static void emptyComponent(Component c) {
    
            if(c instanceof JTextField) {
                ((JTextField)c).setText("");  
            } else if(c instanceof JComboBox) {
                ((JComboBox)c).setSelectedItem(null);
            }

    }
    
    public static boolean validarComponentes(Component[] cs) {
        for(Component c : cs) {
            if(c instanceof JTextField) {
                if(((JTextField)c).isEnabled())
                    if(((JTextField)c).getText().length()<1) return true;
            } else if(c instanceof JComboBox) {
                if(((JComboBox)c).getSelectedIndex() == 0) return true;
            } else if(c instanceof JPanel) {
                if(isVacioComponents(((JPanel)c).getComponents())) return true;
            }
        }
        return false;
    }
        
    public static boolean is(String v,int w) {
        try {
            switch(w) {
                case 0: Integer.parseInt(v); break;
                case 1: Byte.parseByte(v); break;
                case 2: Long.parseLong(v); break;
                case 3: Double.parseDouble(v); break;
            }
            return true;
        } catch(Exception e) {}
        return false;
    }
}