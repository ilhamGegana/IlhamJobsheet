/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author DELL
 */
public class Tugas3SLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleLinkedListTugas3 linkedList = new SingleLinkedListTugas3();

        // Menambahkan data ke linked list
        linkedList.addLast("Multimedia");
        linkedList.addLast("Statistika");
        linkedList.addLast("Algoritma");
        linkedList.addLast("Matematika");
        linkedList.addLast("Basis Data");
        linkedList.addLast("Komputer");
        linkedList.addLast("Android");
        linkedList.addLast("Bahasa");

        // Menampilkan isi linked list
        linkedList.print();
    }
}