public class LinkedListLength {
  Node head; // head of the linked list

  // Node class
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  // Method to add a new node at the end of the linked list
  public void append(int new_data) {
    Node new_node = new Node(new_data);

    if (head == null) {
      head = new Node(new_data);
      return;
    }

    new_node.next = null;

    Node last = head;
    while (last.next != null)
      last = last.next;

    last.next = new_node;
    return;
  }

  // Method to find the length of the linked list
  public int length() {
    int count = 0;
    Node current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  // Driver code
  public static void main(String[] args) {
    LinkedListLength llist = new LinkedListLength();

    llist.append(1);
    llist.append(2);
    llist.append(3);
    llist.append(4);

    System.out.println("Length of linked list is: " + llist.length());
  }
}
