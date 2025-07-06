/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class StackInherite extends List {
    // no-argument constructor
    public StackInherite() {
        super("stack");
    }

    // add object to stack
    public void push(Object object) {
        insertAtFront(object);
    }

    // remove object from stack
    public Object pop() throws EmptyListException {
        return removeFromFront();
    }
}

