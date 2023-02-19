package com.prodemy;

import java.util.Arrays;

public class SampleArray {
    public static void main(String[] args) {
        
        // === array bilangan===
        int[] contohArray = new int[5];
        for (int i = 0; i < contohArray.length; i++) {
            contohArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(contohArray));
        for (int i = 0; i < contohArray.length; i++) {
            System.out.print(contohArray[i] + " ");
        }
        System.out.println();

        // === array string
        // String anggotaKelas = new String[10];
        String anggotaKelas[] = {"Rahmat", "Reno", "Rudi", "Rida", "Roochimin", "Rusdi", "Rendi", "Rembo"};
        for (int i = 0; i < anggotaKelas.length; i++) {
            System.out.println(anggotaKelas[i]);
        }
        System.out.println(Arrays.toString(anggotaKelas));
    }
}
