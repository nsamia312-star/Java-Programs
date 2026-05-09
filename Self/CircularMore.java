import java.util.Scanner;
class Node{
int data;
Node next;
Node(int data)
{
    this.data = data;
    this.next = null;
}
}
public class CircularMore {
    static Scanner sc = new Scanner (System.in);
    static Node head = null;
    static Node tail = null;
    // Getting Input
    static void Input()
    {
        while(true)
        {
            System.out.print("Enter your data: ");
            int data = sc.nextInt();
            if(data == 0)
            {
                break;
            } 
            else{
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
    }
    // Display Method
    static void Display()
    {
        if(head == null)
        {
            System.out.println("List is empty! ");
            return;
        } 
        else
        {
            Node temp = head;
            do{
                System.out.print(temp.data+ "->" + " ");
                temp = temp.next;
            }while(temp!=head);
            System.out.println("head");
        }
    } 
    // Insertion at End
    static void endInsertion()
    {
        System.out.print("Enter data for the new Node: ");
        int data = sc.nextInt();
        Node endNode = new Node (data);
        if(head == null || head.next == null)
        {
            head = endNode ;
            tail = endNode;
            endNode.next = head;
            return;
        } 
        else
        {
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = endNode;
            tail = endNode;
            endNode.next = head;
        }

    } 
    //Top Insertion
    static void topInsertion()
    {
        System.out.print("Enter data for new Node: ");
        int data = sc.nextInt();
        Node topNode = new Node(data);
        if(head == null)
        {
            head = topNode;
            tail = topNode;
            topNode.next = head;
            return;

        }
        else
        {
            topNode.next = head;
            tail.next = topNode;
            head = topNode;

        }
    }
    //Deletion at top
    static void deletiontop()
    {
        if(head == null)
        {
            System.out.println("List is already empty! ");
            return;
        } 
        if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
            tail.next = head;
        }
    }
    // Count Nodes
    static int CountNodes()
    {
        int count = 0;
        if(head == null)
        {
            count = 0;
            return 0;
        } 
        Node temp = head;
        do{
            temp = temp.next;
            count++;
        }while(temp!=head);
        return count;
    }
    // Max and Min
    static void maxMin()
    {
        if(head==null)
        {
            System.out.println("List is empty!");
            return;

        }
        else
        {
             int max = head.data;
             int min = head.data;
            Node temp = head;
            
            do{
                 
                if(temp.data > max)
                {
                    max = temp.data;
                } 
                else if (temp.data<min) {
                     min = temp.data;
                }
                temp = temp.next;
            }
            while(temp!=head);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }
    //Nature of the list
    static boolean nature()
    {
        if(head == null)
        {
            System.out.println("Empty list!");
            return false;
        } 
        else
        {
            Node temp = head.next;
            while(temp!=null && temp!=head)
            {
                temp = temp.next;
                
                }
                if(temp == head)
                {
                    System.out.println("List is circular!");
                    return true;
                }
                else
                {
                    System.out.println("List is not circular!");
                    return false;
            
        } 
    } }
    // Coverting Circular to Single linked List
    static void single()
    {
        if(head == null)
        {
            System.out.println("List is empty!");
            return;
        }
        else
        {
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = null;
        } 
        System.out.println("Now list is Single linked list");
            
    }
    //Display For Single linked List
    static void DisplaySingle()
    {
        if(head == null)
        {
            System.out.println("List is empty! ");
            return;
        } 
        else
        {
            Node temp = head;
            do{
                System.out.print(temp.data+ "->" + " ");
                temp = temp.next;
            }while(temp!=null);
            //System.out.println("head");
        }
    }

    
    public static void main(String[] args) {
        Input();
        System.out.println("=== Circular Linked List ===");
        Display(); 
       // endInsertion();
       // Display();
      //  topInsertion();
      //  Display();
      //  deletiontop();
      //  Display();
      // System.out.println("Total Nodes are: " +  CountNodes());
      //maxMin();
     // System.out.println("Nature: " +nature());
      single();
        DisplaySingle();
        
    }
}
