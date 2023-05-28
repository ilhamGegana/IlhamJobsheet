/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author DELL
 */
public class barang {
    public String nama;
    public int stok;
    public int harga;

    public barang(String nm, int st, int hg) {
        nama = nm;
        stok = st;
        harga = hg;
    }

    public static void insertionSort(barang[] arr) {
        for (int i = 1; i < arr.length; i++) {
            barang tempIns = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].stok < tempIns.stok) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = tempIns;
        }
    }

    public static void shellSort(barang[] arr) {
        int n = arr.length;

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                barang tempSort = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].stok < tempSort.stok; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tempSort;
            }
        }
    }
}
