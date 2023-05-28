/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan data yang ingin diperiksa posisinya: ");
                    int dataPeriksa = sc.nextInt();
                    Q.peekPosition(dataPeriksa);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang ingin dilihat datanya: ");
                    int posisi = sc.nextInt();
                    Q.peekAt(posisi);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
