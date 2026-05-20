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

// Display Method
    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int choice = 0;
        do{
            System.out.println("*** QUEUE MENU *** ");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choic");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your data: ");
                    int data = sc.nextInt();
                    enqueue(data);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;        
            
                default:
                System.out.println("Invalid Choice!");    
                    break;
            }

        } while (choice!=4) ;
            
        
        
    }
}
