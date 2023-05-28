/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author DELL
 */

import java.util.Scanner;
public class TampilDataMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        TampilData[] TD = new TampilData[4];
        int i;
        
        for (i = 1;i<TD.length;i++){
            TD[i] = new TampilData();
            System.out.println("Masukkan data mahasiswa ke- "+i);
            System.out.print("Masukkan nama :");
            TD[i].nama = sc.next();
            System.out.print("Masukkan nim :");
            TD[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin :");
            TD[i].jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            TD[i].IPK = sc.next();
        }
        System.out.println("");
        for (i = 1;i<TD.length;i++){
            System.out.println("Data Mahasiswa ke- "+i);
            TD[i].Tampilkan();
        }
    }
}
