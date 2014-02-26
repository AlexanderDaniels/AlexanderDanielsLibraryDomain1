/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.srp.compliance;

import com.alex.tp.library.srp.compliance.Impl.PersonalDetailsServiceImpl;
import com.alex.tp.library.srp.compliance.PersonalDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class PersonalDetailsAppConfig {
    
    @Bean(name = "personaldetails")
    
    public PersonalDetailsService getService(){
        return new PersonalDetailsServiceImpl();
    }
}
