package LinkedList;

public class search {

    public static int searchNode(Node head, int key){
        if(head==null) return -1;
        Node temp = head;
        int pos = 1;
        while(temp!=null){
            if(temp.value==key){
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }
    
}
