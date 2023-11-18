package PrintStreamTest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test01 {
    public static void main(String[] args) throws Exception{
        System.out.println(System.out);

        PrintStream p1 = new PrintStream(new FileOutputStream("log.txt",true));

        System.setOut(p1);

        p1.println("qweqeqweqqqwe");
        p1.println("qweqeqweq3123213");
        p1.println("qweqeqweq312");
        p1.println("qweqeqweq123");

        PrintStream consoleOut = new PrintStream(new FileOutputStream(FileDescriptor.out));

        // 将标准输出流重新设置为控制台
        System.setOut(consoleOut);

        // 执行你之前的代码，输出将会在控制台显示
        System.out.println("Back to the console!");
    }
}
