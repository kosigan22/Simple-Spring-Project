package com.myspringproject.MyJavaApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// getBean() and @Autowired will look through this config file and find the method that returns the object type it is looking for
@Configuration
@ComponentScan(basePackages = "com.myspringproject.MyJavaApp") // with this line the @Bean properties do not need to be specified  (As long as the objects have @Component tags)
public class AnnotationConfig {

    @Bean // bean is an object that is instantiated, assembled, and otherwise managed by a Spring
    public Bike getBike()
    {
        return new Bike();
    }

    // the @Bean tag is a replacement for <beans>     <bean id="vehicle" class="com.myspringproject.MyJavaApp.Car"></bean> </beans>
}
