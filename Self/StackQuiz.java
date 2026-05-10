import java.util.Scanner;

public class StackQuiz {
   static Scanner sc = new Scanner(System.in);
    static int[] stack = new  int[5];
    static int top = -1;
    // Push Method
    static void push(int x)
    {
        if(top == stack.length-1)
        {
            System.out.println("Stack overflow! ");
            return;
        } 
        else
        {   top++;
            stack[top] = x;
            
        }
    } 
    //Pop Method
    static void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow! ");
            return;
        } 
        else
        {
            System.out.println(stack[top]);
            top--;
        }
    }
    // Display Method
    static void display()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow!");
            return;
        } 
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println( "Stack elements are:" + stack[i]+ " ");
                // if we put here stack2 it will for for string then
            }
        }
    } 
    // ============== REVERSE STRING ==============
    static char[] stack2;
    // push method
    static void push2(char x)
    {
        if(top == stack2.length-1)
        {
            System.out.println("Stack overflow! ");
            return;
        }
        else
        {
            top++;
            stack2[top] = x;
           // System.out.println("The elemet is " + x + "pushed1");
        }
    } 
    //Pop
    static char pop2()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow! ");
            return '\0';
        }
        else
        {   char ch = stack2[top];
           // System.out.println(stack2[top]);
            top--;
            return ch;
        } 
    }
    // Binary Conversion
    

    public static void main(String[] args) {
         for(int i = 0;i<5;i++)
        {
            System.out.print("Enter your data: ");
              int data = sc.nextInt();
             push(data);
        }  
        display();

        // String Input
       /*  System.out.print("Enter your String: ");
        String data = sc.nextLine();
        stack2 = new char[data.length()];
        for(int i = 0;i<data.length();i++)
        {
            push2(data.charAt(i));;
        }
        display();
        System.out.print("Reversed String is: ");
        while (top!=-1) {
            System.out.print(pop2());
        }*/

    }
}
