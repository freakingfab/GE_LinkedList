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
        @desc: it pops out the first node
        @params: none
        @return: void
     */
    public void popFront() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Cannot pop from an empty list");
        }
    }

    /*
        @desc: it pops out from last
        @params: none
        @return: void
     */
    public void popLast() {
        if (head != null) {
            if(head.next==null){
                head=null;
                return;
            }
            Node<T> temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        } else {
            System.out.println("Cannot pop from an empty list");
        }
    }

    /*
        @desc: search the node with given key in the linkedlist
        @params: data for node
        @return: Node
     */
    public Node<T> search(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /*
        @desc: insert a node after a specific node
        @params: data for new node and data for specific node
        @return: void
     */
    public void addAfterSearchedNode(T newNodeData, T key){
        Node<T> foundNode = search(key);
        if(foundNode==null){
            System.out.println("Node with key not present");
            return;
        }
        int count = 0;
        Node<T> temp = head;
        while(temp!=foundNode){
            count = count + 1;
            temp = temp.next;
        }
        addAtPosition(newNodeData, count + 1);
    }

    /*
        @desc: it deletes node with given key
        @params: data for node
        @return: void
     */
    public void deleteSpecificNode(T key){
        Node<T> foundNode = search(key);
        if(foundNode==null){
            System.out.println("Node with key not present");
            return;
        }
        if(foundNode==head){
            head=null;
            return;
        }
        Node<T> temp = head;
        while(temp.next!=foundNode){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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

