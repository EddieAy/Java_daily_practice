package Decimal;

import java.text.DecimalFormat;

public class DecimalTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.000");
        System.out.println(df.format(89135.36));
    }
}
