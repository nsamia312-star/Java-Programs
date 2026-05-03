class Node
{ 
    Node next;
    int data;
    Node(int data)
    { 
        this.data = data;
        this.next = null;
    }
}
public class CircularFirst {
    public static void main(String[] args) {
        Node first = new Node(12);
        Node second = new Node(13);
        Node tail = new Node(34);
        first.next = second;
        second.next = tail;
        tail.next = first;
        // Trversal
        System.out.println("Circular Linked List");
        Node head = first;
        Node temp = head;
        do {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        } 
        while(temp!=head);

    }
}
