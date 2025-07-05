/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class LinearArray {
    private int[] data;
    private static final Random generator = new Random();

    public LinearArray(int size) {
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    }

    public int linearSearch(int searchKey) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int searchInt;
        int position;

        LinearArray searchArray = new LinearArray(10);
        System.out.println("Array yang dihasilkan: " + searchArray);

        System.out.print("Please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();

        while (searchInt != -1) {
            position = searchArray.linearSearch(searchInt);

            if (position == -1)
                System.out.println("The integer " + searchInt + " was not found.\n");
            else
                System.out.println("The integer " + searchInt +
                        " was found in position " + position + ".\n");

            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }

        input.close();
    }
}

