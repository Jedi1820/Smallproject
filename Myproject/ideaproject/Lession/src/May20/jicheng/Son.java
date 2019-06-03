package May20.jicheng;

public class Son   extends Base {

    public Son()
    {
        System.out.println("子类构造函数");
        a=8;
        b=9;
    }
    public  void  addA()
    {
        a+=7;
    }
    public  static  void  addB()
    {
        b+=8;
    }

    public static void main(String[] args) {

        Son  s = new Son();
        Base  base=s;
        System.out.println(s.a+"\t"+s.b+"\t"+base.a+"\t"+base.b);

        base.addA();
        System.out.println(s.a+"\t"+s.b+"\t"+base.a+"\t"+base.b);

        base.addB();
        System.out.println(s.a+"\t"+s.b+"\t"+base.a+"\t"+base.b);

    }
}
