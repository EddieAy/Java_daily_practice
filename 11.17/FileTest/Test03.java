package FileTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
//F:\Program Files\7za.exe
        File f1 = new File("F:\\Jill the Cruel Blonde.zip");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.canExecute());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.lastModified());

        Date humanTime = new Date(f1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Last file modified time is "+sdf.format(humanTime));

        int fileSize = (int)f1.length();

        System.out.printf("The file size is %dMB %dKB",fileSize/(1024 * 1024),(fileSize%(1024 * 1024))/1024);
        File f2 = new File("F:\\zera");
        System.out.println(f2.length());

//        System.out.println(f2.listFiles());
        for (File f:f2.listFiles()
             ) {
            if(f.isDirectory()){
                System.out.println(f.getAbsolutePath());

            }
        }
    }
}
