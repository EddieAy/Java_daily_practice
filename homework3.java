public class homework3{
    public static void main(String[] args){
        int num = 4;

        System.out.println("Pow of "+num+" is "+pow(num));

    }

    public static int pow(int num){
        if (num < 0){
            System.out.println("Wrong! Input must be greater than 0 ");
        }

        if (num == 0){
            return 1;
        }else{
            return pow(num-1) * num;
        }
    }

}