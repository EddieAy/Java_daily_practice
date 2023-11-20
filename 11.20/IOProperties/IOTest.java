package IOProperties;

import java.io.FileReader;
import java.util.Properties;

public class IOTest {
    public static void main(String[] args) throws Exception{
        Properties p1 = new Properties();
        FileReader f1 = new FileReader("IOProperties/userinfo.properties");
        p1.load(f1);

        System.out.println(p1.getProperty("username"));
    }
}
