/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas2SLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleLinkedListTugas2 linkedList = new SingleLinkedListTugas2();
        Scanner sc = new Scanner(System.in);
        
        int menu = 0;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan data di awal linked list");
            System.out.println("2. Tambahkan data di akhir linked list");
            System.out.println("3. Tambahkan data setelah huruf tertentu");
            System.out.println("4. Tambahkan data pada indeks tertentu");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.print("Masukkan huruf: ");
                    char hurufAwal = sc.next().charAt(0);
                    linkedList.addFirst(hurufAwal);
                    linkedList.print();
                    break;
                case 2:
                    System.out.print("Masukkan huruf: ");
                    char hurufAkhir = sc.next().charAt(0);
                    linkedList.addLast(hurufAkhir);
                    linkedList.print();
                    break;
                case 3:
                    System.out.print("Masukkan huruf setelah huruf: ");
                    char hurufKunci = sc.next().charAt(0);
                    System.out.print("Masukkan huruf yang ingin ditambahkan: ");
                    char hurufTambah = sc.next().charAt(0);
                    linkedList.insertAfter(hurufKunci, hurufTambah);
                    linkedList.print();
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int indeks = sc.nextInt();
                    System.out.print("Masukkan huruf yang ingin ditambahkan: ");
                    char hurufInsert = sc.next().charAt(0);
                    linkedList.insertAt(indeks, hurufInsert);
                    linkedList.print();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        } while (menu != 5);
    }
}
