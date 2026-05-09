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
    static Node head1 = null;
    static Node tail1 = null;
    static Node head2 = null;
    static Node tail2 = null;
    // for splitting list 
    static Node secondhalf= null ;
    

    // Getting Input
    static void input1 ()
    {
        while (true) {
        System.out.print("Enter your data: ");
        int data = sc.nextInt();
        if(data == 0)
        {
            break;
        } 
        Node newNode = new Node(data);
        if(head1 == null)
        {
            head1 = newNode;
            tail1 = newNode;
            newNode.pre = null;

        } 
        else
        {
           tail1.next = newNode;
           newNode.pre = tail1;
           tail1 = newNode; 
        }

        }
    } 

    // INPUT METHOD FOR LIST TWO 
     static void input2 ()
    {
        while (true) {
        System.out.print("Enter your data: ");
        int data = sc.nextInt();
        if(data == 0)
        {
            break;
        } 
        Node newNode = new Node(data);
        if(head2 == null)
        {
            head2 = newNode;
            tail2 = newNode;
            newNode.pre = null;

        } 
        else
        {
           tail2.next = newNode;
           newNode.pre = tail2;
           tail2 = newNode; 
        }

        }
    } 


    //  Display (Reusable for both lists)
    static void display(Node head)
    {
       // System.out.println("==== YOUR DLL ====");
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
    // Insertion At End (Only valid for list one)
    static void endInsertion()
    {   System.out.println("Enter your data: ");
        int data = sc.nextInt();
        Node endNode = new Node(data);
        if(head1 == null)
        {
        head1 = endNode;
        tail1 = endNode;
        endNode.pre = null;    
        } 
        else
        {
            Node temp = head1;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = endNode;
            endNode.pre = temp;
            endNode.next = null;
            tail1 = endNode;
        }
    }
    //Sort Method (Reusable for both lists)
    static void sort(Node head)
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
    // Duplicate Deletion (FOR LIST 1)
    static void deleteNode1()
    {
        if(head1==null||head1.next==null)
        {
            return;
        }
        else
        {
            Node pre = head1;
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
                        tail1 = pre;
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
        // Duplicate Deletion (FOR LIST 2)
    static void deleteNode2()
    {
        if(head2==null||head2.next==null)
        {
            return;
        }
        else
        {
            Node pre = head2;
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
                        tail2 = pre;
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
    // MergeD Lists
    static void merge()
    {
        if(head1==null)
        {
            head1 = head2;
            tail1 = tail2;

        }
        else if(head2 == null)
        {
            System.out.println("List is already sorted!" );
            return;
        }
        else
        {
            tail1.next = head2;
            head2.pre = tail1;
            tail1 =tail2;
            sort(head1);
        }
    } 
    //Split list
    static void split()
    {
        if(head1 == null || head1.next == null)
        {
            System.out.println("List is empty");
            return;
        } 
        Node slow = head1;
        Node fast = head1;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        } 
       
        secondhalf = slow.next;
        slow.next = null;
        secondhalf.pre = null;
    }

    public static void main(String[] args) {
        System.out.println("=== INPUT FOR LIST ONE ===");
        input1();
        System.out.println(" --- Orifinal List 1 ---");
        display(head1);
        sort(head1);
        System.out.println("--- Sorted List 1 ---");
        display(head1); 
        deleteNode1();
        System.out.println("---List after deletion of duplicates---");
        display(head1);

        //LIST TWO
        System.out.println("=== INPUT FOR LIST TWO ===");
        input2();
        System.out.println("---Original list 2");
        display(head2);
        sort(head2);
        System.out.println("---Sorted List 2 ---");
        display(head2);
        deleteNode2();
        System.out.println("---List after deletion of duplicates---");
        display(head2);
        // Merge Call
        merge();
        System.out.println("---Your merged list---");
        //Merge after deletion of duplicated:
        deleteNode1();
        display(head1);
        //Splitted list
        split();
        display(secondhalf);
        
       
    }
}
