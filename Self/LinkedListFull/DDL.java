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
              // ====== INSERTION PROCESSES ======
// Insertion at Top
static void topIns(){ 
    System.out.println("***** Insertion at Top *****");
    System.out.print("Enter the data for new Node: ");
    int data = sc.nextInt();
    Node topNode = new Node(data);
    if(head == null)
    { 
        head = topNode;
        tail = topNode;
        topNode.pre = null;
        
    } 
    else
    {
      //  Node tail = null;
       // Node temp = head;
        topNode.next = head;
        head.pre = topNode;
        topNode.pre = null;
        head = topNode;
    }
    
}   

// Insertion at Mid
static void midIns(){ 
    System.out.println("***** Insertion at Mid *****");
    System.out.print("Enter your data for the new Node: ");
    int data = sc.nextInt();
    Node midNode = new Node(data);
    System.out.print("Enter the index: ");
    int index = sc.nextInt();
    if(index <=0)
        { 
            System.out.println("Invalid Index! ");
            return;
        } 
    if(head == null)
    {
        if(index == 1)
        {
             
        head = midNode;
        tail = midNode;
        midNode.pre = null;
     
        } 
        else
        {
            System.out.println("Invalid Index! ");
            return;
        }
        return;
    }

    if(index == 1)
    { 
        System.out.println("Use Top Insertion Method! ");
        return;
    }
    else
    { 
        Node temp = head;
        Node pre = null;
        for(int i =0;i<index-1 && temp!=null;i++)
        { 
            pre = temp;
            temp = temp.next;
            if(temp == null)
            { 
                System.out.println("Use End Insertion Method!");
                return;
            }
        } 
        midNode.next = temp;
        midNode.pre = pre;
        temp.pre = midNode;
        pre.next = midNode;

    }
} 
// Insertion at End
static void endIns(){ 
    System.out.println("****** Insertion at End ******");
    System.out.print("Enter the data: ");
    int data = sc.nextInt();
    Node endNode = new Node(data);
    if(head == null)
    { 
        head = endNode;
        tail = endNode;
        endNode.pre = null;
        endNode.next = null;
    } 
    else
    { 
        Node temp = head;
        while(temp.next!=null)
        { 
            temp = temp.next;
        } 
        temp.next = endNode;
        endNode.pre = temp;
        endNode.next = null;
        tail = endNode;
        
    }
} 

                   // ====== DELETION PROCESSES ====== 
// Deletion at Top
static void delTop(){ 
    System.out.println(" ----- Deletion At Top ----- ");
    if(head == null)
    { 
        System.out.println("List is empty! ");
        return;

    } 
   if(head == tail)
   { 
    head = null;
    tail = null;
    return;
   }  
   else
   { 
    head = head.next;
    head.pre = null;
   }
} 

// Deletion at Mid 
static void delmid(){ 
    System.out.println(" ---- Deletion at Mid level ---- ");
    System.out.print("Enter the index: ");
    int index = sc.nextInt();
    if(head == null)
    { 
        System.out.println("List is Empty! ");
        return;
    }
    if(index <= 0)
    { 
        System.out.println("Invalid index!");
        return;
    } 
    if(index == 1)
    {
        System.out.println("Use Top level Deletion Method!");
        return;
    } 
    
    else
    { 
        Node temp = head;
        Node pre = null;
        for(int i = 1; i<index && temp!=null ; i++ )
        { 
            pre = temp;
            temp = temp.next;
            if(temp == null)
            { 
                System.out.println("Invalid Index! ");
                return;
            } 
            if(temp.next == null)
            { 
                System.out.println("Use deletion at end Method !");
                return;
            }

        } 
        pre.next = temp.next;
        temp.next.pre = pre;
    }
}

// Deletion at End
static void delEnd(){ 
    System.out.println("---- Deletion at End ----");
    if(head == null) 
    { 
        System.out.println("List is empty!");
        return;
    } 
   if(head == tail)
    { 
        head = null;
        tail = null;
        return;
}  
else
{ 
    Node temp = head;
    Node pre = null;
    while(temp.next!=null)
    { 
        pre = temp;
        temp = temp.next;
    } 
    pre.next = null;
    tail = pre;
    temp.pre = null;
}
}


    public static void main(String[] args) {
        input();
        display();
        //topIns();
        //display();
        //midIns();
        //display();
        //endIns();
        //display();
        //delTop();
        //display();
        //delmid();
        //display();
        delEnd();
        display();
    

        
    }
}
