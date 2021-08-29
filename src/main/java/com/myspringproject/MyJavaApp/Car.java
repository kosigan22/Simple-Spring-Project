package com.myspringproject.MyJavaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This tag is the same as writing this '<bean id="car" class="com.myspringproject.MyJavaApp.Car"></bean>' in the xml file
                        // By default the id will be 'car'
public class Car implements Vehicle {

    @Autowired
    private Engine engine; // instead including this property in the spring.xml we can take advantage of annotations

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void rev()
    {
        System.out.println("Engine -> " + engine);
    }

    public void drive()
    {
        System.out.println("Vroom Vroom");
    }

}
