/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data array
        int[] data = {5, 12, 8, 30, 25};

        // Input nilai yang dicari
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        // Proses searching
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        // Output hasil
        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan di indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }

        input.close();
    }
}
