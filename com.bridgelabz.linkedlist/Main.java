package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAtBegin(70);
        linkedList.addAtBegin(56);
        linkedList.addAtPosition(30,1);

        System.out.print("Linked List: ");
        linkedList.display();

        linkedList.popFront();

        System.out.print("Linked List after popFront: ");
        linkedList.display();
    }
}
