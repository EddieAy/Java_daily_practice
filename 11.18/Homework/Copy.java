package Homework;

import java.awt.geom.IllegalPathStateException;
import java.io.*;

public class Copy {
    public static void main(String[] args) {

    }

    public static void copyAll(String src, String dst){


        File f1 = new File(src);
        File f2 = new File(dst);
//        String f2_name = f2.getName();
//        if (!f2_name.contains(".")){
//            f2.mkdir();
//        }
        if(f1.isDirectory()){
            f2.mkdirs();
        }

        if (!f1.isFile() & !f1.isDirectory()){
//            System.out.println("Illegal path");
            throw new IllegalPathStateException();
        }
        if (f1.isFile()) {
            BufferedInputStream bfis = null;
            BufferedOutputStream bfos = null;
            FileInputStream fis = null;
            FileOutputStream fos = null;
            File fileToSave = new File(dst);
//            System.out.println(f1.getAbsolutePath());
            try {
                fileToSave.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(fileToSave.getAbsolutePath());
//            try {
//                fileToSave.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

            try {
//                bfr = new BufferedReader(new FileReader(f1));
                fis = new FileInputStream(f1);
                bfis = new BufferedInputStream(fis);
//                bfw = new BufferedWriter(new FileWriter(fileToSave));
                fos = new FileOutputStream(fileToSave);
                bfos = new BufferedOutputStream(fos);

                byte[] b1 = new byte[4096];
                int readCount;
                while ((readCount = bfis.read(b1)) != -1){
                    bfos.write(b1,0,readCount);
                }

                bfos.flush();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bfis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (f1.isDirectory()){
            String[] fileArray = f1.list();
            if (fileArray == null){
                File dirToSave = new File(dst + f1.getName());
                dirToSave.mkdirs();
            }else {
                for (String fileString:fileArray){
                    File sourceFile = new File(src, fileString);
                    File destinationFile = new File(dst, fileString);
                    System.out.println(sourceFile.getPath());
                    System.out.println(destinationFile.getPath());
                    copyAll(sourceFile.getPath(), destinationFile.getPath());
                }
            }
        }


    }

}
