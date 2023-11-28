package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAtBegin(70);
        linkedList.addAtBegin(56);
        linkedList.addAtPosition(30,1);

        System.out.print("Linked List: ");
        linkedList.display();

        if(linkedList.search(35)!=null){
            System.out.println("Found the node with given key");
        }
        else{
            System.out.println("Node with given key not found");
        }
    }
}
