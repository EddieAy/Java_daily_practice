package Homework;

import java.awt.geom.IllegalPathStateException;
import java.io.File;

public class TestCopy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Copy.copyAll("F:\\zera\\jpro","F:\\zera\\test");

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }
}
