/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author DELL
 */
public class SingleLinkedListTugas2 {
    NodeChar head;
    NodeChar tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        if (!isEmpty()){
            NodeChar tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    
    public void addFirst(char input){
        NodeChar ndInput = new NodeChar(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(char input){
        NodeChar ndInput = new NodeChar(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void insertAfter(char key, char input){
        NodeChar ndInput = new NodeChar(input, null);
        NodeChar temp = head;
        do {
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                temp.next = ndInput;
                if(ndInput.next==null) tail=ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, char input){
        if (index < 0){
            System.out.println("indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            NodeChar temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeChar(input, temp.next);
            if (temp.next.next==null) tail=temp.next;
        }
    }
    
    public char getData(int index){
        NodeChar tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indexOf(char key){
        NodeChar tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            NodeChar temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail  = temp;
        }
    }
    
    public void remove(char key){
        if (isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeChar temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.next != null && temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            NodeChar temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
    
    public void insertBefore(char key, char input) {
        NodeChar ndInput = new NodeChar(input, null);
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat menambahkan sebelum keyword!");
        } else if (head.data == key) {
            ndInput.next = head;
            head = ndInput;
        } else {
            NodeChar temp = head;
            while (temp.next != null) {
                if (temp.next.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
