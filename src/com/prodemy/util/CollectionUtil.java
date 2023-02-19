package com.prodemy.util;

import com.prodemy.Barang;

public class CollectionUtil {
    public static Barang ambilBarang(Barang[] daftarBarang, String yangDicari) {
        Barang result = null;
        for (Barang b : daftarBarang) {
            if (b.getNama().equals(yangDicari)) {
                result = b;
                break;
            }
        }
        return result;
    }

    public static void urutkan(Barang[] daftarBarang) {
        for (int i = 0; i < daftarBarang.length; i++) {
            // Barang barang0 = daftarBarang[i];
            Barang temp = null;
            for (int j = i + 1; j < daftarBarang.length; j++) {
                // Barang barang1 = daftarBarang[j];
                /* 
                if (daftarBarang[i].getHarga() > daftarBarang[j].getHarga()) {
                    temp = daftarBarang[j];
                    daftarBarang[j] = daftarBarang[i];
                    daftarBarang[i] = temp;
                }
                * 
                */

                // jika ingin menggunakan compareTo
                if (daftarBarang[j].getNama().compareTo(daftarBarang[i].getNama()) < 0) {
                    temp = daftarBarang[j];
                    daftarBarang[j] = daftarBarang[i];
                    daftarBarang[i] = temp;
                }
            }
        }
    }
}
