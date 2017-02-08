public class ExamenProg02Rec01
{
   public String obtenerElPrimero(String[] a)
   {
       String resultado;
       //compruebo condiciones de error
       if (a==null)
       {
           return null;
       }
       if (a.length==0)
       {
           return "";
       }
       //empieza el algoritmo
       resultado=a[0]; //supongo que el de la posición 0 es el primero
       for (int i=1;i<a.length;i++) //recorro los siguientes
       {
           if (a[i].compareTo(resultado)<0) //Si encuentro otro menor
           {
               resultado=a[i]; //me lo apunto
           }
       }
       return resultado;
   }
   
}
