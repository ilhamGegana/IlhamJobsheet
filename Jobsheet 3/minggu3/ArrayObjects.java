/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author DELL
 */
public class ArrayObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
    ppArray[0] = new PersegiPanjang();
    ppArray[0].panjang = 110;
    ppArray[0].lebar = 30;
    
    ppArray[1] = new PersegiPanjang();
    ppArray[1].panjang = 80;
    ppArray[1].lebar = 40;
    
    ppArray[2] = new PersegiPanjang();
    ppArray[2].panjang = 100;
    ppArray[2].lebar = 20;
    
    System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[0].panjang+", Lebar: "+ppArray[0].lebar);
    System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[1].panjang+", Lebar: "+ppArray[1].lebar);
    System.out.println("Persegi Panjang ke-0, panjang: "+ppArray[2].panjang+", Lebar: "+ppArray[2].lebar);
    }
}

