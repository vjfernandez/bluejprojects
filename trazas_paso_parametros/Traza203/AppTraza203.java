public class AppTraza203
{
   
    static Pararapapa p1;

    public static void foo(Pararapapa p)
    {
        p.furruntumar();
    }
    
    public static void bar(Pararapapa p)
    {
        p1=new Pararapapa("Alpargata");
        p=new Pararapapa("Calabaza",true);
    }
    
    
    public static void main(String[] args)
    {
        Pararapapa p2;
        
        p1=new Pararapapa("Mastuerzo", !!!true);
        p2=new Pararapapa("Medialegua");
        foo(p2);
        System.out.format("%s#%b@",p1.getNombre(), p1.getFurruntumado());
        System.out.format("%s#%b@",p2.getNombre(), p2.getFurruntumado());
        bar(p2);
        System.out.format("%s#%b@",p1.getNombre(), p1.getFurruntumado());
        System.out.format("%s#%b@",p2.getNombre(), p2.getFurruntumado());
    }

}
