package com.prodemy;

import com.prodemy.util.StringUtil;

public class StudiKasus1 {
    public static void main(String[] args) {
        // inisiasi constructor default
        Barang[] daftarBarang = new Barang[2];
        Barang b1 = new Barang();
        // b1.name = "Oreo";
        b1.setNama("Oreo");
        try {
            b1.setHarga(5000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        try {
            b1.setStock(15);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        // inisiasi constructor buatan dengan parameter
        Barang b2 = new Barang("TimTam", 2000, 10);
        daftarBarang[0] = b1;
        daftarBarang[1] = b2;            // Barang b2 = new Barang();
            // b2.name = "Chunky Bar";
            // b2.price = 25000;
            // b2.stock = 10;
            // daftarBarang[1] = b2;
    
            // daftarBarang[2] = new Barang();
            // daftarBarang[2].name = "Kopiko";
            // daftarBarang[2].price = 5000;
            // daftarBarang[2].stock = 10;
            
            for (int i = 0; i < daftarBarang.length; i++) {
                System.out.println("Produk : " + daftarBarang[i].getNama());
                System.out.println("Price  : " + StringUtil.toRupiah(daftarBarang[i].getHarga()));
                System.out.println("Stock  : " + daftarBarang[i].getStock());
            }
    }
}
