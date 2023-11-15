package Exception;

public class MyStackException {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        try {
            s1.push(new Stu());
            s1.push(new Stu());
            s1.push(new Stu());
            s1.push(new Stu());
            s1.push(new Stu());
            s1.push(new Stu());
        }catch (myException m1){
            m1.printStackTrace();
        }


        while (!s1.isEmpty()) {
            try {
                System.out.println(s1.index + 1 + " elements left in stack");
                System.out.println(s1.pop().hashCode());
            }catch (myException m2){
                m2.printStackTrace();
            }
        }
    }

}

class Stack {
    Object[] array = new Object[20];
    int index = -1;

    public void push(Object input) throws myException {
        if (this.isFull()) {
            throw new myException("栈满了");
        } else {
            this.array[++index] = input;
        }
    }

    public Object pop() throws myException {
        if (this.isEmpty()) {
//            System.out.println("There is no element in stack");
//            return null;
            throw new myException("Stack is empty now");
        } else {
            return this.array[index--];
        }
    }

    public boolean isEmpty() {
        return (index == -1);
    }

    public boolean isFull() {
        return (index == 100);
    }
}

class Stu{
    int index = this.hashCode();
}
