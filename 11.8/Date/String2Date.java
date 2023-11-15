package Date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class String2Date {
    public static void main(String[] args) throws Exception{
        String nowTime = "2008-08-08 08:08:08:888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(sdf2.parse(nowTime));
    }
}
