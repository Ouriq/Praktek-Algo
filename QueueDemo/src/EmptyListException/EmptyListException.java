/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmptyListException;

/**
 *
 * @author thori
 */
public class EmptyListException extends Exception {
    public EmptyListException() {
        this("List");
    }

    public EmptyListException(String name) {
        super(name + " is empty");
    }
}

