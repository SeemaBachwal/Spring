package com.springannotationsdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.springannotationsdemo")

// Injecting values from properties file
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// Instead of using @ComponentScan we create methods and return the bean using @Bean as shown below
	
	
	/* If you are using Spring 4.2 and lower, you will need to add the below code */
	// add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		
		return new SadFortuneService();
		
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
		
	}
}
