/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class contohfunction {
    
    // Function tanpa parameter dan tanpa return value
    public static void sapaDunia() {
        System.out.println("Halo, Dunia!");
    }
    
    // Function dengan parameter tapi tanpa return value
    public static void sapaNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
    
    // Function dengan parameter dan return value
    public static int tambah(int a, int b) {
        return a + b;
    }
    
    // Function dengan multiple parameters dan return value
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    // Function dengan array parameter
    public static int cariNilaiTerbesar(int[] angka) {
        int terbesar = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }
        return terbesar;
    }
    
    // Main method untuk mengecek function-function di atas
    public static void main(String[] args) {
        // Memanggil function tanpa parameter
        sapaDunia();
        
        // Memanggil function dengan parameter
        sapaNama("Budi");
        
        // Memanggil function dengan return value
        int hasilTambah = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilTambah);
        
        // Memanggil function untuk menghitung luas segitiga
        double luas = hitungLuasSegitiga(6.0, 8.0);
        System.out.println("Luas segitiga: " + luas);
        
        // Memanggil function dengan array
        int[] angka = {5, 8, 2, 10, 3};
        int nilaiTerbesar = cariNilaiTerbesar(angka);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
    }
}

