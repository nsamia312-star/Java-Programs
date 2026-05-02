class  Node {
int data;
Node next;
Node(int data){ 
    this.data=data;
    this.next = null;
}
} 
class LinkedList{ 
    Node head;
    void insertionAtBginning(int data){ 
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
    } 
    void specific(int data,int pos){ 
        Node newNode = new Node(data);
        if(pos==1){ 
            newNode.next = head;
            head = newNode;
            return; 
        } 
        Node temp = head;
        for(int i =1;i<pos-1 && temp!=null;i++){ 
            temp = temp.next;
        } 
        newNode.next = temp.next;
        temp.next= newNode;
        
    }
    void Display(){ 
        Node temp = head;
        while(temp!=null){ 
            System.out.print(temp.data+ " ->");
            temp = temp.next;
        }
    }

}
    
public class InsertionAtSpecificPos {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
       l1.insertionAtBginning(20);
       l1.insertionAtBginning(30);
       l1.insertionAtBginning(79);
       l1.specific(89, 2);
       l1.Display();
        
    }
}
