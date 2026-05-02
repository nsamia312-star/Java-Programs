import java.util.Scanner;

class Node {
    Node next ;
    int data;
    Node pre ;
    Node(int data)
    { 
        this.data = data;
        this.next= null;
        this.pre = null;
    }
}
public class DDL {
   static Node head = null;
   static Node tail = null;
static Scanner sc = new Scanner(System.in);
// Getting Input
static void input(){ 
    System.out.println("Enter 0 to exit ");
    while(true)
    { 
        System.out.print("Enter your data: ");
        int data = sc.nextInt();
        
        if(data == 0)
        {
            break;
        } 
        Node newnNode = new Node(data); 

        if(head == null)
        {
            head = newnNode;
            tail = newnNode;
            newnNode.pre = null; 
        }
        else 
        { 
            tail.next = newnNode;
            newnNode.pre = tail;
              tail = newnNode;
        } 


    }
}  
// Forward Display 
static void display(){ 
    System.out.println(" === FORWARD DISPLAY === ");
    Node temp = head;
    while(temp!=null)
    { 
        System.out.print(temp.data+ " <-> "+ " ");
        temp = temp.next;
    } 
    System.out.println("null");
}


    public static void main(String[] args) {
        input();
        display();
        
    }
}
