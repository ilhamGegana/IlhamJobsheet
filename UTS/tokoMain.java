/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu8;

/**
 *
 * @author DELL
 */
//7_Ilham Gegana Raya Firmansyah
//MI
import java.util.Scanner;
public class tokoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        toko t = new toko();
        
        while(pilihan != 4){
        System.out.println("Menu : ");
        System.out.println("1. Input Data Barang");
        System.out.println("2. Penjualan Barang");
        System.out.println("3. Sorting Barang");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu : ");
        
        pilihan = input.nextInt();
        input.nextLine();
        
        switch(pilihan){
            case 1:
                t.inputDataBarang();
                break;
            case 2:
                t.penjualanBarang();
                break;
            case 3:
                t.sortingBarang();
                break;
            case 4:
                System.out.println("Program selesai");
                break;
            default:
                System.out.println("Pilihan tidak sesuai, silakan pilih kembali");
                break;
            }
        }
    }
}