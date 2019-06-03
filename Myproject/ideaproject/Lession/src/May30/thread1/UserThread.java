package May30.thread1;

import java.util.Date;
import java.util.TimerTask;
//定时线程：在一个时间启动，反复执行
public class UserThread extends TimerTask {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+",在执行,"+new Date());
    }
}
