package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try{
            m1();
        }catch (FileNotFoundException e){
            System.out.println("Not Found this file");
        }

        System.out.println("Test whether code continues after try catch exception");

        a1();
    }

    public static void a1(){
    /*
        try {
            a2();
        }catch (FileNotFoundException e ){
            System.out.println("???????????????");
        }
    */
        a2();
    }

    public static void a2() {

        try {
            new FileInputStream("QWeqweqwe");

        }catch (FileNotFoundException e){
            System.out.println("it did happen");
        }
    }

    public static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    public static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    public static void m3() throws FileNotFoundException {
        new FileInputStream("D:\\aka.txt");

        System.out.println("m3 over");
    }
}
