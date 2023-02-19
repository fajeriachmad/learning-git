package com.prodemy;

// penggunaan interface
public interface Phone {
    // attribute declaration
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // method declaration
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
