package DoublyLinkedList;

public class insert {

    public static Node insertAtBeg(Node head, int value){
        Node newNode = new Node(value);
        if(head==null) return newNode;
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    }

    public static Node insertAtEnd(Node head,int value){
        Node newNode = new Node(value);
        if(head==null) return newNode;
        if(head.next==null){
            head.next=newNode;
            newNode.prev=head;
            return head;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    
}
