/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.dip.violation;

import com.alex.tp.library.dip.violation.Impl.LibrarianServiceImpl;
import com.alex.tp.library.dip.violation.Impl.Owner;
import com.alex.tp.library.dip.violation.Impl.SuperLibrarianServiceImpl;
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
public class DIPViolationTesting {
    
    private static Owner owner;
    private static LibrarianServiceImpl lib;
    private static SuperLibrarianServiceImpl superLib;
    
    public DIPViolationTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void dipViolationTest() {
    Assert.assertNull(owner);
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