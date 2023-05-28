/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package minggu8;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class toko {
    Barang[] listBarang = new Barang[100];
    int jumlahBarang = 0;
    
    
    public void inputDataBarang(){
        Scanner sc = new Scanner(System.in);
        boolean lagi = true;
        while (lagi && jumlahBarang < 100) {
            System.out.println("input data barang");
            System.out.print("Kode = ");
            String kode = sc.nextLine();
            System.out.print("Nama = ");
            String nama = sc.nextLine();
            System.out.print("Stok = ");
            int stok = sc.nextInt();
            System.out.print("Harga = ");
            int harga = sc.nextInt();
        
            Barang List = new Barang (kode, nama, stok, harga);
            listBarang[jumlahBarang] = List;
            jumlahBarang++;
            System.out.print("Tambahkan barang lagi? (y/n) ");
            String answer = sc.next();
            sc.nextLine();
            if (answer.equalsIgnoreCase("n")) {
            lagi = false;
            }
        }
    }
    public void penjualanBarang(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Kode barang yang akan dibeli : ");
        String kode = sc.nextLine();
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        int jumlahBarangBeli = sc.nextInt();
        
        Barang barangDibeli = null;
        for (int i=0;i<jumlahBarang; i++){
            if(listBarang[i].getKode().equalsIgnoreCase(kode)){
                barangDibeli = listBarang[i];
                break;
            }
        }
        if(barangDibeli == null ){
            System.out.println("Barang tidak ditemukan");
        } else if (barangDibeli.getStok()<jumlahBarangBeli){
            System.out.println("Stok barang habis!!");
        } else {
            int totalHarga = barangDibeli.getHarga()*jumlahBarangBeli;
            barangDibeli.kurangiStok(jumlahBarangBeli);
            System.out.println("Barang berhasil dijual.");
            System.out.println("Total harga: " + totalHarga);
        }
    }
    public void sortingBarang(){
        for(int i = 1; i<jumlahBarang;i++){
            Barang temp = listBarang[i];
            int j=i-1;
            
            while(j>=0 && listBarang[j].getStok()<temp.getStok()){
                listBarang[j + 1] = listBarang[j];
                j=j-1;
            }
            listBarang[j + 1] = temp;
        }
        System.out.println("Barang telah di sorting berdasarkan stok terbanyak");
        System.out.println("Nama barang\t\tHarga barang\tStok barang\tJumlah terjual");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < jumlahBarang; i++) {
        System.out.println(listBarang[i].getNama() + "\t\t" + listBarang[i].getHarga() + "\t\t" +
        listBarang[i].getStok() + "\t\t" + listBarang[i].getTerjual());
        }
    }
}
