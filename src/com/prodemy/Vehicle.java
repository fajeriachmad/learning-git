package com.prodemy;

import javax.management.ValueExp;

public class Vehicle {
    // attribute declaration
    private double maxLoad;

    // method declaration
    public void setMaxLoad(double value) {
        maxLoad = value;
    }
    public void showLoadSet() {
        System.out.println(maxLoad + " Ton");
    }
}
