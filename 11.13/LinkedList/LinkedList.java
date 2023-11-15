package LinkedList;

public class LinkedList {
    public Node head = new Node();
    public Node last = head;

    public void append(int data){
        Node newNode = new Node(data);
        last.next = newNode;
        last = newNode;
    }

    public void delete(int data){
        Node current = head;
        Node previousNode = null;

        while (current != null && current.data != data){
            previousNode = current;
            current = current.next;
        }

        //current 为null 说明一定走到了最后   如果不为null 一定是找到了数据
        if (current == null){
            System.out.println("链表中没有该数据: " + data);
        }

        //走到这一步，要么current.next 为Null  要么 找到数据了
        if (current != null){
            if(current == head){
                head.next = null;
            }else {
                previousNode.next = current.next;
            }
        }
    }

    public void printList(){
        if (head.next == null){
            System.out.println("链表中没有元素");
        }else {
            Node current = head.next;
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }


    }


}
