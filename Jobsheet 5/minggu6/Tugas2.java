/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        DaftarAnggotaPaskibraka2 dap2 = new DaftarAnggotaPaskibraka2();

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Data Peserta " + (i+1));
            System.out.print("Nama\t: ");
            String nama = sc.next();
            System.out.print("Kelas\t: ");
            String kelas = sc.next();
            System.out.print("Tinggi\t: ");
            int tinggi = sc.nextInt();

            Paskibraka2 peserta = new Paskibraka2(nama, kelas, tinggi);
            dap2.tambah(peserta);
        }

        dap2.Sorting();
        dap2.tampil();
    }
}
