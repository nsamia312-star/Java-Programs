import java.util.Scanner;

class Node{
    Node next;
    int data;
    Node(int data){ 
        this.data = data;
        this.next = null;
    }
}


public class SingleLinkedList {
static Scanner sc = new Scanner(System.in);
static Node head = null;   
    /// Data from the user 
static void input(){ 
     System.out.println("Enter  '0' to stop the loop: ");


while(true){
    Node temp = head;
    System.out.print("Enter your data: ");
int data = sc.nextInt();
Node newNode = new Node(data);
if(data==0){
    break;
}

if(head==null)
{ 
    head = newNode;
    
    
} 
else 
{ 
    while(temp.next!=null)
    { 
        temp=temp.next;
       
    }  temp.next = newNode;
}

} }

// Dispaly the list 

static void display (){ 
     Node temp = head;
     System.out.println(" ****** Your linked list *****");
        
     while(temp!=null){
        System.out.print(temp.data+ "->");

        temp= temp.next;
     }   
     System.out.println("null");   
} 
                        // ********** DELETION PROCESSES ***********
// Deletion at beginning 

static void deletionAtTop(){ 
    System.out.println(" ---- Deletion at beginning ----");
    if(head==null)
    { 
        System.out.println("List is empty ");
    }
    else
    { 
        head= head.next;
    }
} 

// Deletion at End

static void endDeletion(){ 
System.out.println("------ Deletion at End ------");
Node curr=  head;
if(head==null){ 
    System.out.println("List is empty!");
    return;
} 
if(head.next==null){
    head=null;
    return;
}
//Node pre=null;
while(curr.next.next!=null){ 
    //pre=curr;
    curr= curr.next;
   
} 
 curr.next = null;
}

// Deletion at end using two pointers
static void endTwoPointers(){ 
System.out.println("---- Deletion using two pointers ----");
if(head==null){ 
    System.out.println("List is empty!");
    return;
} 
if(head.next==null){ 
    head = null ;
    return;
} 
Node curr = head;
Node pre =null;
while(curr.next!=null){ 
    pre = curr ;
    curr= curr.next;
} 
pre.next = null;


}    
// Deletion at Mid(any index)

static void deletionAtMid(){ 
 System.out.println("----- Deletion at mid -----"); 

 System.out.println("Enter the index ");
 int index = sc.nextInt();
 if(head==null){ 
    System.out.println("List is empty!");
    return;
 } 
 if(index<=0)
 { 
    System.out.println("Invalid Index!");
    return;
 }
 if(index==1)
 {
    head = head.next;
    return;
 }
 if(head.next == null){ 
    head = null;
    return;
 } 
 Node curr = head;
 Node pre = null;
 //int pos = 0;

 for(int i =1 ;i<index && curr!=null;i++)
 { 
    pre = curr;
    curr = curr.next;
 } 
     pre.next = curr.next;


} 
                      // ***** INSERTION PROCESSES ***** 
    // Insertion at Top
static void insertionAtTop(){ 
    System.out.print("Enter the data for new Node:");
    int data = sc.nextInt();
   Node newNode = new Node(data);
    if(head == null )
    { 
        head = newNode;
    } 
    else
    { 
        newNode.next = head;
        head = newNode;
    }
}  

// Insertion at Mid 
static void insAtMid(){
    System.out.print("Enter your data for the new Node:");
    int data = sc.nextInt();
    Node midNode = new Node(data); 
    System.out.print("Enter the Index: ");
    int index = sc.nextInt();
    if(index<=0)
    { 
        System.out.println("Invalid index !");
        return;
    } 
    if(index == 1) 
    { 
        midNode.next = head;
        head = midNode;
        return;
    }
     if(head==null){ 
      System.out.println("List is empty");
     }  
     else{ 
     Node temp = head;
     for(int i = 1;i<index - 1 && temp!=null;i++){ 
        
         temp = temp.next;
       
     }
      midNode.next = temp.next;
      temp.next = midNode;
       
     
     }
} 

// Insertion At End
static void insAtEnd(){
 System.out.print("Enter the Data for the End Node:");
 int data = sc.nextInt();
 Node endNode = new Node(data);   
Node temp = head;
if(head == null)
{ 
    head = endNode;
    return;
}  
else
{
    while(temp.next!=null)
    { 
        temp = temp.next;
    } 
    temp.next = endNode;
}
}

// Insertion at End using two Pointers

static void twoPointersInsertion(){ 
    System.out.print("Enter the data for the end node: ");
    int data = sc.nextInt();
    Node eNode = new Node(data);

    if(head == null)
         { 
            head = eNode;
            return;
         } 
         Node curr = head;
         Node pre = null;
         while(curr.next!=null){ 
            pre = curr;
            curr = curr.next;
         } 
         curr.next = eNode;

}






    public static void main(String[] args) {
       SingleLinkedList l = new SingleLinkedList();
       l.input();
       l.display();
      // l.deletionAtTop();
      // l.display();
      // l.endTwoPointers();
      // l.display();
     //  l.deletionAtMid();
      // l.display();
    //  l.insertionAtTop();
    //  l.display();
   // l.insAtMid();
   // l.display();
    //  l.insAtEnd();
    // l.display();
    l.twoPointersInsertion();
    l.display();

    }
}
