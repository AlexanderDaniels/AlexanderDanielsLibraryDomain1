/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.dip.compliance;

import com.alex.tp.library.config.dip.compliance.LibrarianAppConfig;
import com.alex.tp.library.config.dip.compliance.SuperLibrarianAppConfig;
import com.alex.tp.library.dip.compliance.Impl.LibrarianServiceImpl;
import com.alex.tp.library.dip.compliance.Impl.SuperLibrarianServiceImpl;
import com.alex.tp.library.dip.compliance.PersonService;
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
public class DIPCorrectionTesting {
    
    private static ApplicationContext ctx;
    private static ApplicationContext ctx1;
    private static PersonService personService1;
    private static PersonService personService2;
    
    
    public DIPCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void dipCorrectionTest() {
        Assert.assertNotSame(personService1.task("Pack Books."), personService2.task("Scan Books into the system, and Pack Books."));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LibrarianAppConfig.class);
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SuperLibrarianAppConfig.class);
        
        personService1 = (PersonService)ctx.getBean("person1");
        personService2 = (PersonService)ctx1.getBean("person2");
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