import java.util.Scanner;

public class StackOne {
    static Scanner sc = new Scanner(System.in);
    static int [] stack = new int[5];
    static int top = -1; 
    // Input Method
    static int input()
    {
        //for(int i =0;i<stack.length;i++)
        
            System.out.print("Enter your data: ");
            int  data = sc.nextInt();
        
        return data;
        
    }
    // Push Function
    static void push()
    {
       // System.out.println(" : Pushing Data :");
        if(top == stack.length-1)
        {
                System.out.println("Stack overflow!");
                return;
        }
        else 
        {   int data = input();
            top++;
            stack[top] = data;
            System.out.println( data + " is pushed");
        }
    }
    static void pop()
    { 
        if(top == -1)
        {
            System.out.println("Stack is empty!");
            return;
        } 
        else 
        {
            System.out.println(stack[top] + " is popped succesfully!");
            top--;
        }
    }
    static void display(){
        System.out.println("Your full stack is :");
        for(int i =top;i>=0;i--)
        {
            System.out.println("List is : " + stack[i]);
        }
    }

public static void main(String[] args) {
   // System.out.println(input(top));;
    for(int i =0;i<stack.length;i++)
    {
        push();
    } 
    pop();
    display();
}
    
}
