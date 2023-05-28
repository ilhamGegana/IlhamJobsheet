/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author DELL
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barang[] daftarBarang = {
            new barang("Pensil", 35, 1000),
            new barang("Buku", 20, 5000),
            new barang("Penggaris", 50, 1500),
            new barang("Bulpen", 25, 2000)
        };

        System.out.println("Daftar Barang Sebelum Diurutkan: ");
        for (int i = 0; i<daftarBarang.length;i++) {
            System.out.println(daftarBarang[i].nama + " - " + daftarBarang[i].stok);
        }

        barang.insertionSort(daftarBarang);

        System.out.println("\nDaftar Barang Setelah Diurutkan dengan Insertion Sort: ");
        for (int i = 0; i<daftarBarang.length;i++) {
            System.out.println(daftarBarang[i].nama + " - " + daftarBarang[i].stok);
        }

        barang.shellSort(daftarBarang);

        System.out.println("\nDaftar Barang Setelah Diurutkan dengan Shell Sort: ");
        for (int i = 0; i<daftarBarang.length;i++) {
            System.out.println(daftarBarang[i].nama + " - " + daftarBarang[i].stok);
        }
    }
}