/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author DELL
 */
public class AntriVaksin {
    public NodeVaksin head;
    public NodeVaksin tail;
    public int size;

    public AntriVaksin() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void tambah(String nomerAntrian, String nama) {
        String data = "Nomer Antrian: " + nomerAntrian + ", Nama: " + nama;
        NodeVaksin newNode = new NodeVaksin(data, nomerAntrian,nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Object hapus() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        String nama = head.nama;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return nama;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("|  No Antrian  |       Nama       |");
        System.out.println("+--------------------------------+");
        NodeVaksin current = head;
        while (current != null) {
            System.out.printf("|  %-11s |  %-15s  |\n", current.getNomerAntrian(), current.getNama());
            current = current.next;
        }
        System.out.println("+--------------------------------+");
        }
    }
}
