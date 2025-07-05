/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thori
 */
// File: List.java
// A simple linked list class with basic operations.

public class List {
    private ListNode firstNode;
    private ListNode lastNode;
    private String name; // string like "list" used in printing

    // constructor creates empty List with "list" as the name
    public List() {
        this("list");
    }

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    // insert Object at front of List
    public void insertAtFront(Object insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode(insertItem);
        else // firstNode refers to new node
            firstNode = new ListNode(insertItem, firstNode);
    }

    // insert Object at back of List
    public void insertAtBack(Object insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same Object
            firstNode = lastNode = new ListNode(insertItem);
        else // lastNode's nextNode refers to new node
            lastNode = lastNode.nextNode = new ListNode(insertItem);
    }

    // remove first node from List
    public Object removeFromFront() throws EmptyListException {
        if (isEmpty()) // throw exception if List is empty
            throw new EmptyListException(name);

        Object removedItem = firstNode.data; // retrieve data being removed

        // update references firstNode and lastNode
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;

        return removedItem; // return removed node data
    }

    // remove last node from List
    public Object removeFromBack() throws EmptyListException {
        if (isEmpty()) // throw exception if List is empty
            throw new EmptyListException(name);

        Object removedItem = lastNode.data; // retrieve data being removed

        // update references firstNode and lastNode
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else { // locate new last node
            ListNode current = firstNode;

            // loop while current node does not refer to lastNode
            while (current.nextNode != lastNode)
                current = current.nextNode;

            lastNode = current; // current is new lastNode
            current.nextNode = null;
        }

        return removedItem; // return removed node data
    }

    // determine whether list is empty
    public boolean isEmpty() {
        return firstNode == null;
    }

    // output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("%s is: ", name);
        ListNode current = firstNode;

        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }
}

// class to represent one node in a list
class ListNode {
    // package access members; List can access these directly
    Object data; // data for this node
    ListNode nextNode; // reference to the next node in the list

    // constructor creates a ListNode that refers to object
    ListNode(Object object) {
        this(object, null);
    }

    // constructor creates ListNode that refers to the specified
    // object and to the next ListNode
    ListNode(Object object, ListNode node) {
        data = object;
        nextNode = node;
    }
}
