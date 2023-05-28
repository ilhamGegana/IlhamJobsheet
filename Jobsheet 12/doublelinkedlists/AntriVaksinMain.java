/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class AntriVaksinMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AntriVaksin queue = new AntriVaksin();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");

            System.out.print("Masukkan pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nomer Antrian: ");
                    String nomerAntrian = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    queue.tambah(nomerAntrian, nama);
                    break;
                case 2:
                    Object hapusNama = queue.hapus();
                    if (hapusNama != null) {
                        System.out.println( hapusNama+" telah selesai divaksinasi");
                    }
                    break;

                case 3:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    queue.printQueue();
                    System.out.println("Sisa Antrian: " + queue.getSize());
                    break;
                case 4:
                    System.out.println("Sampai Jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (choice != 4);
    }
}
