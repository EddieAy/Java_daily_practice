package LinkedList;

public class Test {
    public static void main(String[] args) {
//        A a1 = new A();
//        A b = a1;
//
//        a1.data = 320;
//        System.out.println(b.data);
//        b.data = 321;
//        System.out.println(a1.data);

        LinkedList l1 = new LinkedList();


        l1.printList();
        for (int i = 0; i < 10; i++) {
            l1.append(i+1);
        }
        l1.printList();
        l1.delete(7);
        l1.delete(1);
        l1.delete(3);
        l1.printList();
    }
}

