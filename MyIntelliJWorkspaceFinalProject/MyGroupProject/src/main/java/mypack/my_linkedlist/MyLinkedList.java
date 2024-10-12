package mypack.my_linkedlist;

public class MyLinkedList {
    public static void main(String[] args) {
        LL ll1 = new LL(new LL.Node(10));
        ll1.addNodeAtEnd(20);
        ll1.addNodeAtEnd(30);
        ll1.addNodeAtEnd(40);
        ll1.addNodeAtEnd(50);

        ll1.printAllElements();
    }
}

class LL {
    Node head;

    public LL(Node head) {
        this.head = head;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node addNodeAtEnd(int data) {
        Node tail = getTailNode();
        tail.next = new LL.Node(data);
        return tail.next;
    }

    Node getTailNode() {
        Node dummyHead = this.head;
        Node prevToDummyHead = null;

        while (dummyHead != null) {
            prevToDummyHead = dummyHead;
            dummyHead = dummyHead.next;
        }

        return prevToDummyHead;
    }

    void printAllElements() {
        Node dummyHead = this.head;

        while (dummyHead != null) {
            System.out.println(dummyHead.data);
            dummyHead = dummyHead.next;
        }
    }

    int size() {
        Node dummyHead = this.head;
        int counter = 0;

        while (dummyHead != null) {
            ++counter;
            dummyHead = dummyHead.next;
        }

        return counter;
    }
}