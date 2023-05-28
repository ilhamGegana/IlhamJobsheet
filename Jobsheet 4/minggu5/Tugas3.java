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
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        Scanner sc = new Scanner(System.in);
        int []index= {0};
        int x = arr[0];
        
        for(int i =1; i<arr.length;i++){
            if (x < arr[i]){
                x = arr[i];
                index = new int[]{i};
            } else if (arr[i] == x) {
                int[] temp = new int[index.length+1];
                for (int j = 0; j < index.length; j++) {
                    temp[j] = index[j];
                }
                temp[temp.length-1] = i;
                index = temp;
            }
        }

        System.out.println("Nilai terbesar: " + x);
        System.out.print("Posisi nilai terbesar: ");
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i] + " ");
        }
    }
}