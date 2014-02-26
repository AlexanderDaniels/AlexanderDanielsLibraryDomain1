/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.plk.compliance.Impl;

import com.alex.tp.library.plk.compliance.AuthorService;
import com.alex.tp.library.plk.compliance.PublisherService;

/**
 *
 * @author Alex
 */
public class PublisherServiceImpl implements PublisherService{
    private AuthorServiceImpl a = new AuthorServiceImpl();
    public AuthorService getAuthorName() {
        return a;
    }
}
