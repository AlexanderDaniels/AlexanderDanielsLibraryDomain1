/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.polymorphism;

import com.alex.tp.library.polymorphism.services.Salary;
import com.alex.tp.library.polymorphism.services.Worker;
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
public class PolymorphismTest {
    
    public PolymorphismTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void workerSalaryTest() {
        Salary s = new Salary("Jakob", "12 Boom street", 12345, 50000.00);
        Worker w = new Salary("Jakob", "12 Boom street", 12345, 50000.00);
        
        Assert.assertEquals(w.mailCheck(), s.mailCheck());// uses the same mailCheck from the Salary class, Worker class object is instance made of Salary class.
    }
    
    @Test
    public void workerSalaryTest2() {
        Salary s = new Salary("Jakob", "12 Boom street", 12345, 50000.00);
        Worker w = new Worker("Jakob", "12 Boom street", 12345);
        
        Assert.assertNotSame(w.mailCheck(), s.mailCheck());// checking the mailcheck in the Salary class with the one in the Worker class 
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