/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author DELL
 */
public class SLLMahasiswa {
    NodeMahasiswa head;
    NodeMahasiswa tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa data) {
        NodeMahasiswa newNode = new NodeMahasiswa(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Mahasiswa dengan NIM " + data.nim + " ditambahkan di awal antrian.");
    }

    public void addLast(Mahasiswa data) {
        NodeMahasiswa newNode = new NodeMahasiswa(data, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Mahasiswa dengan NIM " + data.nim + " ditambahkan di akhir antrian.");
    }

    public Mahasiswa removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa removedData = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println("Mahasiswa dengan NIM " + removedData.nim + " dihapus dari awal antrian.");
        return removedData;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        NodeMahasiswa current = head;
        int no = 1;
        while (current != null) {
            System.out.println(no +". NIM: " + current.data.nim + ", Nama: " + current.data.nama);
            current = current.next;
            no++;
        }
    }
}
