/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class ListTest {
    public static void main(String[] args) {
        List myList = new List("MyLinkedList");

        // Tambahkan elemen ke depan dan belakang
        myList.insertAtFront("C");
        myList.insertAtBack("D");
        myList.insertAtFront("B");
        myList.insertAtFront("A");

        // Cetak isi list
        myList.print(); // Output: MyLinkedList is: A B C D

        // Hapus dari depan
        try {
            Object removed = myList.removeFromFront();
            System.out.println("Dihapus dari depan: " + removed);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        // Hapus dari belakang
        try {
            Object removed = myList.removeFromBack();
            System.out.println("Dihapus dari belakang: " + removed);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        // Cetak lagi isi list
        myList.print();
    }
}

