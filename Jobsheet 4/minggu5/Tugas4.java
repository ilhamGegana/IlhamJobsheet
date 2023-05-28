/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penduduk: ");
        int a = sc.nextInt();
        Penduduk[] pd = new Penduduk[a];
        
        for(int i=0;i<a;i++){
            pd[i] = new Penduduk();
            System.out.println("Penduduk ke-"+(i+1));
            System.out.print("Nik: ");
            pd[i].nik = sc.next();
            System.out.print("Nama: ");
            pd[i].nama = sc.next();
            System.out.print("Alamat: ");
            pd[i].alamat = sc.next();
            System.out.print("Jenis kelamin: ");
            pd[i].jenisKelamin = sc.next();
        }
        System.out.println("---Data Penduduk---");
        System.out.println("No\t\tNIK\t\t\tNama\t\t\tAlamat\t\t\t\tJenis Kelamin");
        for(int i = 0;i<a;i++){
            System.out.println((i+1)+"\t\t" + pd[i].nik + "\t\t\t" + pd[i].nama + "\t\t\t" + pd[i].alamat + "\t\t\t\t" + pd[i].jenisKelamin);
        }
        System.out.println("---Cari Data Penduduk---");
        System.out.print("Masukkan Data yang dicari : ");
        String cari = sc.next();
        boolean dicari = false;
        for (int i = 0; i < a; i++) {
            if (cari.equals(pd[i].nik) || cari.equals(pd[i].nama)) {
                System.out.println((i+1)+"\t\t" + pd[i].nik + "\t\t\t" + pd[i].nama + "\t\t\t" + pd[i].alamat + "\t\t\t\t" + pd[i].jenisKelamin);
                dicari = true;
                break;
            } else {
                System.out.println("Data tidak ada");
                break;
            }
        }
    }
}
