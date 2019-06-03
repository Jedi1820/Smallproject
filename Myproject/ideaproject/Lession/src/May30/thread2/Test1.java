package May30.thread2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test1 {
    public static void main(String[] args) {


    UserTask  yt= new UserTask();
//		Thread  t = new Thread(yt);
//		t.start();

    //定时反复执行

    //1.创建一个定时器
    Timer tm= new Timer();


    String start="2019-05-30 10:49:00";

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    Date startdate =null;

        try {
            startdate = sdf.parse(start);
            tm.schedule(new UserTask(), startdate, 5*1000);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}