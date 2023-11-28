package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAtBegin(70);
        linkedList.addAtBegin(56);
        linkedList.addAtBegin(30);

        System.out.print("Linked List: ");
        linkedList.display();

        linkedList.deleteSpecificNode(56);

        System.out.print("Linked List after adding: ");
        linkedList.display();
    }
}
