package com.prodemy;

public class SampleTipeData {
    public static void main(String[] args) {
        System.out.println("Macam-macam tipe data numeric :");
        // === tipe data numeric ===
        byte b1 = (byte) 125;
        short s1 = 1;
        int x = 0;
        long l1 = 1;
        double d1 = 2.4;
        float f1 = 12.5f;
        short hasilKali = (short) (s1 * (short) 10);

        System.out.println("1. Byte : " + b1);
        System.out.println("2. Short : " + s1);
        System.out.println("3. Integer : " + x);
        System.out.println("4. Long : " + l1);
        System.out.println("5. Double : " + d1);
        System.out.println("6. Float : " + f1);
        System.out.println("Hasil perkalian : " + hasilKali);

        // === Tipe data alphabetic ===
        System.out.println("Macam-macam tipe data alphabetic : ");
        char a = 'a';
        String text = "Kalimat";
        System.out.println("Char : " + a);
        System.out.println("String : " + text);
    }
}
