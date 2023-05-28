/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author DELL
 */
public class PengurutanBuku {
    public void pengurutanTinggiBuku(Buku[] arrBuku) {
        for (int i = 0; i < arrBuku.length - 1; i++) {
            for (int j = 0; j < arrBuku.length - i - 1; j++) {
                if (arrBuku[j].TinggiBuku() < arrBuku[j+1].TinggiBuku()) {
                    Buku temp = arrBuku[j];
                    arrBuku[j] = arrBuku[j+1];
                    arrBuku[j+1] = temp;
                }
            }
        }
    }

    public void pengurutanJumlahHalaman(Buku[] arrBuku) {
        for (int i = 0; i < arrBuku.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrBuku.length; j++) {
                if (arrBuku[j].jumlahHalaman < arrBuku[minIndex].jumlahHalaman) {
                    minIndex = j;
                }
            }
            Buku temp = arrBuku[minIndex];
            arrBuku[minIndex] = arrBuku[i];
            arrBuku[i] = temp;
        }
    }
}