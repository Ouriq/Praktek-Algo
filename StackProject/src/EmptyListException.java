/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        this("List");
    }

    public EmptyListException(String name) {
        super(name + " is empty");
    }
}

