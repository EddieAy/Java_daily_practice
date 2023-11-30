package Reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test03_properties {
    public static void main(String[] args) {

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("Reflect/File");


        try (FileReader f1 = new FileReader("Reflect/File")) {
            Properties p1 = new Properties();

            p1.load(reader);

            String className1 = p1.getProperty("className1");
            System.out.println(className1);
            Class c1 = Class.forName(className1);
            Object obj = c1.newInstance();
            System.out.println(obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
