package com.prodemy;

public class Samsung implements Phone {
    // semua method yang tertulis pada interface harus diturunkan pada class yang mengimplementasikannya
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        // set volume awal
        this.volume = 50;
    }

    // inherit method powerOn() dari class Phone
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("SAMSUNG ... ON");
    }
    
    // inherit method powerOff() dari class Phone
    public void powerOff() {
        isPowerOn = false;
        System.out.println("SAMSUNG ... OFF");
    }
    
    // inherit method volumeUp() dari class Phone
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Maximum volume!");
            }
            else {
                this.volume += 10;
                System.out.println(this.getVolume());
            }
        }
    }
    
    // inherit method volumeDown() dari class Phone
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Minimum volume!");
            }
            else {
                this.volume -= 10;
                System.out.println(this.getVolume());
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
