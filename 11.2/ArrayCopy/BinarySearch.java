package ArrayCopy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {6,10,2,7};

        int index = Arrays.binarySearch(a,26);
        System.out.println(index);
    }
}
