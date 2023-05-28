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
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        Scanner sc = new Scanner(System.in);
        
        int x , index=-1;
        System.out.print("Masukkan Nilai x: ");
        x = sc.nextInt();
        for(int i =0; i<arr.length;i++){
            if (arr[i]==x){
                index=i;
                System.out.println("Nilai "+x+" Berada di Index "+index);
                break;
            }else if(x<arr[i]){
                System.out.print("Nilai "+x+" Tidak ditemukan");
                break;
            }
        }
    }
}    

