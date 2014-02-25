/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.srp.violation.Impl;

import com.alex.tp.library.srp.violation.PersonDetailsService;

/**
 *
 * @author Alex
 */
public class PersonDetailsServiceImpl implements PersonDetailsService{

    public String name(String nme) {
        return nme;
    }

    public String surname(String srnme) {
        return srnme;
    }

    public String address(String addrs) {
        return addrs;
    }

    public int age(int age) {
        return age;
    }

    public String telephoneNum(String tele) {
        return tele;
    }

    public String cellPhone(String cell) {
        return cell;
    }
    
}
