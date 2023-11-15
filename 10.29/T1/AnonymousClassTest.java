package T1;

public class AnonymousClassTest {
    public static void main(String[] args) {
        myMath m1 =  new myMath();
        m1.mySum(new Compute() {
            public int sum(int x,int y){
                return x+y;
            }
        }, 100, 200);
    }
}

interface Compute{
    int sum(int a, int b);
}

//class ComputeClass implements Compute{
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}

class myMath{

    public void mySum(Compute c,int x ,int y){
        int retValue = c.sum(x,y);
        System.out.printf("%d + %d = %d \n",x,y,retValue);
    }
}
