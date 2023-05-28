/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author DELL
 */
public class Mahasiswa {
    String nama;
    int nilaiA;
    int nilaiB;
    int nilaiC;
    int totalNilai;

    public Mahasiswa(String nm, int nA, int nB, int nC) {
        nama = nm;
        nilaiA = nA;
        nilaiB = nB;
        nilaiC = nC;
        totalNilai = nilaiA + nilaiB + nilaiC;
    }

    public String Nama() {
        return nama;
    }

    public int TotalNilai() {
        return totalNilai;
    }
}