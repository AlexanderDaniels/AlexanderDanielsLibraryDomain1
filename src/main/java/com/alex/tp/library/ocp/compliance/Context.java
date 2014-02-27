/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.ocp.compliance;

/**
 *
 * @author Alex
 */
public class Context {
    private SalaryService salary;
    int sal;
    public int doSalary(int sal){
        if(this.salary != null)
            return this.salary.doSalary(sal);
        return sal;
    }
    
    public void setSalary(SalaryService salary){
        this.salary = salary;
    }
}
