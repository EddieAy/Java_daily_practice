package TimerTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer(false);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

        String firstTime = sdf.format(new Date());
        Date firstTimeDate = sdf.parse(firstTime);

        timer.schedule(new LogTask(),firstTimeDate,1000 * 5);


//        System.out.println(sdf.format(new Date()));
    }
}

class LogTask extends TimerTask{

    @Override
    public void run() {
        File f1 = new File("TimerTest/log.txt");
        BufferedWriter bfw = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String firstTime = sdf.format(new Date());
        try {
            bfw = new BufferedWriter(new FileWriter(f1,true));

            String s1 = "Now time is : " + firstTime + ". And file is backed up";
            bfw.write(s1 + "\n");
            System.out.println(s1);

            bfw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
