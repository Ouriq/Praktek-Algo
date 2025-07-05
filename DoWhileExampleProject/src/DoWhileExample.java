/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class DoWhileExample {
    
    // Contoh 1: Do-while loop sederhana untuk menghitung mundur
    public static void countdownExample() {
        System.out.println("=== Contoh 1: Countdown dengan Do-While ===");
        int count = 5;
        do {
            System.out.println("Countdown: " + count);
            count--;
        } while (count > 0);
        System.out.println("Blast off!\n");
    }
    
    // Contoh 2: Do-while untuk input validation
    public static void inputValidationExample() {
        System.out.println("=== Contoh 2: Input Validation dengan Do-While ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;
        
        do {
            System.out.print("Masukkan angka positif (1-10): ");
            number = scanner.nextInt();
            
            if (number < 1 || number > 10) {
                System.out.println("Error: Masukkan angka antara 1-10!");
            }
        } while (number < 1 || number > 10);
        
        System.out.println("Angka yang valid: " + number + "\n");
    }
    
    // Contoh 3: Do-while untuk menu-driven program
    public static void menuExample() {
        System.out.println("=== Contoh 3: Menu Program dengan Do-While ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan pesan");
            System.out.println("2. Hitung luas persegi");
            System.out.println("3. Tampilkan tabel perkalian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-3): ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Halo! Ini adalah pesan dari menu.");
                    break;
                case 2:
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    double luas = sisi * sisi;
                    System.out.println("Luas persegi: " + luas);
                    break;
                case 3:
                    System.out.print("Masukkan angka untuk tabel perkalian: ");
                    int angka = scanner.nextInt();
                    System.out.println("Tabel perkalian " + angka + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(angka + " x " + i + " = " + (angka * i));
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 0-3.");
            }
        } while (choice != 0);
    }
    
    // Contoh 4: Do-while untuk password validation
    public static void passwordExample() {
        System.out.println("=== Contoh 4: Password Validation dengan Do-While ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String password;
        String correctPassword = "air";
        int attempts = 0;
        
        do {
            System.out.print("Masukkan password: ");
            password = scanner.nextLine();
            attempts++;
            
            if (!password.equals(correctPassword)) {
                System.out.println("Password salah! Coba lagi.");
                if (attempts >= 3) {
                    System.out.println("Terlalu banyak percobaan. Akses ditolak!");
                    return;
                }
            }
        } while (!password.equals(correctPassword));
        
        System.out.println("Password benar! Selamat datang.\n");
    }
    
    // Main method untuk menjalankan semua contoh
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI DO-WHILE LOOP\n");
        
        // Menjalankan semua contoh
        countdownExample();
        inputValidationExample();
        passwordExample();
        menuExample();
    }
}

