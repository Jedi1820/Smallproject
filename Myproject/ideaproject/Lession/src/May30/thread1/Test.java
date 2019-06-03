package May30.thread1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;


public class Test {
    public static void main(String[] args) {
        UserThread ut = new UserThread();
        Thread t = new Thread(ut);
        t.start();

        //创建定时器
        Timer tm = new Timer();
        String start = "2019-05-30 11:45:50";
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startdata = null;

        try {

            startdata = smp.parse(start);
            tm.schedule(new UserThread(),startdata,3*1000);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
