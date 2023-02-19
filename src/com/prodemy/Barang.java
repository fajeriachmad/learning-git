package com.prodemy;
import com.prodemy.util.StringUtil;

public class Barang {
    // contoh attribute public

    // String name;
    // int price;
    // int stock;

    // contoh attribute private
    // instance variable
    private String nama;
    private int price;
    private int stock;

    // constructor default
    public Barang() {
        super();
    }
    // constructor buatan sesuai kebutuhan
    public Barang(String nama, int price, int stock) {
        super();
        this.nama = nama;
        this.price = price;
        this.stock = stock;
    }

    /**
     *jika attribute bersifat private, jika ingin memodifikasi atau menampilkan nilai tersebut,
     *maka harus ada method untuk set dan get, sehingga :
    */
    public void setNama(String nama) {
        this.nama = nama; // < nama ini adalah parameter dari function
        //  ^ nama ini adalah variable nama pada attribute
    }
    public String getNama() {
        return nama;
    }

    public void setHarga(int harga) throws Exception {
        if (harga > 0) {
            this.price = harga;
        } else {
            throw new Exception("Harga tidak boleh negatif");
        }
    }
    public int getHarga() {
        return price;
    }

    public void setStock(int stock) throws Exception {
        if (stock > 0) {
            this.stock = stock;
        } else {
            throw new Exception("Stock tidak boleh negatif");
        }
    }
    public int getStock() {
        return stock;
    }

    @Override
	public String toString() {
        return "nama : " + this.nama +
        ", harga : " + StringUtil.toRupiah(this.price) +
        ", stok : " + this.stock
        ;
	}
       
}
