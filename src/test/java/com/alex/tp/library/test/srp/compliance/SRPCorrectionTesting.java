/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.srp.compliance;

import com.alex.tp.library.config.srp.compliance.ContactDetailsAppConfig;
import com.alex.tp.library.config.srp.compliance.PersonalDetailsAppConfig;
import com.alex.tp.library.srp.compliance.ContactDetailsService;
import com.alex.tp.library.srp.compliance.Impl.PersonalDetailsServiceImpl;
import com.alex.tp.library.srp.compliance.PersonalDetailsService;
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
public class SRPCorrectionTesting {
    
    private static ApplicationContext ctx;
    private static ApplicationContext ctx1;
    private static PersonalDetailsService personalService;
    private static ContactDetailsService contactService;
    
    public SRPCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void personalDetailsTest() {
        Assert.assertEquals(personalService.name("Alex"), "Alex");
    }
    
    @Test
    public void contactDetailsTest() {
        Assert.assertEquals(contactService.address("20 Akker Street"), "20 Akker Street");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonalDetailsAppConfig.class);
        personalService = (PersonalDetailsService)ctx.getBean("personaldetails");
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(ContactDetailsAppConfig.class);
        contactService = (ContactDetailsService)ctx1.getBean("contactdetails");
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