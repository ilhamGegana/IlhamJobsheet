/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author DELL
 */
public class AntrianBank {
    Nasabah head;
    Nasabah tail;
    
    public AntrianBank(){
        head = null;
        tail = null;
    }
    public void tambahNasabah(int noRek, String nm){
        Nasabah nasabahBaru = new Nasabah(noRek, nm);
        if(head == null){
            head = nasabahBaru;
            tail = nasabahBaru;
        } else {
            tail.next = nasabahBaru;
            tail = nasabahBaru;
        }
    }
    public void print(){
        if (head == null){
            System.out.println("Antrian kosong.");
            return;
        }
        Nasabah current = head;
        int i = 1;
        while (current != null){
            System.out.println(i +". No. Rekening: " + current.noRekening + ", Nama: " + current.nama);
            current = current.next;
            i++;
        }
    }
    public void cariNasabah(String nama){
        if (head == null){
            System.out.println("Antrian kosong.");
            return;
        }
        Nasabah current = head;
        boolean temu = false;
        while (current != null){
            if(current.nama.equalsIgnoreCase(nama)){
                System.out.println("Nasabah ditemukan dengan No.Rekening: " + current.noRekening + ", Nama: " + current.nama);
                temu = true;
            }
            current = current.next;
        }
        if(!temu){
            System.out.println("Nasabah dengan Nama: " + nama +", tidak ditemukan");
        }
    }
    public void tambahNasabahDepan(int noRek, String nm){
        Nasabah nasabahBaru = new Nasabah(noRek, nm);
        if(head == null){
            head = nasabahBaru;
            tail = nasabahBaru;
        } else {
            nasabahBaru.next = head;
            head = nasabahBaru;
        }
    }
}
