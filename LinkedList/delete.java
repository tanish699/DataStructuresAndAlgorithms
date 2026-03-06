package LinkedList;

public class delete {

    public static Node deleteFirst(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node temp = head.next;
        head.next = null;
        return temp;
    }

    public static Node deleteLast(Node head){
        if(head==null||head.next==null) return null;
        if(head.next.next==null){
            head.next = null;
            return head;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    
}
