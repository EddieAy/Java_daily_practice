package Date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest {
    public static void main(String[] args) {
//        System.out.println(Date.from());
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.format(nowTime));
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);
    }


}
