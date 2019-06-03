package May30.thread2;


import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

public class UserTask extends TimerTask {
    @Override
    public void run() {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("/Applications/QQ.app/Contents/MacOS/QQ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
