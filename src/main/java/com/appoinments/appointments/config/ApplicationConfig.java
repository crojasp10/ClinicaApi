package com.appoinments.appointments.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan(basePackages = "com.appoinments.appointments")
public class ApplicationConfig extends WebMvcConfigurationSupport {

}
