/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author DELL
 */
public class NodeVaksin {
    public Object data;
    public NodeVaksin prev;
    public NodeVaksin next;
    String nomerAntrian;
    String nama;

    public NodeVaksin(Object data, String nomerAntrian, String nama) {
        this.data = data;
        this.nomerAntrian = nomerAntrian;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }

    public String getNomerAntrian() {
        return nomerAntrian;
    }

    public String getNama() {
        return nama;
    }
}