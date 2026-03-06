package LinkedList;

public class insert {

    public static Node insertAtBegning(Node head, int value){
        Node newNode = new Node(value);
        if(head==null) return newNode;
        newNode.next = head;
        return newNode;

    }

    public static Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value);
        if(head==null) return newNode;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }

    public static Node insertAtPos(Node head, int value, int pos){
        Node newNode = new Node(value);
        if(pos==1){
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for(int i = 1;i<pos-1&&temp!=null;i++){
            temp = temp.next;
        }
        
        if(temp==null) return head;
        newNode.next=temp.next;
        temp.next=newNode;
        return head;

    }
    
}
