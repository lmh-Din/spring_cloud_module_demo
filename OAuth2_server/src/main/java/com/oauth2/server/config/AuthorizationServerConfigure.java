package com.oauth2.server.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * @Description
 * @ClassName AuthorizationServerConfigure
 * @Author minghang.liu
 * @Date 2020/4/2 10:59
 * @Version v1.0
 */
@Configuration
@EnableAutoConfiguration
public class AuthorizationServerConfigure extends AuthorizationServerConfigurerAdapter {


}
