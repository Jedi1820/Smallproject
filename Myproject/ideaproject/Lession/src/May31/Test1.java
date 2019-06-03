package May31;

public class Test1 {
    public static void main(String[] args) {
        Object ob = new Object();
        UserThread1 ut = new UserThread1(ob);
        Thread t1 = new Thread(ut);
        Thread t2 = new Thread(ut);

        t1.start();
        t2.start();
    }
}
