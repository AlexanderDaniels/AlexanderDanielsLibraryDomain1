/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.ocp.violation;

import com.alex.tp.library.config.ocp.violation.SalBaseAppConfig;
import com.alex.tp.library.config.ocp.violation.SalSubAppConfig;
import com.alex.tp.library.ocp.violation.Impl.SalaryServiceBaseImpl;
import com.alex.tp.library.ocp.violation.Impl.SalaryServiceSubImpl;
import com.alex.tp.library.ocp.violation.SalaryService;
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
public class OCPViolationTesting {
    
    private static ApplicationContext ctx;
    private static ApplicationContext ctx1;
    private static SalaryService salary1;
    private static SalaryService salary2;
    
    public OCPViolationTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ocpViolationTesting() {
        Assert.assertEquals(salary1.salaryType("Above Average"), salary2.salaryType("Above Average"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SalBaseAppConfig.class);
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SalSubAppConfig.class);
        
        salary1 = (SalaryService)ctx.getBean("salbase");
        salary2 = (SalaryService)ctx1.getBean("salsub");
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