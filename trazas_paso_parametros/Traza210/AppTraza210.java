
/**
 * Write a description of class AppTraza210 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppTraza210
{

    public void m1(int[] k)
    {
        k=new int[2];
        k[0]=5;
    }

    public void m2(int[] k)
    {
        k[0]=6;
    }    
    
    public int[] m3()
    {
        int[] k={7};
        return k;
    }
    
    public void run()
    {
        int[] a1={1}, a2={2}, a3={3};
        m1(a1);
        m2(a2);
        a3=m3();
        System.out.format("%d %d %d",a1[0], a2[0], a3[0]);
    }
    
    public static void main(String[] args)
    {
        new AppTraza210().run();
    }
  
}
