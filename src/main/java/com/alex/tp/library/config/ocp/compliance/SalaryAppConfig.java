/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.ocp.compliance;

import com.alex.tp.library.ocp.compliance.Impl.SalaryServiceImpl;
import com.alex.tp.library.ocp.compliance.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class SalaryAppConfig {
    @Bean(name="salary")
    
    public SalaryService getService(){
        return new SalaryServiceImpl();
    }
}
