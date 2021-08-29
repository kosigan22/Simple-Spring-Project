package com.myspringproject.MyJavaApp;

import org.springframework.stereotype.Component;

public class Bike implements Vehicle {

    public void drive()
    {
        System.out.println("Ring Ring");
    }
}
