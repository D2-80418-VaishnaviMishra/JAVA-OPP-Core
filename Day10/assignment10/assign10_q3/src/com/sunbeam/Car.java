package com.sunbeam;

public class Car implements Displayable {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter and Setter for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + "]";
    }
}
