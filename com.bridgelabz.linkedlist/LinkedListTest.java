package com.bridgelabz.linkedlist;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/*
    @desc: test class for linked list functions
 */
public class LinkedListTest {
    /*
        @desc: junit test for search function of linked list
        @param: none
        @return: void
     */
//    @Test
    void testSearch() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAtBegin(56);
        linkedList.addAtBegin(30);
        linkedList.addAtBegin(70);

        Node<Integer> foundNode = linkedList.search(30);

//        assertNotNull(foundNode);
//        assertEquals(30, foundNode.data);
    }
}
