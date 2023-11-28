package com.bridgelabz.linkedlist;

/*
    @desc: implements creating a single Node object for linked list of type T
 */
class Node<T> {
    T data;
    Node<T> next;

    /*
        @desc: parameterised constructor with data as input
        @param: data
        @return: none
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
