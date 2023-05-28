/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
public class Paskibraka2 {
    public String nama;
    public String kelas;
    public int tinggi;

    public Paskibraka2(String nm, String ks, int tg) {
        nama = nm;
        kelas = ks;
        tinggi = tg;
    }

    public void tampilIdentitas() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("Tinggi\t: " + tinggi);
        System.out.println("");
    }
}
