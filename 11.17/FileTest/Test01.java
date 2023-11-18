package FileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Test01 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("FileTest/tempdir");

        if (!f1.exists()){
            f1.mkdirs();
        }
/*        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());*/
//        System.out.println(f1.getAbsolutePath());
        for (int i = 0; i < 5; i++) {
            String path = (i+1) +".txt";
            File f2 = new File(f1,path);
/*            if (!f2.exists()){
                f2.createNewFile();

                BufferedWriter bfw = new BufferedWriter(new FileWriter(f2));
                bfw.write("I am trying to write something in " + (i+1) + ".txt");
                bfw.close();
            }*/
//            f2.createNewFile();

            BufferedWriter bfw = new BufferedWriter(new FileWriter(f2,true));
            bfw.write("I am trying to write something in " + (i+1) + ".txt");
            bfw.close();

        }
    }
}
