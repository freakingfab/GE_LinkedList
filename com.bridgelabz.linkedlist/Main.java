package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAtBegin(70);
        linkedList.addAtBegin(30);
        linkedList.addAtBegin(56);

        System.out.print("Linked List: ");
        linkedList.display();
    }
}
