package May31;

public class UserThread1 extends Thread{
    Object ob;
    public UserThread1(Object ob) {
        this.ob=ob;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+"start........");

        synchronized (ob)
        {
            for (int i=0;i<10;i++)
            {
                System.out.println(Thread.currentThread().getName()+"\t:"+i);
            }
        }
        System.out.println(Thread.currentThread().getName()+"end..........");

    }
}
