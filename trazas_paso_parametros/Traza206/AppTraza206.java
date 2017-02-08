public class AppTraza206
{
    
    public void chan(String[] a)
    {
        String p;
        for (int i=0; i<a.length/2; i++)
        {
            p=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=p;
        }
    }
    
    public String[] chan2(String[] a)
    {
        String p;
        String[] r;
        int cuenta=0;

        for (int i=0; i<a.length; i++)
          {
              cuenta+=(a[i].indexOf('a')>=0)?1:0;
          }
        r=new String[cuenta];
        for (int i=a.length-1; i>=0; i--)
          {
              if (a[i].indexOf('a')>=0)
              {
                  r[r.length-cuenta]=a[i];
                  cuenta--;
              }
          }        
        return r;
    }

    public void run()
    {

        String[] bbb;
        String sss="mas vale pajaro en mano que ciento volando";
        

        bbb=chan2(sss.split(" "));
        for (int i=0; i<bbb.length; i++)
        {
            System.out.print (bbb[i]);
        }
    }
    
    public static void main(String[] args)
    {
        new AppTraza206().run();
    }
}
