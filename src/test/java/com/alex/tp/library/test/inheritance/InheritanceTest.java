/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.inheritance;

import com.alex.tp.library.inheritance.Customer;
import com.alex.tp.library.inheritance.Worker;
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
public class InheritanceTest {
    
    public InheritanceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void customerNameTest() {
       Customer c = new Customer();
       
       Assert.assertEquals("Jacob", c.name("Jacob"));       
    }
    
    @Test
    public void workerSurnameTest() {
        Worker w = new Worker();
        
        Assert.assertEquals("Kroning", w.surname("Kroning"));
    }
    
    @Test
    public void customertelephoneNumTest() {
        Customer c = new Customer();
        Assert.assertEquals(123, c.telephoneNum(123));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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