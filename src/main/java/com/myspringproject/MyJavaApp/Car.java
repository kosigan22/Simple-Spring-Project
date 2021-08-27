package com.myspringproject.MyJavaApp;

import org.springframework.stereotype.Component;

@Component // This tag is the same as writing this '<bean id="car" class="com.myspringproject.MyJavaApp.Car"></bean>' in the xml file
                        // By default the id will be 'car'
public class Car implements Vehicle {

    public void drive()
    {
        System.out.println("Vroom Vroom");
    }

}
