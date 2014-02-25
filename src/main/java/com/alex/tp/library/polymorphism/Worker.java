/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.polymorphism;

/**
 *
 * @author Alex
 */
public class Worker {
   private String name;
   private String address;
   private int number;
   
   public Worker(String name, String address, int number)
   {
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public String mailCheck()
   {
      return ("Mailing a check to " + this.name + " " + this.address);
   }
   
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public void setAddress(String newAddress)
   {
      address = newAddress;
   }
   public int getNumber()
   {
     return number;
   }
}
