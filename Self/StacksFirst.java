public class StacksFirst {
    static int [] stack = new int[5];
     static int top = -1;
     // PUSH FUNCTION 
    static void push(int data)
    {  //System.out.println("==== PUSHED ELEMENTS ====");
        if(top == stack .length -1 )
        {
            System.out.println("Stack overflow ! ");
            return;
        } 
        else
        {
            top++;
            stack[top] = data;
            System.out.println(data +  " is pushed ");
            
        }
    } 
    // POP FUNCTION
    static void pop()
    { System.out.println("==== POPPED ELEMETS ====");
        if(top == -1)
        {
            System.out.println("Stack is Empty!");
            return;
        } 
        else
        {
            System.out.println(stack[top] + "is popped successfully");
            top --;
        }
    } 
    static void display()
    { 
        if(top == -1)
        {
            System.out.println("Stack is empty ");
            return;

        } 
        System.out.println("Stack elements are: ");
        int i = top;
        while(i>=0)
        {
            System.out.println(stack[i]);
        i--;
        }
        }
    
public static void main(String[] args) {
   push(12);
   push(13);
   push(90);
   pop();
   display();   
}
}
