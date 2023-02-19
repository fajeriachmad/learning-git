package com.prodemy;

import java.text.CollationElementIterator;
import java.util.Collection;

import com.prodemy.util.CollectionUtil;

public class ContohBreak {
    public static void main(String[] args) {
        Barang[] daftarBarang = new Barang[] {
            new Barang("Oreo", 5000, 10),
            new Barang("TimTam", 2000, 50),
            new Barang("GuriBee", 7500, 20),
            new Barang("Chitato", 8000, 10),
            new Barang("Sari Roti Sandwich", 2500, 15),
            new Barang("Lolipop", 1000, 50)
        };

        // String yangDicari = "Oreo";
        // String yangDitemukan = "";
        // boolean isFound = true; 
        // nilai default jika posisi tidak ditemukan
        // int ditemukanPadaPosisi = -1;

        /*
        for (int i = 0; i < daftarBarang.length; i++) {
            Barang b = daftarBarang[i];
            if (b.getNama().equals(yangDicari)) {
                isFound = true;
                yangDitemukan = b.getNama();
                ditemukanPadaPosisi = i + 1;
                break;
            } else {
                isFound = false;
            }
        }
         * 
         */

        /*
         * 
         if (isFound) {
             System.out.println("Produk : " + yangDitemukan + " pada posisi : " + ditemukanPadaPosisi);
         } else {
             System.out.println("Produk tidak ditemukan.");
         }
         */
        
        // === atau ===
        /*
        for (Barang b : daftarBarang) {
            if (b.getNama().equals(yangDicari)) {
                isFound = true;
                yangDitemukan = b.getNama();
                break;
            }
        }
         * 
         */
        // System.out.println("Apakah ditemukan? " + isFound + ", Produk : " + yangDitemukan);

        Barang b = CollectionUtil.ambilBarang(daftarBarang, "Oreo");
        System.out.println(b);

        /*
         * 
         CollectionUtil.urutkan(daftarBarang);
         for (int i = 0; i < daftarBarang.length; i++) {
             System.out.println("Produk : " + daftarBarang[i].getNama());
             System.out.println("Price  : " + daftarBarang[i].getHarga());
             System.out.println("Stock  : " + daftarBarang[i].getStock());
         }
         */
        
    }
}
