public class wl{
    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);
        String username;
        String password;

        int retry = 3;
        boolean flag = true;
        do{
            System.out.println("Please input username:");
            username = sc.next();
            System.out.println("Please input password:");
            password = sc.next();

            retry -= 1;
        }while((retry > 0 )  && !(username.equals("admin") & password.equals("123")) );
        // 有一个 False 就 break  |
        if(retry == 0){
            System.out.println("You have typed the wrong password for several times. The system will be locked for 30 minutes.");
            // break;
        }
        if(retry > 0){
            System.out.println("Welcome back! "+username);

        }

    }
}