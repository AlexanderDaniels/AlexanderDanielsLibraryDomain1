/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.dip.violation.Impl;

/**
 *
 * @author Alex
 */
public class Owner {
    
    LibrarianServiceImpl person;
    String toDo;
    
    public void setLibrarian(LibrarianServiceImpl p){
        person = p;
    }
    
    public void owner(){
        person.task(toDo);
    }
}
