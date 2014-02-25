/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test;

import com.alex.tp.library.encapsulation.BookDetails;
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
public class EncapsulationTest {
    
    public EncapsulationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void bookNameTest() {        
        BookDetails bookDetails = new BookDetails();
        bookDetails.setBookName("Java made easy");        
        
        Assert.assertEquals("Java made easy", bookDetails.getBookName());        
    }
    
    @Test
    public void bookIsbnNumTest() {        
        BookDetails bookDetails = new BookDetails();        
        bookDetails.setIsbnNum(123456789);        
        
        Assert.assertEquals(123456789, bookDetails.getIsbnNum());
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