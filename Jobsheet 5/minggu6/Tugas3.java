/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Buku[] arrBuku = new Buku[4];

        arrBuku[0] = new Buku("Algoritma Pemrograman", 1292, "B5");
        arrBuku[1] = new Buku("Basis Data", 400, "A4");
        arrBuku[2] = new Buku("Dasar Pemrograman", 294, "B3");
        arrBuku[3] = new Buku("Rekayasa Perangkat Lunak", 824, "B2");

        PengurutanBuku pengurutan = new PengurutanBuku();

        System.out.println("Pengurutan berdasarkan tinggi buku:");
        pengurutan.pengurutanTinggiBuku(arrBuku);
        for (int i = 0; i < arrBuku.length; i++) {
        arrBuku[i].tampilBuku();
        }
        
        System.out.println("\nPengurutan berdasarkan jumlah halaman:");
        pengurutan.pengurutanJumlahHalaman(arrBuku);
        for (int i = 0; i < arrBuku.length; i++) {
        arrBuku[i].tampilBuku();
        }
    }
    
}
