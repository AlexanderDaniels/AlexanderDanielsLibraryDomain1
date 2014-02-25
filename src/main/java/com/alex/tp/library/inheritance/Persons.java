/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.inheritance;

/**
 *
 * @author Alex
 */
public class Persons implements Human{
    
    public String name(String nme) {
        return nme;
    }

    public String surname(String srnme) {
        return srnme;
    }

    public int telephoneNum(int telPhNum) {
        return telPhNum;
    }    
}
