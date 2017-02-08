/**
 * Otra solución, sacando los intercambios a un método aparte.
 */

public class AppEjercicio3b
{
   /**
   * Intercambia los elementos de las posiciones  p1 y p2 del array s
   * sólo si p2 debe ir lexicográficamente delante de p1.
   */
   private void intercambiar(String[] s, int p1, int p2)
   {
       String sTemp;
       if (s[p1].compareTo(s[p2])>0)
       {
           sTemp=s[p1];
           s[p1]=s[p2];
           s[p2]=sTemp;
       }
   }

   public String[] devolverEnOrden(String s1, String s2, String s3)
   {
       String[] s={s1, s2, s3};
       intercambiar(s,1,2);
       intercambiar(s,0,1);
       intercambiar(s,1,2);
       return s;
   }
}
