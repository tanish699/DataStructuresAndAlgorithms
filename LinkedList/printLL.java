package LinkedList;

public class printLL {

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            if(temp.next!=null){
                System.out.print(" -> ");
            }
            
            temp = temp.next;
        }
        System.out.println();
        
    }
    
}
