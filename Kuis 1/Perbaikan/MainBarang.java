/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu4;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class MainBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang[] barangs = {
            new Barang("K01", "Sabun", 1000, 5),
            new Barang("K02", "Pasta Gigi", 2000, 10),
            new Barang("K03", "Biore", 3000, 23),
            new Barang("K04", "Shampoo", 4000, 55),
            new Barang("K05", "Sikat Gigi", 5000, 65)
        };

        TransaksiBarang transaksi = new TransaksiBarang(barangs);
        boolean keluar = false;

        Scanner sc = new Scanner(System.in);

        while (!keluar) {
            System.out.println("========================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("========================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.println("========================");

            System.out.print("Pilih(1-4): ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    boolean lagi;
                    do {
                        System.out.print("Masukkan kode barang yang ingin dibeli: ");
                        String kodeBarang = sc.next();
                        transaksi.lakukanPembelian(kodeBarang);

                        System.out.print("Apakah akan belanja kembali? (Y/N): ");
                        String beliLagiInput = sc.next();
                        lagi = beliLagiInput.equalsIgnoreCase("Y");
                    } while (lagi);
                    break;

                    
                case 3:
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }
}
