package Date;

public class CurrentTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        TestTime();
    }

    public static void TestTime(){
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long after = System.currentTimeMillis();

        System.out.println("The method execute for " + (after - before) + " ms" );
    }
}
