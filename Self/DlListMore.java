import java.util.Scanner;

class Node{
int data ;
Node pre ;
Node next;
Node(int data)
{
    this.data = data;
    this.next = null;
    this.pre = null;
}
}
public class DlListMore {
    static Scanner sc = new Scanner(System.in);
    static Node head = null;
    static Node tail = null;

    // Getting Input
    static void input ()
    {
        while (true) {
        System.out.print("Enter your data: ");
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
            newNode.pre = null;

        } 
        else
        {
           tail.next = newNode;
           newNode.pre = tail;
           tail = newNode; 
        }

        }
    }

    //  Display
    static void display()
    {
        System.out.println("==== YOUR DLL ====");
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        else
        {
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " <-> " + "" );
                temp = temp.next;
            } 
            System.out.println("null");
        }

    }
    // Insertion At End
    static void endInsertion()
    {   System.out.println("Enter your data: ");
        int data = sc.nextInt();
        Node endNode = new Node(data);
        if(head == null)
        {
        head = endNode;
        tail = endNode;
        endNode.pre = null;    
        } 
        else
        {
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = endNode;
            endNode.pre = temp;
            endNode.next = null;
            tail = endNode;
        }
    }
    //Sort Method
    static void sort()
    {
        if(head==null || head.next == null)
        {
            System.out.println("");
            return;
        } 
        else
        {   Node i,j;
            for( i=head;i !=null;i = i.next)
            {   
                for(j=i.next;j!=null;j=j.next)
                {
                    if(i.data>j.data)
                    {
                        int temp = i.data;
                        i.data=j.data;
                        j.data = temp;
                    }
                }
            }
        }
    }
    // Duplicate Deletion
    static void deleteNode()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        else
        {
            Node pre = head;
            Node curr = pre.next;
            while(curr!=null)
            {
                if(curr.data == pre.data)
                {
                    if(curr.next!=null)
                    {
                    pre.next = curr.next;
                    curr.next.pre = pre;
                    } 
                    else
                    {
                        pre.next = null;
                        tail = pre;
                    }
                    curr = pre.next; 
                    
                    
                } 
                else
                {
                    pre = curr;
                    curr = curr.next;
                }
            }
        }
    }
    // Merge Sort

    public static void main(String[] args) {
        input();
        display();
        sort();
        display();
        deleteNode();
        display();
    }
}
