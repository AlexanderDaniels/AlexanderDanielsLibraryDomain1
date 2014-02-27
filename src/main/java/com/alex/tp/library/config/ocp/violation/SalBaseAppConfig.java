/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.ocp.violation;

import com.alex.tp.library.ocp.violation.Impl.SalaryServiceBaseImpl;
import com.alex.tp.library.ocp.violation.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class SalBaseAppConfig {
    @Bean(name = "salbase")
    
    public SalaryService getService(){
        return new SalaryServiceBaseImpl();
    }
}
