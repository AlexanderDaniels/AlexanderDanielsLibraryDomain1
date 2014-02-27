/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.ocp.violation;

import com.alex.tp.library.ocp.violation.Impl.SalaryServiceSubImpl;
import com.alex.tp.library.ocp.violation.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class SalSubAppConfig {
    @Bean(name = "salsub")
    
    public SalaryService getService(){
        return new SalaryServiceSubImpl();
    }
}
