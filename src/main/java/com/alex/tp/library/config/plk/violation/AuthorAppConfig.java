/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.plk.violation;

import com.alex.tp.library.plk.violation.AuthorService;
import com.alex.tp.library.plk.violation.Impl.AuthorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class AuthorAppConfig {
    @Bean(name = "author")
    
    public AuthorService getService(){
        return new AuthorServiceImpl();
    }
}
