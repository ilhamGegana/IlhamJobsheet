/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author DELL
 */
public class StackStruk {
    static final int size = 8;
    static int top = -1;
    static String[] strukBelanja = new String[size];

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(String struk) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak dapat menambahkan struk belanja.");
        } else {
            top++;
            strukBelanja[top] = struk;
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak dapat mengambil struk belanja.");
            return null;
        } else {
            String struk = strukBelanja[top];
            top--;
            return struk;
        }
    }

    public void tampilkan() {
        if (isEmpty()) {
            System.out.println("Tidak ada struk belanja yang tersimpan.");
        } else {
            System.out.println("Struk belanja yang tersimpan:");
            for (int i = top; i >= 0; i--) {
                System.out.println(strukBelanja[i]);
            }
        }
    }
}
