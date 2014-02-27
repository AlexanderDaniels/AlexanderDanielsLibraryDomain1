/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.dip.compliance.Impl;

import com.alex.tp.library.dip.compliance.PersonService;

/**
 *
 * @author Alex
 */
public class Owner {
    
    PersonService person;
    String toDo;
    
    public void setLibrarian(PersonService p){
        person = p;
    }
    
    public void owner(){
        person.task(toDo);
    }
}
