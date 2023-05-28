/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] data = new Mahasiswa[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Masukkan nama mahasiswa ke-%d: ", i+1);
            String nama = scanner.nextLine();
            System.out.printf("Masukkan nilai A mahasiswa ke-%d: ", i+1);
            int nilaiA = scanner.nextInt();
            System.out.printf("Masukkan nilai B mahasiswa ke-%d: ", i+1);
            int nilaiB = scanner.nextInt();
            System.out.printf("Masukkan nilai C mahasiswa ke-%d: ", i+1);
            int nilaiC = scanner.nextInt();
            scanner.nextLine();

            data[i] = new Mahasiswa(nama, nilaiA, nilaiB, nilaiC);
        }

        for (int i = 1; i < data.length; i++) {
            Mahasiswa temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].TotalNilai() < temp.TotalNilai()) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }

        System.out.println("3 Mahasiswa terbaik berdasarkan total nilai:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s dengan total nilai %d\n", i+1, data[i].Nama(), data[i].TotalNilai());
        }
    }
}
