public class AppTraza203
{
   
    static Papagallo p1;

    public static void foo(Papagallo p)
    {
        p.vacunar();
    }
    
    public static void bar(Papagallo p)
    {
        p1=new Papagallo("Luisa");
        p=new Papagallo("Arturo",true);
    }
    
    
    public static void main(String[] args)
    {
        Papagallo p2;
        
        p1=new Papagallo("Paco", !!!true);
        p2=new Papagallo("Pepe");
        foo(p2);
        System.out.format("%s#%b@",p1.getNombre(), p1.getVacunado());
        System.out.format("%s#%b@",p2.getNombre(), p2.getVacunado());
        bar(p2);
        System.out.format("%s#%b@",p1.getNombre(), p1.getVacunado());
        System.out.format("%s#%b@",p2.getNombre(), p2.getVacunado());
    }

}
