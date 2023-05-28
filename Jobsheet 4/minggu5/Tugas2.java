/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] daftar = {
        {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
        {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
        {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Daftar Kelompok Mahasiswa");
        for(int i=0;i < 3;i++){
            System.out.print("Kelompok " + (i+1) + " : ");
            for (int j = 0; j < 5; j++) {
                System.out.print(daftar[i][j] + " ");
            }
            System.out.println();
        }

        // cari nama mahasiswa
        System.out.println("Masukkan nama mahasiswa yang dicari");
        String cari = sc.nextLine();
        int index = -1;
        int urutan = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (daftar[i][j].equalsIgnoreCase(cari)) {
                    index = i + 1;
                    urutan = j + 1;
                    break;
                }
            }
            if (index != -1 && urutan != -1) {
                break;
            }
        }

        // cetak hasil pencarian
        if (index != -1 && urutan != -1) {
            System.out.println("Mahasiswa bernama " + cari + " berada pada kelompok ke-" + index + " dan urutan ke-" + urutan + " dalam kelompok");
        } else {
            System.out.println("Mahasiswa bernama " + cari + " tidak ditemukan");
        }
    }
}