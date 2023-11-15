package LinkedList;

public class Node {
    public Node next;
    public int data;

    public Node(){
        this.data = -1;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
