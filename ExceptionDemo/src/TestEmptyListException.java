/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class TestEmptyListException {
    public static void main(String[] args) {
        try {
            checkListEmpty(true); // Ganti ke false untuk lihat kondisi tidak error
        } catch (EmptyListException e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        }
    }

    public static void checkListEmpty(boolean isEmpty) throws EmptyListException {
        if (isEmpty) {
            throw new EmptyListException("MyList");
        }
        System.out.println("List tidak kosong, aman digunakan.");
    }
}

