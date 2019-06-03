package May20.jicheng;

public class Base {

    int  a=1;

    static  int  b=2;

    public Base()
    {
        System.out.println("父类构造函数");
        a=3;
        b=4;
    }

    public  void  addA()
    {
        a+=5;
    }
    public  static  void  addB()
    {
        b+=6;
    }
}
