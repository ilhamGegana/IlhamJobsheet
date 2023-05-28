/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
public class DaftarAnggotaPaskibraka {
    public Paskibraka[] listPeserta = new Paskibraka[10];
    public int id = 0;

    public void tambah(Paskibraka m) {
        listPeserta[id] = m;
        id++;
    }

    public void tampil() {
        System.out.println("Daftar Anggota Paskibraka:");
        for (int i = 0; i < id; i++) {
            listPeserta[i].tampilIdentitas();
        }
    }

    public void Sorting() {
        for (int i = 0; i < id - 1; i++) {
            for (int j = 0; j < id - i - 1; j++) {
                if (listPeserta[j].tinggi < listPeserta[j+1].tinggi) {
                    Paskibraka temp = listPeserta[j];
                    listPeserta[j] = listPeserta[j+1];
                    listPeserta[j+1] = temp;
                }
            }
        }
    }
}
