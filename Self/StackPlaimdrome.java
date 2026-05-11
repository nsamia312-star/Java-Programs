import java.util.Scanner;

public class StackPlaimdrome {
    static Scanner sc = new Scanner (System.in);
    static char [] stack;
    static int top = -1;

    // Push Method
    static void push( char x)
    {
        if(top == stack.length -1)
        {
            System.out.println("Stach over flow! ");
            return;
        }
        else
        {
            top++;
            stack[top] = x ;
        }
    } 
    // Pop Method
    static char pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return '\0';
        } 
        else
        {
            char ch = stack[top];
            top--;
            return ch;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter yur string");
        String data = sc.nextLine();
        stack = new char[data.length()];
        for(int i = 0;i<data.length();i++)
        {
            push(data.charAt(i));
        } 
        String reverse = "";
        while (top!=-1) {
            reverse = reverse + pop();
        } 
        if(data.equals(reverse))
        {
            System.out.println("The String is a Palindrome");
            return;
        } 
        else
        {
            System.out.println("The given string is not a palindrome!");
        }
    }
}
