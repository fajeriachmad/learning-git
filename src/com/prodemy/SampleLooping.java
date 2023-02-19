package com.prodemy;

public class SampleLooping {
    public static void main(String[] args) {
        // === Perulangan ===
        int i;
        // for
        System.out.println("=== Perulangan for ===");
        for (i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }

        // while
        System.out.println("=== Perulangan while ===");
        System.out.println("Genap : ");
        i = 0;
        while (i < 10) {
            if (i != 0) {
                if (i % 2 == 0) {
                    System.out.println("while " + i);
                }
            }
            i++;
        }

        // do while
        System.out.println("=== Perulangan do - while ===");
        System.out.println("Ganjil : ");

        i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 10);
    }
}
