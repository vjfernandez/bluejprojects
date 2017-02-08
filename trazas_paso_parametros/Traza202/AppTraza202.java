
public class AppTraza202
{
   
    public static int[] foo(int[] bar)
    {
        int n=bar[0];
        bar[0]=bar[bar.length-1];
        bar[0]++;
        bar[bar.length-1]=n;
        return bar;
    }

    public static void main(String[] args)
    {
        int[] n={7,4,5};
        int[] k={n[0], n[1], n[0]+n[1], n.length};
        
        k=foo(n);
        
        System.out.format("%d#%d#%d", n[0], k[0], k.length);
        
    }
}
