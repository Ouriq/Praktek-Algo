/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class RecordExample {
    
    public record Person(String name, int age) {
    }

    public static void main(String[] args) {
        Person person1 = new Person("Budi", 25);
        Person person2 = new Person("Ani", 30);

        System.out.println("Person 1: " + person1.name() + ", Age: " + person1.age());
        System.out.println("Person 2: " + person2.name() + ", Age: " + person2.age());

        System.out.println("Detail Person 1: " + person1);
        System.out.println("Detail Person 2: " + person2);
    }
}
