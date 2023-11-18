package Homework;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        File f1 = new File("F:\\zera\\test\\");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f1.exists());
    }
}
