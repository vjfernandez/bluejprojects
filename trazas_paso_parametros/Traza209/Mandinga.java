public class Mandinga
{
   
    private Foo f1, f5;

    public Foo bar(Foo x, Foo y)
    {
        x.setD(11);
        f1.setD(-3);
        f5=new Foo("avellana",6);
        y=new Foo("frambuesa",2);
        f5.setD(15);
        return x;
    }
    
    public void run()
    {
        Foo[] dum;
        
        Foo f2=new Foo("naranja", 3);
        Foo f3=new Foo("pera", 7);
        Foo f4=new Foo("manzana", 9);
        
        f1=new Foo("fresa", 5);
        f5=new Foo("ciruela", 4);
        
        f4=bar(f1, f2);

        System.out.format("%d %d %d %d %d", f1.getD(), f2.getD(),
              f3.getD(), f4.getD(), f5.getD()
              );
    }

}
