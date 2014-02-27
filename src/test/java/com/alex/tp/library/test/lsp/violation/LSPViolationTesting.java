/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.lsp.violation;

import com.alex.tp.library.lsp.violation.Impl.Librarian;
import com.alex.tp.library.lsp.violation.Impl.Owner;
import com.alex.tp.library.lsp.violation.PersonService;
import com.alex.tp.library.lsp.violation.Impl.PersonServiceImpl;
import java.util.ArrayList;
import java.util.List;
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
public class LSPViolationTesting {
    
    public LSPViolationTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        List<PersonService> person = new ArrayList<PersonService>();
        person.add(new PersonServiceImpl());
        person.add(new Librarian());
        person.add(new Owner());
        
        for(PersonService p : person)
            p.name(null);
        Assert.assertNotNull(person);
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