/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari record
        Person person = new Person("Thoriq", 25);

        // Menampilkan data
        System.out.println("Nama: " + person.name());
        System.out.println("Umur: " + person.age());
    }
}

