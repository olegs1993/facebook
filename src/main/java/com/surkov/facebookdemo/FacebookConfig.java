package com.surkov.facebookdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

@Configuration
public class FacebookConfig {

    @Bean
    public Facebook facebook(){
        return new FacebookTemplate("asdasda");
    }
}
