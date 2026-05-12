import java.util.Scanner;
class Node
{
    int data;
    Node pre;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}
public class DoubleListStack {
    static Scanner sc = new Scanner(System.in);
    static Node top = null;
    static Node tail = null;
    // Input
    static void Input()
    {
        while (true) {
            System.out.print("Enter your data: ");
            int data = sc.nextInt();
            if(data == 0)
            {
                break;
            } 
           push(data);
        }
    } 
    // Push Method
    static void push(int data)
    { Node newNode = new Node(data);
        if(top== null)
        {
            top = newNode;
            tail= newNode;
            newNode.pre = null;
        } 
        else
        {
            newNode.next = top;
            newNode.pre = null;
            top  = newNode;
            System.out.println("This " + data + " is pushed");
        }
    }
    // Display
    static void display()
    {

    }
    public static void main(String[] args) {
        Input();
        push(0);
    }
}
