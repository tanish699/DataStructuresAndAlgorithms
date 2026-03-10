package DoublyLinkedList;

public class reverseDLL {

    static void swap(Node node1, Node node2){
        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }
    public static Node reverse(Node head){
        if(head==null) return null;
        if(head.next==null) return head;
        Node temp = head;
        int end = 1;
        Node curr = head;
        int start = 1;
        while(temp.next!=null){
            temp = temp.next;
            end++;
        }
        while(start<=end){
            swap(curr, temp);
            curr = curr.next;
            temp = temp.prev;
            start++;
            end--;
        }
        return head;

    }
    
}
