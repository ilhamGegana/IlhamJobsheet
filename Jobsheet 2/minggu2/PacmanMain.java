/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class PacmanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String masukan, lanjut;
        int width,height;
        
        System.out.println("PACMAN");
        System.out.println("===============");
        System.out.print("Lebar horizontal : ");
        width = sc.nextInt();
        System.out.print("Tinggi vertikal : ");
        height = sc.nextInt();
        
        Pacman Pacman = new Pacman(width,height);
        
        System.out.println("KONTROL");
        System.out.println("================");
        System.out.println("w Untuk bergerak ke atas");
        System.out.println("s Untuk bergerak ke bawah");
        System.out.println("a untuk bergerak ke kiri");
        System.out.println("d untuk bergerak ke kanan");
        
        do {
            System.out.print("Masukkan kontrol");
            masukan = sc.next();
            if (masukan.equalsIgnoreCase("a")){
                Pacman.moveLeft();
            }
            else if (masukan.equalsIgnoreCase("d")) {
                Pacman.moveRight();
            }
            else if (masukan.equalsIgnoreCase("w")) {
                Pacman.moveUp();
            }
            else if (masukan.equalsIgnoreCase("s")) {
                Pacman.moveDown();
            }
            System.out.print("Ingin lanjut ? y/t : ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("y"));
        Pacman.printPosition();
    }
}
