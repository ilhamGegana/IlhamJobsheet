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
public class luasTanahMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,max =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah: ");
        i = sc.nextInt();
        LuasTanah[] LT = new LuasTanah[i+1];
        int Tanah = 0;
        
        for (i=1;i<LT.length;i++){
            LT[i] = new LuasTanah();
            System.out.println("Tanah "+i);
            System.out.print("Panjang: ");
            LT[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            LT[i].lebar = sc.nextInt();
        }
        System.out.println("");
        for (i=1;i<LT.length;i++){
            System.out.println("Luas Tanah "+i+": "+LT[i].hitung());
        }
        for (i=1;i<LT.length;i++){
            if (LT[i].hitung()>max){
                Tanah = i;
                max = LT[i].hitung();
            }
        }
        System.out.println("");
        System.out.println("Luas terluas: Tanah "+Tanah);
    }
}
