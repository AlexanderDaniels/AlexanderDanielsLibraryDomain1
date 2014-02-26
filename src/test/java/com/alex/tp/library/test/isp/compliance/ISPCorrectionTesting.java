/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.test.isp.compliance;

import com.alex.tp.library.config.isp.compliance.PersonalDetailsAppConfig;
import com.alex.tp.library.config.isp.compliance.SalaryAppConfig;
import com.alex.tp.library.config.isp.compliance.TypeWorkerAppConfig;
import com.alex.tp.library.isp.compliance.PersonalDetailsService;
import com.alex.tp.library.isp.compliance.SalaryService;
import com.alex.tp.library.isp.compliance.TypeWorkerService;
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
public class ISPCorrectionTesting {
    private static ApplicationContext ctx;
    private static ApplicationContext ctx1;
    private static ApplicationContext ctx2;
    
    private static PersonalDetailsService personalDetails; 
    private static SalaryService salary;
    private static TypeWorkerService typeWorker;
    
    public ISPCorrectionTesting() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void personalDetailsTest() {
        Assert.assertEquals(personalDetails.name("Alexander"), "Alexander");
    }
    
    @Test
    public void salaryTest() {
        Assert.assertEquals(salary.salary(5000.00), 5001.00, 1.00);
    }
    
    @Test
    public void typeWorkerTest() {
        Assert.assertEquals(typeWorker.typeWork("Librarian"), "Librarian");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonalDetailsAppConfig.class);
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SalaryAppConfig.class);
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(TypeWorkerAppConfig.class);
        
        personalDetails = (PersonalDetailsService)ctx.getBean("personal");
        salary = (SalaryService)ctx1.getBean("salary");
        typeWorker = (TypeWorkerService)ctx2.getBean("type");
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