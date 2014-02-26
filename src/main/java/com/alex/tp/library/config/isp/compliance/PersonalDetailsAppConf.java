/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.isp.compliance;

import com.alex.tp.library.isp.compliance.Impl.PersonalDetailsServiceImpl;
import com.alex.tp.library.isp.compliance.PersonalDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class PersonalDetailsAppConf {
    @Bean(name="personal")
    
    public PersonalDetailsService getService(){
        return new PersonalDetailsServiceImpl();
    }
}
