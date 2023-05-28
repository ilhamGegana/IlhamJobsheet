/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author DELL
 */
public class Nasabah {
    public int noRekening;
    public String nama;
    public Nasabah next;
    
    public Nasabah(int noRek, String nm){
        this.noRekening = noRek;
        this.nama = nm;
        this.next = null;
    }
}
