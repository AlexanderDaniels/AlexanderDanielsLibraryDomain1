/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.plk.violation.Impl;

import com.alex.tp.library.plk.violation.LibrarianService;
import com.alex.tp.library.plk.violation.AuthorService;

/**
 *
 * @author Alex
 */
public class LibrarianServiceImpl implements LibrarianService{
    private AuthorServiceImpl p = new AuthorServiceImpl();
    public AuthorService getAuthorName() {
        return p;   
    }
}
