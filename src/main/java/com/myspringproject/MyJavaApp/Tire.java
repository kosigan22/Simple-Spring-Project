package com.myspringproject.MyJavaApp;

public class Tire {

    private String brand;

    private int circumference;

    public Tire(String brand, int circumference) {
        this.brand = brand;
        this.circumference = circumference;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", circumference=" + circumference +
                '}';
    }
}
