/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.isp.compliance;

import com.alex.tp.library.isp.compliance.Impl.SalaryServiceImpl;
import com.alex.tp.library.isp.compliance.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class SalaryAppConf {
    @Bean(name="salary")
    
    public SalaryService getService(){
        return new SalaryServiceImpl();
    }
}
