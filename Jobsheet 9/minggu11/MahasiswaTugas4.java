/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class MahasiswaTugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SLLMahasiswa antrianMahasiswa = new SLLMahasiswa();
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan Mahasiswa di Awal Antrian");
            System.out.println("2. Tambahkan Mahasiswa di Akhir Antrian");
            System.out.println("3. Hapus Mahasiswa dari Awal Antrian");
            System.out.println("4. Tampilkan Data Mahasiswa");
            System.out.println("5. Keluar");

            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sc.nextLine(); // Clear the newline character
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Absen Mahasiswa: ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa mahasiswaAwal = new Mahasiswa(nim, nama, absen, ipk);
                    antrianMahasiswa.addFirst(mahasiswaAwal);
                    break;
                case 2:
                    sc.nextLine(); // Clear the newline character
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Absen Mahasiswa: ");
                    absen = sc.nextInt();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    ipk = sc.nextDouble();

                    Mahasiswa mahasiswaAkhir = new Mahasiswa(nim, nama, absen, ipk);
                    antrianMahasiswa.addLast(mahasiswaAkhir);
                    break;
                case 3:
                    Mahasiswa mahasiswaKeluar = antrianMahasiswa.removeFirst();
                    if (mahasiswaKeluar != null) {
                        System.out.println("Mahasiswa dengan NIM " + mahasiswaKeluar.nim + " telah dikeluarkan dari antrian.");
                    }
                    break;
                case 4:
                    antrianMahasiswa.print();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 5);
    }
}
