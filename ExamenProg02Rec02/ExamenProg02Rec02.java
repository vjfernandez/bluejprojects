import java.util.*;

public class ExamenProg02Rec02
{
    /**
     * Solución al ejercicio utilizando compareTo para saber si ha pasado
     * el cumpleaños
     */
    public int edad(String fechaNac)
    {
        String[] partida=fechaNac.split("/");
        //la fecha de nacimiento separada en sus partes
        int d=Integer.parseInt(partida[0]);  //día de fechaNac
        int m=Integer.parseInt(partida[1])-1; //mes, en formato 0-11
        int a=Integer.parseInt(partida[2]); //anno de fechaNac
                
        GregorianCalendar hoy=new GregorianCalendar(); //la fecha de hoy
        int aHoy=hoy.get(Calendar.YEAR); //el anno actual
        GregorianCalendar cumple=new GregorianCalendar(aHoy,m,d);//El cumpleannos de la persona
        
        //para calcular los años, solo hay que restar los años
        int annos=aHoy-a;
        //pero si no ha pasado su cumpleaños
        if (cumple.compareTo(hoy)>=0)
           {
               annos--; //tiene un año menos
           }
        return annos;
    }


    public int edad2(String fechaNac)
    {
        String[] partida=fechaNac.split("/");
        //la fecha de nacimiento separada en sus partes
        int d=Integer.parseInt(partida[0]);  //día de fechaNac
        int m=Integer.parseInt(partida[1])-1; //mes, en formato 0-11
        int a=Integer.parseInt(partida[2]); //anno de fechaNac
        //la fecha de hoy, separada en sus partes
        GregorianCalendar hoy=new GregorianCalendar();
        int dHoy=hoy.get(Calendar.DAY_OF_MONTH);
        int mHoy=hoy.get(Calendar.MONTH);
        int aHoy=hoy.get(Calendar.YEAR);

        //para calcular los años, solo hay que restar los años
        int annos=aHoy-a;
        //pero si no ha pasado su cumpleaños
        if (m>mHoy  || (mHoy==m && d>dHoy))
           {
               annos--; //tiene uno menos
           }
        return annos;
    }
        
}
