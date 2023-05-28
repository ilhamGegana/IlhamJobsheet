/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author DELL
 */
public class Penduduk {
    String nik;
    String nama;
    String alamat;
    String jenisKelamin;
    
    Penduduk(){
        
    }

    public Penduduk(int nik, String nama, String alamat, String jenisKelamin) {
        nik = nik;
        nama = nama;
        alamat = alamat;
        jenisKelamin = jenisKelamin;
    }
    public void nik(){
        System.out.println(nik);
    }
    public void nama(){
        System.out.println(nama);
    }
    public void alamat(){
        System.out.println(alamat);
    }
    public void kelamin(){
        System.out.println(jenisKelamin);
    }
}