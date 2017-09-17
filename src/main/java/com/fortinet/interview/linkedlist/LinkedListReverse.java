package com.fortinet.interview.linkedlist;

// Time complexity linear O(N) because we are traversing the list only once.
// Space complexity O(1) since it is in place

public class LinkedListReverse {

    class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
        }
    }

    Node reverse (Node head) {
        if (head == null) {
            return null;
        }

        Node previous = null, next;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    Node createListFromArray (int[] a) {
        Node head = null, node = null;
        for (int val : a) {

            if (node == null) {
                node = new Node (val);
                head = node;
            } else {
                node.next  = new Node (val);
                node = node.next;
            }
        }
        return head;
    }

    private void printList (Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

//    public static void main(String[] args) {
//        int []a = new int[] {1,2,3,4,5};
//        LinkedListReverse linkedListReverse = new LinkedListReverse();
//        Node head = linkedListReverse.createListFromArray(a);
//        linkedListReverse.printList(head);
//        head = linkedListReverse.reverse(head);
//        linkedListReverse.printList(head);
//    }
}