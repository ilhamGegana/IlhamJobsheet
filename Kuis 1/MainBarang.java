/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu4;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class MainBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int pilih, pilihan;
        String kembali;
        Barang[] pembelians = new Barang[5];
        
        
        pembelians[0] = new Barang ("01", "Sabun", 2000, 5);
        pembelians[1] = new Barang ("02", "Pasta Gigi", 3000, 5);
        pembelians[2] = new Barang ("03", "Biore", 12000, 10);
        pembelians[3] = new Barang ("04", "Shampoo", 2000, 5);
        pembelians[4] = new Barang ("05", "SikatGigi", 2000, 5);
        
        do{
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih(1-4): ");
            pilih = sc.nextInt();
            
            if (pilih == 1){
                System.out.println("Kode  "+"Nama  "+ "Harga  "+"Stok  ");
                System.out.println(pembelians[0].kode+"   "+pembelians[0].nama+"   "+pembelians[0].harga+"   "+pembelians[0].stok);
                System.out.println(pembelians[1].kode+"   "+pembelians[1].nama+"   "+pembelians[1].harga+"   "+pembelians[1].stok);
                System.out.println(pembelians[2].kode+"   "+pembelians[2].nama+"   "+pembelians[2].harga+"   "+pembelians[2].stok);
                System.out.println(pembelians[3].kode+"   "+pembelians[3].nama+"   "+pembelians[3].harga+"   "+pembelians[3].stok);
                System.out.println(pembelians[4].kode+"   "+pembelians[4].nama+"   "+pembelians[4].harga+"   "+pembelians[4].stok);
            } else if(pilih == 2){
                do {
                    System.out.println("Kode  "+"Nama  "+ "Harga  "+"Stok  ");
                    System.out.println(pembelians[0].kode+"   "+pembelians[0].nama+"   "+pembelians[0].harga+"   "+pembelians[0].stok);
                    System.out.println(pembelians[1].kode+"   "+pembelians[1].nama+"   "+pembelians[1].harga+"   "+pembelians[1].stok);
                    System.out.println(pembelians[2].kode+"   "+pembelians[2].nama+"   "+pembelians[2].harga+"   "+pembelians[2].stok);
                    System.out.println(pembelians[3].kode+"   "+pembelians[3].nama+"   "+pembelians[3].harga+"   "+pembelians[3].stok);
                    System.out.println(pembelians[4].kode+"   "+pembelians[4].nama+"   "+pembelians[4].harga+"   "+pembelians[4].stok);
                    System.out.print("Masukkan kode barang : ");
                    pilihan = sc.nextInt();
                    System.out.print ("Apakah akan belanja kembali(y/n): ");
                    kembali = sc.next();
                }while (kembali.equalsIgnoreCase("y"));
            }                 
        } while (pilih != 4);
        
    }
    
}
