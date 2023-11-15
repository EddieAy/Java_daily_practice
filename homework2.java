public class homework2{
    public static void main(String[] args){
        System.out.println("Print all the prime between 2 and 10000");
        
        boolean newline = false;
        int count = 0;
        for (int i = 2; i<=10000;i++){
            if (isPrime(i)){
                if (count != 0 & count % 8 == 0){
                    System.out.println();
                    System.out.print(i + " ");

                }else{
                    System.out.print(i + " ");

                }
                count+=1;
            }
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num);i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    } 

}