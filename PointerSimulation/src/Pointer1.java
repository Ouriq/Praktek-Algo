/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Pointer1 {
    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntWrapper num1 = new IntWrapper(100);
        IntWrapper num2 = new IntWrapper(200);

        System.out.println("Sebelum swap:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);

        swap(num1, num2);  // seperti passing by pointer

        System.out.println("\nSetelah swap:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);
    }
}
 