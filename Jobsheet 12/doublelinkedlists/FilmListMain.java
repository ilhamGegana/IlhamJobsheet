/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class FilmListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FilmList daftarFilm = new FilmList();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("===================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===================================");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data pada index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak film");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===================================");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    int idAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judulAwal = sc.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingAwal = sc.nextDouble();
                    daftarFilm.tambahDiAwal(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.print("Masukkan ID Film: ");
                    int idAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judulAkhir = sc.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingAkhir = sc.nextDouble();
                    daftarFilm.tambahDiAkhir(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan ID Film: ");
                    int idIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judulIndex = sc.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingIndex = sc.nextDouble();
                    daftarFilm.tambahPadaIndex(index, idIndex, judulIndex, ratingIndex);
                    break;
                case 4:
                    daftarFilm.hapusDataPertama();
                    break;
                case 5:
                    daftarFilm.hapusDataTerakhir();
                    break;
                case 6:
                    System.out.print("Masukkan ID Film yang ingin dihapus: ");
                    int idHapus = sc.nextInt();
                    daftarFilm.hapusDataTertentu(idHapus);
                    break;
                case 7:
                    daftarFilm.cetakFilm();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    int idCari = sc.nextInt();
                    daftarFilm.cariFilm(idCari);
                    break;
                case 9:
                    daftarFilm.urutBerdasarkanRating();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 10);
    }
}
