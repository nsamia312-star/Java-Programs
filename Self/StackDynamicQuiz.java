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
public class StackDynamicQuiz {
    static Scanner sc = new Scanner(System.in);
    static Node top = null;
    //Isempty()
    static boolean isEmpty()
    {
        return top == null;
    }
    // isFull()
    static boolean isFull()
    {
        return false;
    }


    // push
    static void push(int data)
    {
        Node newnNode = new Node(data);
        if(isEmpty())
        {
           top = newnNode;
           return;
        } 
        else
        {
            newnNode.next = top;
            top = newnNode;
            
        }
    } 
    // Pop
    static int pop()
    {
        if(isFull())
        {
            System.out.println("Stack is empty!");
            return 0;
        } 
        else
        {
            int popdata = top.data;
            top = top.next;
            return popdata;
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Getting data");
        while(true)
        {
            System.out.print("Enter your data: ");
            int data = sc.nextInt();
            if(data == -1)
            {
                break;
            } 
            
                push(data);
            
        } 
        int value = pop();
    System.out.println("The popped data is: " + value);
        
    }
}
