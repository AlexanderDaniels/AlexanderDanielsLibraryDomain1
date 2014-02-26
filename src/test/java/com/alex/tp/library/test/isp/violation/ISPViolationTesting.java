/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.isp.violation;

import com.alex.tp.library.config.isp.violation.PersonDetailsAppConfig;
import com.alex.tp.library.isp.violation.PersonDetailsService;
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
public class ISPViolationTesting {
    
    private static ApplicationContext ctx;
    private static PersonDetailsService persondet;
    
    public ISPViolationTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispNameViolationTest() {
        Assert.assertEquals(persondet.typeWork("Librarian"), "Librarian");
    }
    
    @Test
    public void ispSalaryViolationTest() {
        Assert.assertEquals(persondet.salary(20000.00), 25000.00, 10000.00);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonDetailsAppConfig.class);
        
        persondet = (PersonDetailsService)ctx.getBean("person");
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