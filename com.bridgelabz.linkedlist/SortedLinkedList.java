package com.bridgelabz.linkedlist;

public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    /*
        @desc: constructor for the class
        @params:none
        @return: none
     */
    public SortedLinkedList() {
        this.head = null;
    }

    /*
        @desc: add nodes to the linked list
        @params: data
        @return: void
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null && data.compareTo(temp.next.data) > 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    /*
        @desc: print entire linkedlist
        @params: none
        @return: void
     */
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
