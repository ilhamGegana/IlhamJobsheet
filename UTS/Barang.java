/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu8;

/**
 *
 * @author DELL
 */
public class Barang {
    String kode;
    String nama;
    int stok;
    int harga;
    int terjual;
    
    public Barang(String kd, String nm, int st, int hg){
        kode = kd;
        nama = nm;
        stok = st;
        harga = hg;
        terjual = 0;
    }
    public void tambahStok(int jumlah){
        stok += jumlah;
    }
    public void kurangiStok(int jumlah){
        stok -= jumlah;
        terjual += jumlah;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
    public int getTerjual(){
        return terjual;
    }
    
}
