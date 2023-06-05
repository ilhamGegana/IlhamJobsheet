/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu14;

/**
 *
 * @author DELL
 */
public class BinaryTreeArrayTugasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTreeArrayTugas bta = new BinaryTreeArrayTugas();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        
        System.out.println("Traverse InOrder");
        bta.traverseInOrder(0);
        System.out.println();

        bta.add(10);
        bta.add(15);

        System.out.println("Traverse Pre Order");
        bta.traversePreOrder();
        System.out.println();

        System.out.println("Traverse Post Order");
        bta.traversePostOrder();
        System.out.println();
    }
}
