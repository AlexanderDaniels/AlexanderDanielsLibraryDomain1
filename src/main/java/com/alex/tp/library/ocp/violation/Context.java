/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.ocp.violation;

import com.alex.tp.library.ocp.violation.Impl.SalaryServiceBaseImpl;

/**
 *
 * @author Alex
 */
public class Context {
    private SalaryServiceBaseImpl salBase;
    
    String salalryType(String type){
        return salBase.salaryType(type);               
    }
    
    public void setBase(SalaryServiceBaseImpl salBase){
        this.salBase = salBase;
    }
}
