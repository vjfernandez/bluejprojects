import java.text.*;
import java.util.*;
import java.io.*;

/**
   Una clase para resolver el ejercicio de GregorianCalendar en el que se pide
   dibujar un calendario de un mes en una cadena.
 */

public class Calendario
{

    //cada día tendrá 3 huecos, pero se puede cambiar
    private static final int TAB_DIA=3;      
    
    //La abreviatura de los días de la semana
    private static String[] letraDiaSemana={"L", "M", "X", "J", "V", "S", "D"};

    /**
     * Devuelve una cadena, en la que hay un mes de un año,
     * formateado como indica el ejercicio.<br>
     * 
     * No hay control de errores. Si los parámetros no son correctos, la salida es indefinida.
     * 
     * @param mes El número del mes. Entre 1 (enero) y 12 (diciembre)
     * @param anno El número del año.
     */
    public static String dibujarMes(int mes, int anno) 
    {
        //Un StringBuffer para ir guardando el resultado
        StringBuffer resul=new StringBuffer();
        
        //El primer día del mes, que luego iremos haciendo avanzar con .roll()
        GregorianCalendar fecha=new GregorianCalendar(anno, mes-1, 1);
        
        //El nombre del mes lo puedo sacar del sistema... ¿Cómo?.... He buscado por Internet y 
        //he encontrado un foro en el que hablaban de la clase SimpleDateFormat, aunque podía haber utilizado un array
        //propio y haber escrito los nombres de los meses en él.
        String nombreMes=new SimpleDateFormat("MMMMM").format(fecha.getTime()).toUpperCase();

        //Una variable auxiliar, para calcular los espacios que habrá antes del día 1
        int espacios;
        
        //EMPEZAMOS
        //la cabecera con el nombre del mes y del día
        resul.append(String.format("%s %d\n",nombreMes, anno));
        
        //la raya de guiones. 7 días multiplicado por el tamaño que ocupa un día
        for (int i=1; i<=7*TAB_DIA; i++)
        {
            resul.append("-");
        }
        resul.append("\n");

        //las letras de los días de la semana
        for (int i=0; i<7; i++)
        {
            resul.append(String.format("%"+TAB_DIA+"s",letraDiaSemana[i]));
        }
        resul.append("\n");
        
        //los espacios antes del uno.
        //Consultado el API de GregorianCalendar, DAY_OF_WEEK devuelve un valor entre
        //Calendar.SUNDAY (un 1)  y Calendar.SATURDAY (un 7)
        //que no te sorprenda la fórmula. Es la misma que usaste en el primer ejercicio de arrays
        espacios=((fecha.get(Calendar.DAY_OF_WEEK)-2+7)%7)*TAB_DIA;
        for (int i=1; i<=espacios; i++)
        {
            resul.append(" ");
        }

        //los días del mes
        do
        {
            resul.append(String.format("%"+TAB_DIA+"d",fecha.get(Calendar.DAY_OF_MONTH)));
            //cambio de línea tras el domingo
            if (fecha.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
            {
               resul.append("\n");
            } 
            //paso al día siguiente
            fecha.roll(Calendar.DATE,true);

            //me mantengo en el bucle mientras no cambie de mes.
        } while (fecha.get(Calendar.DAY_OF_MONTH)!=1);
        
        //Si no hay un cambio de línea al final, lo pongo.
        if (resul.charAt(resul.length()-1)!='\n')
        {
            resul.append("\n");
        }
        return resul.toString();
    }
    
}
