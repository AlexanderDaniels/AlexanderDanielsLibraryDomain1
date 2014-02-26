/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.plk.compliance;

import com.alex.tp.library.config.plk.compliance.LibrarianAppConfig;
import com.alex.tp.library.plk.compliance.LibrarianService;
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
    private static LibrarianService libservice;
    
    public PLKCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void plkCorrectionTesting() {
        
        String name = libservice.getAuthorName().getAuthorName().authorName("Addison");
        Assert.assertEquals("Addison", name);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LibrarianAppConfig.class);        
        libservice = (LibrarianService)ctx.getBean("lib");
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