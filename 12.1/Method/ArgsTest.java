package Method;

public class ArgsTest {
    public static void main(String[] args) {
        printInt(1,2,3,4,5);
        printInt();
        printInt(new int[5]);
        printInt(new int[]{1,1,4,5,1,4});
    }

    /**
     *
     * @param args Variable Parameters
     */
    public static void printInt(int... args){
        if (args.length == 0){
            System.out.println("114514");
        }else {
            for (int i :
                    args) {
                System.out.print("This is " + i +"\n");
            }
        }
    }
}
