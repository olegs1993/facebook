package com.surkov.facebookdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

@Configuration
public class FacebookConfig {

    @Bean
    public Facebook facebook(){
        return new FacebookTemplate("EAAiCHL4e8fkBANNFtR9uSwLnU0MuWalKlzZC8ZAibWlEintMBXS2NYbVFYnqRKOBo0rMEsZAZC134oZAltMJivH2AffFkAzhcmmyP6hsSQShLfSZBDiL32IQOes1bmkKv6lxKgtuRbcbZBBwbVz5E72WDOZAFthZAbst3QUsMqiX8BQZDZD");
    }
}
