package me.ele.napos.datastruct;

/**
 * Created by jakoo on 07/03/2018.
 */
public class MyList {
    private Node head;
    private Node current;

    public static void main(String[] args) {
        MyList myList = new MyList();
        for (int i = 0; i < 5; i++) {
            myList.addData(i);
        }
        myList.printList(myList.head);
    }
//add data to the list
    private void addData(int data) {
        if (head == null) {
            head = new Node(data);
            current = head;
        } else {
            current.next = new Node(data);
            current = current.next;
        }
    }
//print the list

    private void printList(Node head) {
        if (head != null) {
            current = head;
            while (current != null) {
                System.out.println(current.data + " --> ");
                current = current.next;
            }
        }
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
