/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.srp.compliance.Impl;

import com.alex.tp.library.srp.compliance.PersonalDetailsService;

/**
 *
 * @author Alex
 */
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

    public String name(String nme) {
        return nme;
    }

    public String surname(String srnme) {
        return srnme;
    }

    public int age(int age) {
        return age;
    }
    
}
