/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class TestStack {
    public static void main(String[] args) {
        StackInherite stack = new StackInherite();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        try {
            while (true) {
                System.out.println("Popped: " + stack.pop());
            }
        } catch (EmptyListException e) {
            System.out.println("Stack is now empty.");
        }
    }
}

