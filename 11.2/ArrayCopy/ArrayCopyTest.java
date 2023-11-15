package ArrayCopy;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] a = {23,16,39,78,96,5,12,369,124,952};
        int[] long_a = new int[20];

        System.arraycopy(a,0,long_a,1,a.length);

        for (int i = 0; i < long_a.length; i++) {
            System.out.println(long_a[i]);
        }

        Arrays.sort(a);
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------------------------------------------");

        int[] c = {23,16,39,78,96,5,12,369,124,952};
        int index = Arrays.binarySearch(c,16);
        System.out.println(index);
    }
}
