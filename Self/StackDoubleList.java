import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node pre;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}
public class StackDoubleList {
    static Scanner sc = new Scanner(System.in);
    static Node top = null;

    //Push()
    static void push(int c)
    {
        Node newNode = new Node(c);
        if(top == null)
        {
            top = newNode;
            newNode.next = null;
            newNode.pre = null;
            
            
        } 
        else
        {
            newNode.next = top;
            top.pre = newNode;
            top = newNode;
        }
    }  
    // Display()
    static void display()
    {
        if(top == null)
        {
            System.out.println("Stack list is empty! ");
            return;
        } 
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
        }
    } 
    //Pop()
    static int pop()
    {
        if(top == null)
        {
            System.out.println("Stack list is empty!");
            return 0 ;
        } 
        else
        {   int data = top.data;
            top = top.next;
            top.pre = null;
            return data;

        }
    }

    public static void main(String[] args) {
        while(true)
        {
            System.out.print("ENTER YOUR DATA: ");
            int data = sc.nextInt();
            if(data == -1)
            {
                break;
            } 
            push(data);
        }
        display();
        System.out.println("The popped elemet is " + pop());
        display();
    }
}
