/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author DELL
 */
public class Tugas {
    String nama;
    int hargaSatuan, jumlah, diskon, bayar;
    
    Tugas(){
    }
    Tugas(String nm,int hs,int jm){
    nama = nm;
    hargaSatuan = hs;
    jumlah = jm;
    }
    void tampilBarang(){
        System.out.println("Nama = "+nama);
        System.out.println("Harga Satuan = Rp "+hargaSatuan);
        System.out.println("Jumlah = "+jumlah);
        System.out.println("Harga Bayar = Rp "+ bayar);
    }
    int hitungHargaTotal(){
        return jumlah*hargaSatuan;
    }
    int hitungDiskon(){
        if(hitungHargaTotal()>100000){
            return diskon = (int) (hitungHargaTotal()*0.1);
        } else if (hitungHargaTotal()>=50000 && hitungHargaTotal()<=100000){
            return diskon = (int) (hitungHargaTotal()*0.05);
        } else {
            return diskon;
        }
    }
    int hitungHargaBayar(){
        return bayar = hitungHargaTotal() - diskon;
    }
}