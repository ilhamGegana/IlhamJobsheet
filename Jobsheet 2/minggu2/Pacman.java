/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author DELL
 */
public class Pacman {
    int x, y, width, height;
    
    Pacman(){
    }
    Pacman(int wd, int ht){
        wd = width;
        ht = height;
    }
    void moveLeft(){
            x =x-1;
    }
    void moveRight(){
        if(x<=width){
            x=x+1; 
        }
    }
    void moveUp(){
            y = y - 1;
    }
    void moveDown(){
            y = y + 1;
    }
    void printPosition(){
        System.out.println("Posisi Pacman adalah "+x+" , "+y);
    }
}
