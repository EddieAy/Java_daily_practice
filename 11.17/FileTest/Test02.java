package FileTest;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        File f = new File("FileTest/tempdir/1.txt");

        if (f.exists()) {
            System.out.println("It exists");
            BufferedReader bfr = null;
            try {
                bfr = new BufferedReader(new FileReader(f));
                BufferedWriter bfw = new BufferedWriter(new FileWriter(f,true));
                String line;
                while ((line = bfr.readLine()) != null){
                    System.out.println(line);
                }

                bfw.write("\nYou know. Janmes is my brother.It's Crazy");
                bfw.flush();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bfr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
