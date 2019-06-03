package May27;

public class Stuaction {
    public void queryAgeGroupCount(){
        DBquerymysql db = new DBquerymysql();
        Object[][] datas = db.queryGroupAgeCount();
        for(int i=0;i<datas.length;i++)
        {
            for(int j=0;j<datas[i].length;j++)
            {
                System.out.print(datas[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)
    {
        System.out.println();
        Stuaction  s = new Stuaction();
        s.queryAgeGroupCount();
    }
}
