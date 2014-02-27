/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.dip.compliance;

import com.alex.tp.library.dip.compliance.Impl.SuperLibrarianServiceImpl;
import com.alex.tp.library.dip.compliance.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class SuperLibrarianAppConfig {
    @Bean(name="person2")
    
    public PersonService getService(){
        return new SuperLibrarianServiceImpl();
    }
}
