
/**
 * Write a description of class AppEjercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppEjercicio3
{
 
 
   public String[] devolverEnOrden(String s1, String s2, String s3)
   {
       String[] s={s1, s2, s3};
       String sTemp;
       
       //1er intercambio s[1], s[2]
       if (s[1].compareTo(s[2])>0)
       {
           sTemp=s[1];
           s[1]=s[2];
           s[2]=sTemp;
       }
       //2º intercambio s[0], s[1]
       if (s[0].compareTo(s[1])>0)
       {
           sTemp=s[0];
           s[0]=s[1];
           s[1]=sTemp;
           //3er intercambio s[1], s[2], de nuevo, porque podría haber subido un
           //valor grande desde s[0] a s[1]
           if (s[1].compareTo(s[2])>0)
           {
               sTemp=s[1];
               s[1]=s[2];
               s[2]=sTemp;
           }
       }

       return s;
   }
}
