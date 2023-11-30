package Reflect;

import java.util.ResourceBundle;

public class Test05_resourcesBundle {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Reflect/db");

        String className = rb.getString("handsome");
        System.out.println(className);
    }
}
