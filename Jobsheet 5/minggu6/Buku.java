/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
public class Buku {
    public String judul;
    public int jumlahHalaman;
    public String ukuranBuku;

    public Buku(String jdl, int jml, String uk) {
        judul = jdl;
        jumlahHalaman = jml;
        ukuranBuku = uk;
    }

    public double TinggiBuku() {
        if (ukuranBuku.equals("A4")) {
            return 29.7;
        } else if (ukuranBuku.equals("B5")) {
            return 25.0;
        } else if (ukuranBuku.equals("B3")) {
            return 35.3;
        } else if (ukuranBuku.equals("B2")) {
            return 50.0;
        } else {
            return 0.0;
        }
    }

    public void tampilBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Ukuran Buku: " + ukuranBuku);
        System.out.println("");
    }
}