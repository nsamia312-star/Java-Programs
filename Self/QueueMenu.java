import java.util.Scanner;

public class QueueMenu {
    static Scanner sc = new Scanner(System.in);
    static int[] queue = new int[4];
    static int front = -1;
    static int rear = -1;

    //Enqueue()
    static void enqueue(int data)
    {
        if(rear == queue.length-1)
        {
            System.out.println("Queue Overflow!");
            return;
        }
       else
       {
         if(front == -1)
        {
            front = 0;
        }  
        rear++;
        queue[rear] = data;
       }

       
        
    } 
    
 // Dequeue Method
    static int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow!");
            return 0;
        } else {
            int value = queue[front];
            front++;
            return value;
        }
    }


    public static void main(String[] args) {
        
    }
}
