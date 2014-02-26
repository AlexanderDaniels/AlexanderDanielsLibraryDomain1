/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.plk.compliance;

import com.alex.tp.library.config.plk.compliance.AuthorAppConfig;
import com.alex.tp.library.config.plk.compliance.LibrarianAppConfig;
import com.alex.tp.library.config.plk.compliance.PublisherAppConfig;
import com.alex.tp.library.plk.compliance.AuthorService;
import com.alex.tp.library.plk.compliance.LibrarianService;
import com.alex.tp.library.plk.compliance.PublisherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class PLKCorrectionTesting {
    
    private static ApplicationContext ctx;
    private static ApplicationContext ctx1;
    private static ApplicationContext ctx2;
    
    private static AuthorService authorservice;
    private static PublisherService publisherservice;
    private static LibrarianService libservice;
    
    public PLKCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void plkCorrectionTesting() {
        
        Assert.assertEquals(libservice.bookName("Harry Potter"), "Harry Potter");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AuthorAppConfig.class);
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(PublisherAppConfig.class);
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(LibrarianAppConfig.class);
        
        authorservice = (AuthorService)ctx.getBean("author");
        publisherservice = (PublisherService)ctx1.getBean("publisher");
        libservice = (LibrarianService)ctx2.getBean("lib");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}