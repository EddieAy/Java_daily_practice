package Random;

import java.util.Arrays;
import java.util.Random;

public class SortTimeTest {
    public static void main(String[] args) {

        int length = 1250000;
        int[] a1 = getArray(length);
//        printArray(a1);

        long start = System.currentTimeMillis();
        bubbleSort(a1);
        long end = System.currentTimeMillis();
        System.out.println("BubbleSort time is " + (end - start) +" ms ");


        int[] a2 = getArray(length);
//        printArray(a2);
        start = System.currentTimeMillis();
        quickSort(a2,0,a2.length-1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort time is " + (end - start) +" ms ");

//        printArray(a1);
    }


    private static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    private static void quickSort(int[] arr, int low, int high) {
//        long start = System.currentTimeMillis();

        if (low < high) {
            // 找到分割点
            int partitionIndex = partition(arr, low, high);

            // 递归对分割点左右两部分进行排序
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
//        long end = System.currentTimeMillis();
//        System.out.println("BubbleSort time is " + (end - start) +" ms ");
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 交换 arr[i + 1] 和 arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] getArray(int length){
        int[] arr = new int[length];
        Random r1 = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r1.nextInt(10001);
        }
        return  arr;
    }
    public static void printArray(int[] arr){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
