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
public class ArrayObjects2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3;i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.print("Masukkan Panjang: ");
            ppArray [i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0;i < 3;i++){
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.println("Panjang: "+ppArray[i].panjang+", Lebar: "+ppArray[i].lebar);
        }
    } 
}
