/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.ocp.compliance;

import com.alex.tp.library.config.ocp.compliance.SalaryAppConfig;
import com.alex.tp.library.ocp.compliance.SalaryService;
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
public class OCPCorrectionTesting {
    
    private static ApplicationContext ctx;
    private static SalaryService salService;
    
    public OCPCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ocpCorrectionTesting() {
        Assert.assertEquals(salService.doSalary(5000), 5000);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SalaryAppConfig.class);
        salService = (SalaryService)ctx.getBean("salary");
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