/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Kubus[] K1 = new Kubus[3];
        Tabung [] T1 = new Tabung[3];
        LimasSegiEmpat[] L1 = new LimasSegiEmpat[3];
        
        for (int i = 1; i < K1.length; i++){
            K1[i] = new Kubus();
            System.out.println("=============================");
            System.out.println("Kubus ke-"+ i);
            System.out.print("Masukkan sisi kubus: ");
            K1[i].sisi = sc.nextInt();
        }
        for (int i = 1; i < T1.length; i++){
            T1[i] = new Tabung();
            System.out.println("=============================");
            System.out.println("Tabung ke-"+ i);
            System.out.print("Masukkan jari-jari: ");
            T1[i].jari2 = sc.nextFloat();
            System.out.print("Tinggi Tabung: ");
            T1[i].tinggi = sc.nextFloat();
        }
        for (int i = 1; i < L1.length; i++){
            L1[i] = new LimasSegiEmpat();
            System.out.println("=============================");
            System.out.println("Limas ke-"+ i);
            System.out.print("Masukkan Luas alas: ");
            L1[i].luasAlas = sc.nextFloat();
            System.out.print("Masukkan Tinggi Limas: ");
            L1[i].tinggi = sc.nextFloat();
            System.out.print("Masukkan luas sisi tegak segitiga: ");
            L1[i].sisiTegak = sc.nextInt();
        }
        System.out.println("=============================");
        for (int i = 1; i < K1.length; i++){
            System.out.println("Volume Kubus "+i+": "+K1[i].hitungVolumeKubus()+", Luas permukaan kubus "+i+": "+K1[i].hitungLuasPerKubus());
            System.out.println("Volume Tabung "+i+": "+T1[i].hitungVolumeTabung()+", Luas permukaan Tabung "+i+": "+T1[i].hitungLuasPerTabung());
            System.out.println("Volume Limas "+i+": "+L1[i].volumeLimas()+", Luas permukaan Limas "+i+": "+L1[i].LuasPerLimas());
            System.out.println("================================================");
        }
    }
}