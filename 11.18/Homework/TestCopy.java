package Homework;

import java.awt.geom.IllegalPathStateException;
import java.io.File;

public class TestCopy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Copy.copyAll("F:\\Teacher Eleonor Meets the Army","F:\\zera\\test");

//        File f1 = new File("F:\\Teacher Eleonor Meets the Army");
//        System.out.println(f1.isFile());
//        System.out.println(f1.isDirectory());
//        if (!f1.isFile() & !f1.isDirectory()){
//            throw new IllegalPathStateException();
//        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }
}
