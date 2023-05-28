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
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DaftarAnggotaPaskibraka dap = new DaftarAnggotaPaskibraka();

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

            Paskibraka peserta = new Paskibraka(nama, kelas, tinggi);
            dap.tambah(peserta);
        }

        dap.Sorting();
        dap.tampil();
    }
}