/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class StackStrukMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackStruk stack = new StackStruk();
        Scanner sc = new Scanner(System.in);
        String pilih;

        stack.push("Struk 1: Nomor transaksi - 001, Tanggal - 2023-03-05, Jumlah barang - 5, Total harga - Rp. 100000");
        stack.push("Struk 2: Nomor transaksi - 002, Tanggal - 2023-03-12, Jumlah barang - 3, Total harga - Rp. 75000");
        stack.push("Struk 3: Nomor transaksi - 003, Tanggal - 2023-03-19, Jumlah barang - 2, Total harga - Rp. 50000");
        stack.push("Struk 4: Nomor transaksi - 004, Tanggal - 2023-03-26, Jumlah barang - 4, Total harga - Rp. 90000");
        stack.push("Struk 5: Nomor transaksi - 005, Tanggal - 2023-04-02, Jumlah barang - 6, Total harga - Rp. 120000");
        stack.push("Struk 6: Nomor transaksi - 006, Tanggal - 2023-04-09, Jumlah barang - 3, Total harga - Rp. 70000");
        stack.push("Struk 7: Nomor transaksi - 007, Tanggal - 2023-04-16, Jumlah barang - 2, Total harga - Rp. 55000");
        stack.push("Struk 8: Nomor transaksi - 008, Tanggal - 2023-04-23, Jumlah barang - 5, Total harga - Rp. 110000");

        do{
            System.out.println("Struk belanja yang masih tersimpan:");
            stack.tampilkan();
        
        
            System.out.print("Jumlah struk yang ingin ditukar: ");
            int jumlah = sc.nextInt();
            System.out.println("\nStruk belanja yang akan ditukarkan dengan voucher:" + jumlah);
            for (int i = 0; i < jumlah; i++) {
                String struk = stack.pop();
                if (struk != null) {
                    System.out.println(struk);
                }
            }
            sc.nextLine();
            System.out.print("Apakah ingin menukar lagi (y/n): ");
            pilih = sc.nextLine();
        } while (pilih.equalsIgnoreCase("y"));
    }
}