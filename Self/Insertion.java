public class Insertion {
    public static void main(String[] args) {
       Node n1 = new Node(90); 
       Node n2 = new Node(80); 
       Node n3 = new Node(70); 
       Node n4 = new Node(60); 
       Node n5 = new Node(50); 
                      n1.next =n2;
                      n2.next = n3;
                      n3.next=n4;
                      n4.next=n5;
                      // Insrtion at beginning 
      Node newNode = new Node(20);
                      newNode.next = n1;
                      n1=newNode;
                      // Insertion at end
     Node endNew = new Node(10);
                      n5.next = endNew;
                      n5 = endNew;
                      Node temp = n1;
                      while(temp!=null){
                        System.out.print(temp.data+ "->");
                        temp = temp.next;
                      }




    }


    }

