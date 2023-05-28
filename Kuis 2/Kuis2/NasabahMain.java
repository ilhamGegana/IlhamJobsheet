/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kuis2;

/**
 *
 * @author DELL
 */
// Ilham Gegana Raya Firmansyah
// Manajemen Informatika
// 7
// 2231750001
import java.util.Scanner;
public class NasabahMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AntrianBank antrian = new AntrianBank();
        int pilihan;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("=== Menu Antrian Bank ===");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cari Nasabah");
            System.out.println("4. Tambah Nasabah Ke Nomor 1(KHUSUS!!)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 0:
                    System.out.println("Terima Kasih atas kunjungan Anda");
                    break;
                case 1:
                    System.out.println("=== Silahkan Menambahkan Antrian Nasabah ===");
                    System.out.print("Masukan No.Rekening: ");
                    int noRekening = sc.nextInt();
                    System.out.print("Masukan Nama: ");
                    String nama = sc.next();
                    antrian.tambahNasabah(noRekening, nama);
                    System.out.print("Nasabah berhasil ditambahkan");
                    break;
                case 2:
                    System.out.println("=== Antrian Nasabah ===");
                    antrian.print();
                    break;
                case 3:
                    System.out.print("Masukkan Nama Nasabah yang Diacari: ");
                    String cariNasabah = sc.next();
                    antrian.cariNasabah(cariNasabah);
                    break;
                case 4:
                    System.out.println("=== Silahkan Menambahkan Antrian Khusus ===");
                    System.out.print("Masukan No.Rekening: ");
                    int noRekeningDepan = sc.nextInt();
                    System.out.print("Masukan Nama: ");
                    String namaKedepan = sc.next();
                    antrian.tambahNasabahDepan(noRekeningDepan, namaKedepan);
                    System.out.print("Nasabah berhasil ditambahkan");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        } while(pilihan != 0);
    }
}