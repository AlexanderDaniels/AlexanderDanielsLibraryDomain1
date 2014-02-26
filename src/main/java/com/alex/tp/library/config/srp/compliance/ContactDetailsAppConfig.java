/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.srp.compliance;

import com.alex.tp.library.srp.compliance.ContactDetailsService;
import com.alex.tp.library.srp.compliance.Impl.ContactDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class ContactDetailsAppConfig {
    
    @Bean(name = "contactdetails")
    
    public ContactDetailsService getService(){
        return new ContactDetailsServiceImpl();
    }
}
