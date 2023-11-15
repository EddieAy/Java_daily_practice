package Date;

import java.util.Date;
import java.text.SimpleDateFormat;
public class myTest {
    public static void main(String[] args) throws Exception{
        //1.How to get the current time
        Date nowTime = new Date();
        System.out.println(nowTime.getTime());
        System.out.println(nowTime);

        //2.Make the current time easy to read
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(nowTime));

        //3.Convert a date-format String to a date class (Tips:use parse)
        SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss:SSS");
        String TestTime = "2069-3-28 07-12-26:389";
        System.out.println(sdf2.parse(TestTime));
    }
}
