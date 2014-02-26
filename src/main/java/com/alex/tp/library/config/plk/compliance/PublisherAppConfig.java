/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.config.plk.compliance;

import com.alex.tp.library.plk.compliance.Impl.PublisherServiceImpl;
import com.alex.tp.library.plk.compliance.PublisherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alex
 */
@Configuration
public class PublisherAppConfig {
    @Bean(name = "publisher")
    
    public PublisherService getService(){
        return new PublisherServiceImpl();
    }
}
