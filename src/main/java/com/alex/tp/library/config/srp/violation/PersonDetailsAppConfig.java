/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.srp.violation;


import com.alex.tp.library.srp.violation.Impl.PersonDetailsServiceImpl;
import com.alex.tp.library.srp.violation.PersonDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class PersonDetailsAppConfig {
    @Bean(name="person")
    
    public PersonDetailsService getService(){
        return new PersonDetailsServiceImpl();        
    }
}
