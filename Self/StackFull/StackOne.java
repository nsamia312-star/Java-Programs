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

public static void main(String[] args) {
   // System.out.println(input(top));;
    for(int i =0;i<stack.length;i++)
    {
        push();
    }
}
    
}
