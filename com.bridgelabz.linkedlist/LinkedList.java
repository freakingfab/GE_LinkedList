package com.bridgelabz.linkedlist;

/*
    @desc: implement collection of Node objects
 */
class LinkedList<T> {
    Node<T> head;

    /*
        @desc: constructor for intialising head as null
        @param: none
        @return: none
     */
    public LinkedList() {
        this.head = null;
    }

    /*
        @desc: add a node in linkedlist
        @params: data for node to be added
        @return: void
     */
    public void addAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /*
        @desc: add a node at start
        @param: data for the node
        @return: void
     */
    public void addAtBegin(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    /*
        desc: add a node at specific position in the linked list(zero-based indexing)
        @params: data and position for the node
        @return: void
     */
    public void addAtPosition(T data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node<T> newNode = new Node<>(data);
        if (position == 0) {
            addAtBegin(data);
            return;
        }

        Node<T> temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

