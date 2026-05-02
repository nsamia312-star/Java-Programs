class Nodenew {
    int data;
    Nodenew next;

    Nodenew(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedLists {
    Nodenew head;

    void insertionAtBeginning(int data) {
        Nodenew newNode = new Nodenew(data);
        newNode.next = head;
        head = newNode;
    }

    void InsertionAtEnd(int data) {
        Nodenew endNode = new Nodenew(data);

        if (head == null) {
            head = endNode;
            return;
        }

        Nodenew temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = endNode;
    }

    void Display() {
        Nodenew temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class InsertionAtEnd {
    public static void main(String[] args) {
        LinkedLists L = new LinkedLists();
        L.insertionAtBeginning(10);
        L.insertionAtBeginning(20);
        L.insertionAtBeginning(30);
        L.InsertionAtEnd(50);
        L.Display();
    }
}