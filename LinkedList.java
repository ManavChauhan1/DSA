/**
 * LinkedList
 */
public class LinkedList {
    Node head;
    private int size;

    LinkedList() {
        this.size = size;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Adding Data in starting of LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Adding Data at Last of LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    // Delete First Element
    public void delFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last Element
    public void delLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize() {
        return size;
    }

    // Printing LinkedList
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.addFirst(2);
        LL.addFirst(1);
        LL.addFirst(0);

        LL.printList();
        System.out.println();
        System.out.println(LL.getSize());

        LL.delFirst();
        LL.addLast(8);
        LL.addLast(9);
        LL.addLast(10);
        LL.delLast();
        LL.printList();
        System.out.println(LL.getSize());
    }
}