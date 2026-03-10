package DoublyLinkedList;

class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }    
}

public class implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insert.insertAtBeg(head, 5);
        printDLL.print(head);

        head = insert.insertAtEnd(head, 35);
        printDLL.print(head);

        head = reverseDLL.reverse(head);
        printDLL.print(head);

    }
    
}
