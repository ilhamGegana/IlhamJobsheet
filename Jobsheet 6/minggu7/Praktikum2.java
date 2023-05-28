/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author DELL
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        ShellSort urut=new ShellSort(a, a.length);
        
        System.out.println("Data Awal");
        urut.tampilData();
        System.out.println("Data setelah Insertion sort");
        urut.shellSort();
        urut.tampilData();
    }
    
}
