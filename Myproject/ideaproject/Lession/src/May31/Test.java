package May31;

public class Test {
    public static void main(String[] args) {
        UserThread ut = new UserThread();
        Thread t1 = new Thread(ut);
        Thread t2 = new Thread(ut);

        t1.start();
        t2.start();
    }
}
