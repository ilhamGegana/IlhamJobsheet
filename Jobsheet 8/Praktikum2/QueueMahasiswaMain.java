/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class QueueMahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int capacity = sc.nextInt();
        QueueMahasiswa antrian = new QueueMahasiswa(capacity);

        boolean keluar = true;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Keluarkan Mahasiswa dari Antrian");
            System.out.println("3. Tampilkan Daftar Mahasiswa dalam Antrian");
            System.out.println("4. Tampilkan Data Mahasiswa Paling Depan");
            System.out.println("5. Tampilkan Data Mahasiswa Paling Belakang");
            System.out.println("6. Cek Posisi Antrian Mahasiswa berdasarkan NIM");
            System.out.println("7. Tampilkan Data Mahasiswa pada Posisi Tertentu");
            System.out.println("8. Keluar");

            System.out.print("Pilih menu (1-8): ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, absen, ipk);
                    antrian.enqueue(mahasiswa);
                    break;
                case 2:
                    int front = antrian.dequeue();
                    if (front != -1) {
                        System.out.println("Mahasiswa paling depan saat ini berada di posisi antrian ke-" + front);
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peek();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    sc.nextLine(); //
                    System.out.print("Masukkan NIM: ");
                    String nimCheck = sc.nextLine();
                    antrian.peekPosition(nimCheck);
                    break;
                case 7:
                    System.out.print("Masukkan posisi antrian: ");
                    int posisi = sc.nextInt();
                    antrian.printMahasiswa(posisi);
                    break;
                case 8:
                    keluar = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (keluar);
    }
}
