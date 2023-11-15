package Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(new Stu());
        s1.push(new Stu());
        s1.push(new Stu());

        while (!s1.isEmpty()){
            System.out.println(s1.index+1 + " elements left in stack");
            System.out.println(s1.pop().hashCode());
        }
    }

}

class Stack{
    Object[] array = new Object[100];
    int index = -1;
    public void push(Object input){
        if (index >= this.array.length){
            System.out.println("The stack is already filled");
        }
        else {
            this.array[++index] = input;
        }
    }

    public Object pop(){
        if (index == -1){
            System.out.println("There is no element in stack");
            return null;
        }else {
            return this.array[index--];
        }
    }

    public boolean isEmpty(){
        return (index == -1);
    }

    public boolean isFull(){
        return (index == 100);
    }
}

class Stu{
    int id = this.hashCode();
}

