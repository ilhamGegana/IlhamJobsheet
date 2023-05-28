/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TugasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas A1 = new Tugas();
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nama barang : ");
        A1.nama = sc.next();
        System.out.print("Masukkan Harga satuan barang : Rp ");
        A1.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan Jumlah barang dibeli : ");
        A1.jumlah = sc.nextInt();
        System.out.println("==================================");
        
        A1.hitungHargaTotal();
        A1.hitungDiskon();
        A1.hitungHargaBayar();
        A1.tampilBarang();
    }
}
