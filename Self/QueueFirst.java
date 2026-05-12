public class QueueFirst {
    static int [] queue = new int[5];
    static int rear = -1;
   static int front = 0;

    // Insert
    static void enqueue(int x)
    {
        rear++;
        queue[rear] = x;
    }
    //Delete
    static void dequeue()
    {
        front++;
    } 
    // Display
    static void display()
    {
        for(int i =front;i<=rear;i++)
        {
            System.out.println(queue[i]+ " ");
        }
    }

    public static void main(String[] args) {
        enqueue(12);
        // Dequeue envoke
        dequeue();
        enqueue(30);
        enqueue(40);
        enqueue(89);
        display();

        // Dequeue
        dequeue();
        dequeue();
        display();
        
    }
}
