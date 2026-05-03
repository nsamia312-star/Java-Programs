import java.util.Scanner;

class Node{
    Node next;
    int data;
    Node(int data)
    { 
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {
    static Node head = null;
    static Node tail = null;
    static Scanner sc = new Scanner(System.in);
    // Input Method
    static void Input(){ 
        System.out.println("Press 0 to exit!");
        while(true)
        {
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
           
            if(data == 0)
            { 
                break;
            } 
             Node newNode = new Node(data);
           if(head == null)
            {
                head = newNode;
                tail = newNode;
                tail.next = head;
                
            } 
            else
            {
                tail.next = newNode;
                tail = newNode;
                newNode.next = head;
            }
        }
        
    }
    // Diaplay Method 
    static void display(){ 
        Node temp = head;
        System.out.println("====== Circular Linked List ======");
        if(head == null)
        {
            System.out.println("List is empty!");
            return;
        } 
        else
        {
            do
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while(temp!=head); 

        } 
        System.out.println("\n");
    } 
              // ************ INSERTION PROCESSES *************

    static void topInsertion(){ 
        System.out.println("==== Insertion At Top ====");
        System.out.print("Enter the data for new Node: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(head == null)
        { 
            head = newNode;
            tail = newNode;
            tail.next = head;
        } 
        else
        {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }

    }   
    // Insertion at Mid
    static void midInsertion(){ 
        System.out.println("==== Mid Insertion ====");
        System.out.print("Enter the data:");
        int data = sc.nextInt();
         Node miNode = new Node(data);
        System.out.print("Enter the index:");
        int index = sc.nextInt();
        if(index<=0)
        {
            System.out.println("Invalid Index!");
            return;
        }
        if(head == null)
        {
            if(index==1)
            {
            head = miNode;
            tail = miNode;
            tail.next = head;
            return;
            }
            else
            {
                System.out.println("Invalid Index!");
            } 
            return;
        } 
        if(index==1)
        {
            System.out.println("Use Top Insertion Method!");
            return;
        }
     
      else
      {
        Node curr = head;
        Node pre = null;
        for(int i =1;i<index; i++)
        {
            pre = curr;
            curr = curr.next;
            if(curr == head)
            {
                System.out.println("Invalid index!");
                return;
            } 
           
        } 
        miNode.next = curr;
        pre.next = miNode;
      }
    }
    //Insertion At End
    static void endInsertion(){ 
        System.out.println("==== Insertion at End ====");
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        Node endnode = new Node(data);
        if(head == null)
        {
            head = endnode;
            tail = endnode;
            endnode.next = head;
            return;
        }
        else 
        {
            Node temp = head;
         //   Node pre = null;
            while(temp.next!=head)
            {
               // pre = temp;
                temp = temp.next;
            }
            temp.next = endnode;
            tail = endnode;
            endnode.next= head;
        }

    }
                   // ************ DELETION PROCESSES ************
    // Deletion At Top
    static void topdel()
    {
        System.out.println(" ******** Deletion at Top *******");
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
            head = head.next;
            tail.next = head;
        }
    } 
    // Deletion at Mid
    static void midDel(){
        System.out.println("********* Deletion at Mid *********");
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        if(index <=0)
        {
            System.out.println("Invalid Index!");
            return;
        } 
        if(head == null)
        {
            System.out.println("List is empty!");
            return;
        } 
        if(index == 1)
        {
            System.out.println("Use Top Deletion Method!");
            return;
        }
        if(head == tail)
        {
            if(index == 1)
            {
            head = null;
            tail = null;
            return;
        } 
        else
        {
            System.out.println("Invalid Index");
        }
           return; } 
       else 
        {
            Node curr = head;
            Node pre = null;
            for(int i = 1;i<index; i++)
            {
                pre = curr;
                curr = curr.next;
            // Large index
            if(curr == head)
            {
                System.out.println("Invalid Index!");
                return;
            } 
           
            }
             if(curr.next == head)
            {
                System.out.println("Use End insertion Method!");
                return;
            }
            pre.next = curr.next;
            //curr.next = pre;
        } 
    }  
    // Deletion At End
    static void endDel(){ 
        System.out.println("******* Deletion at End *******");
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
            Node curr = head;
            Node pre = null;
            while(curr.next!=head)
            {
                pre = curr ;
                curr = curr.next;


            }
            pre.next = head;
            tail = pre;
        }
    }             

    public static void main(String[] args) {
      //  CircularLinkedList c = new CircularLinkedList();
        Input();
        display();
        //topInsertion();
        //display();
        //midInsertion();
        //display();
        //endInsertion();
        //display();
        //topdel();
        //display();
        //midDel();
        //display();
        endDel();
        display();
        
    }
}
