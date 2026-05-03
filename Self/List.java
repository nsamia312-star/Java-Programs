import java.util.Scanner;

class Node {
    Node next;
    int data;
    Node(int data){
        this.data = data;
       this.next = null;
    }
    
}
public class List {
   static Node head;
    //   Scanner sc = new Scanner (System.in);

   static void addNode(){
            Scanner sc = new Scanner (System.in);
      while(true){ 
        Node temp = head;
        System.out.print("Enter the Data: ");
       int data = sc.nextInt(); 
       if(data==0){ 
        break;
       }
        Node newNode = new Node(data);
        if(head== null){ 
            head = newNode;
        } else {
            while(temp.next!=null){ 
                temp=temp.next;
            } 
            temp.next = newNode;
        } 
        
        }

    }
    
   
   static void Display(){ 
    System.out.println("Here is your Linked List: ");
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + "->" );
        temp = temp.next;
    } 
    System.out.println("\n");
    System.out.println("******************");
   } 
   //Insertion at Top 
   static void InsertionAtTop(){ 
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the data for the Node at Top: ");
    int insData = sc.nextInt();
     Node insNode = new Node(insData);
    insNode.next = head;
        head = insNode;
    } 
    // Insertion at Mid 
    static void InsertionAtMid(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you data for new Node At Midlle : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        System.out.println("Where do you want to place the new Node");
          int position=sc.nextInt();
        Node temp = head;
       // Node pre;
      
        for(int i = 1;i<position-1 && temp!=null;i++ ){
            temp = temp.next;
        }
        newNode.next = temp.next; 
        temp.next = newNode;
        
        
    } 
    // Insertion at End 
    static void InsertionAtEnd(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data for Node at End:");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;

        } temp.next = newNode;
    }

   
   
   
   
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        List l = new List();
        l.addNode();
        l.Display();
        l.InsertionAtTop();
        l.Display();
        l.InsertionAtMid();
        l.Display();
        l.InsertionAtEnd();
        l.Display();
        sc.close();

    }
}
