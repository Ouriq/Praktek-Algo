/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
public class List {
    private Node firstNode;
    private Node lastNode;
    private String name;

    // constructor
    public List() {
        this("list");
    }

    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    // insert object at front of list
    public void insertAtFront(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new Node(insertItem);
        } else {
            firstNode = new Node(insertItem, firstNode);
        }
    }

    // remove first node
    public Object removeFromFront() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);

        Object removedItem = firstNode.data;

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.next;

        return removedItem;
    }

    // check if list is empty
    public boolean isEmpty() {
        return firstNode == null;
    }

    // inner class Node
    private class Node {
        Object data;
        Node next;

        Node(Object object) {
            this(object, null);
        }

        Node(Object object, Node node) {
            data = object;
            next = node;
        }
    }
}

