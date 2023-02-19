package com.prodemy;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOffThePhone() {
        this.phone.powerOff();
    }

    void volumeLouder() {
        this.phone.volumeUp();
    }

    void volumeSofter() {
        this.phone.volumeDown();
    }
}
