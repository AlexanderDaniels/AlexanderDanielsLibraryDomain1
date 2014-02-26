/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.srp.violation;

import com.alex.tp.library.config.srp.violation.PersonDetailsAppConfig;
import com.alex.tp.library.srp.violation.PersonDetailsService;
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
public class SRPViolationTesting {
    
    private static ApplicationContext ctx;
    private static PersonDetailsService person;
    
    public SRPViolationTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void srpViolationName() {
        Assert.assertEquals("Riaad", person.name("Riaad"));
    }
    
    @Test
    public void srpViolationAge() {
        Assert.assertEquals(15, person.age(15));
    }
    
    @Test
    public void srpViolationAddress() {
        Assert.assertEquals("1 Long Street", person.address("1 Long Street"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonDetailsAppConfig.class);
        person = (PersonDetailsService)ctx.getBean("person");
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