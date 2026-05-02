class Node{ 
    Node next;
    int data;
    Node pre ;
    Node(int data)
    { 
        this.data = data;
        this.next = null;
        this.pre = next;
    }
} 
public class DdlFirst { 
    public static void main(String[] args) {
       Node first = new Node(10);
       Node sec = new Node(20);
       Node third = new Node(30);

       first.next = sec;
       sec.pre=first;
        
      sec.next = third;
      third.pre = sec;
      
      //Head and Tail
      Node head = first;
      Node tail = third;

      // Forward Traversal 
      System.out.println("*** Forward Traversal ***");
      Node temp = head;
      while(temp!=null)
      {
        System.out.print(temp.data + "<->");
        temp = temp.next;
      } 
      System.out.println("null"); 
    
      // Backward Traversal
      System.out.println("*** Backward Traversal ***");
       temp = tail; 
       while (temp!=null) {
        System.out.print(temp.data + "<->");
        temp = temp.pre;
       } 
       System.out.println("null");

      
    }
}
