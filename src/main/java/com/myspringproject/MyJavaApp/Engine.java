package com.myspringproject.MyJavaApp;

public class Engine {

    private  String brand;

    private int voltage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "brand='" + brand + '\'' +
                ", voltage=" + voltage +
                '}';
    }
}
