/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.plk.violation;

import com.alex.tp.library.plk.violation.Impl.LibrarianServiceImpl;
import com.alex.tp.library.plk.violation.LibrarianService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class LibrarianAppConfig {
    @Bean(name = "lib")
    
    public LibrarianService getService(){
        return new LibrarianServiceImpl();
    }
}
