/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.isp.compliance;

import com.alex.tp.library.isp.compliance.Impl.TypeWorkerServiceImpl;
import com.alex.tp.library.isp.compliance.TypeWorkerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class TypeWorkerAppConfig {
    @Bean(name="type")
    
    public TypeWorkerService getService(){
        return new TypeWorkerServiceImpl();
    }
}
