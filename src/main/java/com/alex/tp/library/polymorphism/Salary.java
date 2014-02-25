/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.polymorphism;

/**
 *
 * @author Alex
 */
public class Salary extends Worker{
    
   private double salary; 
   public Salary(String name, String address, int number, double
      salary)
   {
       super(name, address, number);
       this.salary = salary;
   }
   
   public String mailCheck()
   {
       return ("Mailing check to " + getName()
       + " with salary " + salary);
   }
   
   public double getSalary()
   {
       return salary;
   }
   
   public void setSalary(double newSalary)
   {
       if(newSalary >= 0.0)
       {
          salary = newSalary;
       }
   }
   
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}
