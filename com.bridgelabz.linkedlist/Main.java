package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList<Integer> linkedList = new SortedLinkedList<>();
        linkedList.add(70);
        linkedList.add(56);
        linkedList.add(30);

        System.out.print("Ordered Linked List: ");
        linkedList.display();
    }
}
