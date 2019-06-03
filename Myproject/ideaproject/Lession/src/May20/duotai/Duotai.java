package May20.duotai;

public class Duotai{

    int  num=5;

    public Duotai()
    {
        num=20;
    }

    public   void  change()
    {
        num=10;
    }
    public  void  change(int num)
    {
        num++;
        System.out.println("num-->"+num);
    }
    public  void  change(int num,int  number)
    {
        this.num=num;
    }

    public static void main(String[] args) {

        Duotai   t =  new Duotai();
        System.out.println(t.num);
        t.change();
        System.out.println("现在num的值为:"+t.num);

        t.change(20);
        System.out.println("现在num的值为:"+t.num);


        t.change(20,30);
        System.out.println("现在num的值为:"+t.num);

                 Duotai  t1 = new Duotai();
                 t1.change(50,20);
                 System.out.println("现在num的值为:"+t1.num);
    }
}

