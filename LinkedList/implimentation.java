package LinkedList;

class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        
    }

public class implimentation {
    

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        printLL.print(head);

        head = insert.insertAtBegning(head, 5);
        printLL.print(head);

        head = insert.insertAtEnd(head, 40);
        printLL.print(head);

        head = insert.insertAtPos(head, 35,5);
        printLL.print(head);

        head = delete.deleteLast(head);
        printLL.print(head);

        System.out.println(search.searchNode(head, 30));

    }
    
}
