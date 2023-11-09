public class LinkedList {
    Node head;

    public class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(Node n)
    {
        if(head == null)
        {
            head = n;
        }
        else
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
                
            }
            curr.next = n;
        }
    }
    public Node delete (int n)
    {
        Node curr = head;
        Node temp=null;
        if(curr.data == n)
        {
            temp=curr;
            head = null;
        }
    
        while(curr.next.data != n)
        {
          curr = curr.next;
        }
        temp = curr.next;
        curr.next = temp.next;
        temp.next = null;
        return temp;
    }

    public void buildLinkedList() {
      Node n1 = new Node(1);
      Node n2 = new Node(2);
      n1.next = n2;
      Node n3 = new Node(3);
      n2.next = n3;
      Node n4 = new Node(4);
      n3.next = n4;

      head = n1;
    }

    public void print() {
      Node curr = head;
      while(curr != null) {
        System.out.print(curr.data + " --> ");
        curr = curr.next;
      }
    }

    public static void main(String[] args) {
      LinkedList l = new LinkedList();
      l.buildLinkedList();

      l.print();

      System.out.println();

      l.insert(l.new Node(5));

      l.print();

      System.out.println();

      l.delete(5);

      l.print();
    }
}
