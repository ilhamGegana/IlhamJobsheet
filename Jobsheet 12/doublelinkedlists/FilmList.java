/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author DELL
 */
public class FilmList {
    NodeFilm head;

    public void tambahDiAwal(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(id, judul, rating);
        if (head == null) {
            head = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
        System.out.println("Film berhasil ditambahkan di awal.");
    }

    public void tambahDiAkhir(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(id, judul, rating);
        if (head == null) {
            head = newFilm;
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newFilm;
            newFilm.prev = current;
        }
        System.out.println("Film berhasil ditambahkan di akhir.");
    }

    public void tambahPadaIndex(int index, int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(id, judul, rating);
        if (index == 0) {
            tambahDiAwal(id, judul, rating);
            return;
        }
        NodeFilm current = head;
        int count = 0;
        while (count < index - 1 && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index tidak valid.");
            return;
        }
        newFilm.next = current.next;
        if (current.next != null) {
            current.next.prev = newFilm;
        }
        current.next = newFilm;
        newFilm.prev = current;
        System.out.println("Film berhasil ditambahkan pada index " + index + ".");
    }

    public void hapusDataPertama() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        System.out.println("Data pertama berhasil dihapus.");
    }

    public void hapusDataTerakhir() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Data terakhir berhasil dihapus.");
            return;
        }
        NodeFilm current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Data terakhir berhasil dihapus.");
    }

    public void hapusDataTertentu(int id) {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        if (head.id == id) {
            hapusDataPertama();
            return;
        }
        NodeFilm current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
            return;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
        System.out.println("Film dengan ID " + id + " berhasil dihapus.");
    }

    public void cetakFilm() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        NodeFilm current = head;
        System.out.println("Daftar Film:");
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println(" Judul Film: " + current.judul);
            System.out.println(" ipk: " + current.rating);
            current = current.next;
        }
    }

    public void cariFilm(int id) {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        NodeFilm current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Film dengan ID " + id + ":");
            System.out.println("ID: " + current.id + ", Judul: " + current.judul + ", Rating: " + current.rating);
        }
    }

    public void urutBerdasarkanRating() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        NodeFilm current, index;
        double tempRating;
        String tempJudul;
        int tempId;
        current = head;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.rating < index.rating) {
                    tempRating = current.rating;
                    tempJudul = current.judul;
                    tempId = current.id;
                    current.rating = index.rating;
                    current.judul = index.judul;
                    current.id = index.id;
                    index.rating = tempRating;
                    index.judul = tempJudul;
                    index.id = tempId;
                }
                index = index.next;
            }
            current = current.next;
        }
        System.out.println("Daftar film berhasil diurutkan berdasarkan rating secara descending.");
    }
}
