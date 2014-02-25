/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.srp.violation;

/**
 *
 * @author Alex
 */
public interface PersonDetailsService {
    String name(String nme);
    String surname(String srnme);
    String address(String addrs);
    int age(int age);
    String telephoneNum(String tele);
    String cellPhone(String cell);
}
