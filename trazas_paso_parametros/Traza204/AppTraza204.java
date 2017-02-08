
/**
 * Traza 204
 */
public class AppTraza204
{
    int z;
    
    public AppTraza204()
    {
        z=4;
    }
    
    public int sm(int y)
    {
        return z + y;
    }
    
    public String sm(String x)
    {
        return x+z;
    }
    
    public void run()
    {
        String w="8";
        int v=8;
        System.out.print(sm(w+3)+sm(v+5));
    }
    
    public static void main(String[] args)
    {
        new AppTraza204().run();
    }
}
