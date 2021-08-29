package com.myspringproject.MyJavaApp;

import org.springframework.stereotype.Component;

@Component
public class Plane implements Vehicle {

    public void drive()
    {
        System.out.println("Swoosh Swoosh");
    }

}
