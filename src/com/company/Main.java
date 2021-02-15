package com.company;

import java.util.Scanner;

public class Main {
    static class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class LinkedList {
        public Node head;
        public Node tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            Node node = new Node(nodeData);
            if (this.head == null) {
                this.head = node;
            }else{
                this.tail.next=node;
            }
            this.tail = node;
        }
    }

    static void printLinkedList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList llist = new LinkedList();
        System.out.println("Enter the size of linked list :");
        int size = scan.nextInt();
        System.out.println("Insert Elements in Linked List :");
        for (int i=0;i<size;i++){
            llist.insertNode(scan.nextInt());
        }
        System.out.println("Printing the elements of Linked List :");
        printLinkedList(llist.head);
        scan.close();
    }
}

