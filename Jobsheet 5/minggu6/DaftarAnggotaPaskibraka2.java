/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
public class DaftarAnggotaPaskibraka2 {
    public Paskibraka2[] listPeserta = new Paskibraka2[10];
    public int id = 0;

    public void tambah(Paskibraka2 m) {
        if (m.tinggi > 170) {
        listPeserta[id] = m;
        id++;
    } else {
        System.out.println("Tinggi badan peserta kurang dari 170.");
    }
}

    public void tampil() {
        System.out.println("----------------------------");
        System.out.println("Daftar Anggota Paskibraka:");
        for (int i = 0; i < id; i++) {
            listPeserta[i].tampilIdentitas();
        }
    }

    public void Sorting() {
        for (int i = 0; i < id - 1; i++) {
            for (int j = 0; j < id - i - 1; j++) {
                if (listPeserta[j].tinggi < listPeserta[j+1].tinggi) {
                    Paskibraka2 temp = listPeserta[j];
                    listPeserta[j] = listPeserta[j+1];
                    listPeserta[j+1] = temp;
                }
            }
        }
    }
}
