package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest04 {
    public static void main(String[] args) {
        try {
            new FileInputStream("12312321");
            System.out.println(100 /0);
        }catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Exception happen");
        }
    }
}
