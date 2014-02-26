/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.plk.compliance.Impl;

import com.alex.tp.library.plk.compliance.LibrarianService;
import com.alex.tp.library.plk.compliance.PublisherService;

/**
 *
 * @author Alex
 */
public class LibrarianServiceImpl implements LibrarianService{
    private PublisherServiceImpl p = new PublisherServiceImpl();
    public PublisherService getAuthorName() {
        return  p;   
    }
}
