package com.Practice;

public class Car {
   
    private String name;
    private String carName;
    private double price;

   
    public Car(String pName, String cName, double p) {
        this.name = pName;
        this.carName = cName;
        this.price = p;
    }

    
    public String getName() {
        return name;
    }

    public String getCarName() {
        return carName;
    }

    public double getPrice() {
        return price;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

