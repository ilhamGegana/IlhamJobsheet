/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu4;

/**
 *
 * @author DELL
 */
public class TransaksiBarang {
    Barang[] barangs;
    Barang[] pembelian;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
        this.pembelian = new Barang[0];
    }

    public void tampilkanBarang() {
    System.out.println("========================");
    System.out.println("Daftar Barang:");
    System.out.println("========================");
    System.out.printf("%-10s %-10s %-10s %-10s%n", "Kode", "Nama", "Harga", "Stok");
    for (Barang barang : barangs) {
        System.out.printf("%-10s %-10s %-10d %-10d%n",
            barang.kode, barang.nama, barang.harga, barang.stok);
    }
}

    public void tampilkanBarangPembelian() {
        System.out.println("========================");
        System.out.println("Daftar Barang:");
        System.out.println("========================");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Kode", "Nama", "Harga", "Stok");
        for (Barang barang : pembelian) {
            System.out.printf("%-10s %-10s %-10d %-10d%n",
                barang.kode, barang.nama, barang.harga, barang.stok);
        }
    }   

    public void lakukanPembelian(String kodeBarang) {
        Barang barangDibeli = null;
        for (Barang barang : barangs) {
            if (barang.kode.equalsIgnoreCase(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }

        if (barangDibeli == null) {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
            return;
        }

        if (barangDibeli.stok <= 0) {
            System.out.println("Stok barang " + barangDibeli.nama + " habis.");
            return;
        }

        barangDibeli.stok--;
        tambahkanPembelian(barangDibeli);
        System.out.println("Pembelian barang " + barangDibeli.nama + " berhasil.");
    }

    public void tambahkanPembelian(Barang barang) {
        Barang[] newArray = new Barang[pembelian.length + 1];
        for (int i = 0; i < pembelian.length; i++) {
            newArray[i] = pembelian[i];
        }
        newArray[pembelian.length] = barang;
        pembelian = newArray;
    }
}
