package May31;

public class UserThread extends Thread{
//    public synchronized void run(){
//        for (int i=0; i<10;i++){
//            System.out.println(Thread.currentThread().getName()+"\t,"+i);
//        }
//    }
    public void run()
    {
        System.out.println("欢迎使用系统，start。。。");
//        synchronized (this) {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName() + "\t," + i);
//            }

        Integer i=0;
        synchronized (i) {
            for ( ;i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t," + i);
            }
            System.out.println("end...........");
        }
    }
}
