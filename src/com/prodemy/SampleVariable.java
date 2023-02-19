package com.prodemy;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SampleVariable {
    private int i = 1;
    public void firstMethod() {
        int i = 10, j = 7;
        this.i = i + j;
        secondMethod(7);
    }
    private void secondMethod(int i) {
        int j = 9;
        this.i = i + j;
    }
}