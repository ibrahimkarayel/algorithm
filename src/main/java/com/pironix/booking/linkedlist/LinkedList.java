package com.pironix.booking.linkedlist;

/**
 * Created by ikarayel on 3/2/2017.
 *
 * @author ibrahim KARAYEL
 */
public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        linkedList.head.next = second;
        linkedList.head.next.next = third;
        linkedList.head.next.next.next = fourth;
        linkedList.head.next.next.next.next = fifth;
        printLinkedList(linkedList);
    }

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static void printLinkedList(LinkedList list) {
        Node node = list.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
