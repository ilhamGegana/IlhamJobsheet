/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author DELL
 */
public class QueueMahasiswa {
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public QueueMahasiswa(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
    public void enqueue(Mahasiswa antri) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = antri;
        size++;
        System.out.println("Mahasiswa dengan NIM " + antri.nim + " telah ditambahkan ke dalam antrian.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return -1;
        }
        Mahasiswa deq = antrian[front];
        front = (front + 1) % max;
        size--;
        System.out.println("Mahasiswa dengan NIM " + deq.nim + " telah dikeluarkan dari antrian.");
        return front;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + ". NIM: " + antrian[index].nim + ", Nama: " + antrian[index].nama);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Data Mahasiswa Paling Depan:");
        System.out.println("NIM: " + antrian[front].nim + ", Nama: " + antrian[front].nama);
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Data Mahasiswa Paling Belakang:");
        System.out.println("NIM: " + antrian[rear].nim + ", Nama: " + antrian[rear].nama);
    }
    public void peekPosition(String nim) {
    if (isEmpty()) {
        System.out.println("Antrian kosong!");
        return;
    }
    for (int i = 0; i < size; i++) {
        int index = (front + i) % max;
        if (antrian[index].nim.equals(nim)) {
            System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi antrian ke-" + (i + 1));
            return;
        }
    }
    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
    }

    public void printMahasiswa(int posisi) {
        if (posisi < 1 || posisi > size) {
            System.out.println("Posisi antrian tidak valid!");
            return;
        }
        int index = (front + posisi - 1) % max;
        System.out.println("Data Mahasiswa pada posisi " + posisi + ":");
        System.out.println("NIM: " + antrian[index].nim + ", Nama: " + antrian[index].nama);
    }
}
