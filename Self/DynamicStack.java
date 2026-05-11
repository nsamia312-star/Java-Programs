import java.util.Scanner;

class Node
    {
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
public class DynamicStack {
  static Scanner sc = new Scanner(System.in);
  static Node top = null;

  // Push Method
  static void push(int data)
  { Node newNode = new Node(data);
    if(top == null)
    {
        top = newNode;
    } 
    else
    {
        newNode.next = top;
        top = newNode;
    } 
  } 
  // Pop 
  static int pop()
  {
    if(top==null)
    {
        System.out.println("Stack underflow!");
        return 0;
    } 
    else
    {
        int popdata = top.data;
        top = top.next;
        return popdata;
    }
  } 
  // display data
  static void display()
  {
    if(top == null)
    {
        System.out.println("Stack is empty!");
        return;
    } 
    else
        while (top!=null) {
            System.out.println("The stack list is : " + top.data);
            top = top.next;
        }

  }
    public static void main(String[] args) {
       while(true)
       {
        System.out.print("Enter your data: ");
        int data = sc.nextInt();
        if(data == 0)
        {
            break;
        } 
        else
        {
            push(data);
        }
       }
       System.out.println("The Element is popped: " +pop());
       display();
        
    }
}
