package Random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int[] testArray = getRandomNumbers(15);
        for (int i:testArray
             ) {
            System.out.println(i);
        }
    }

    public static int[] getRandomNumbers(int num){
        long start = System.currentTimeMillis();

        int[] nums = new int[num];
        Random r1 = new Random();

        int newNum;
        int duplicatedTimes = 0;

        nums[0] = r1.nextInt(101);
        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;
            do {
                newNum = r1.nextInt(101);
                for (int j = 0; j < i; j++) {
                    if (nums[j] == newNum ){
                        isDuplicate = true;
                        duplicatedTimes+=1;
                        break;
                    }
                }
            }while (isDuplicate);
            nums[i] = newNum;

        }
        System.out.println("Duplicated times is " + duplicatedTimes);

        long end = System.currentTimeMillis();
        System.out.printf("All time is %d ms \n",end-start);
        return nums;
    }
}
