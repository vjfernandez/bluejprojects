import java.io.*;

/**
 * Esta es una clase con metodos utiles para pedir datos por teclado.
 * La idea es que la utilices para la interacci�n con el teclado.
 * Todos sus m�todos son est�ticos, as� que no hace falta instanciar.
 * Esta clase representa trabajo, no datos, y 
 * utiliza <em>la otra tendencia</em> que hemos comentado en clase para representar
 * trabajo: sus m�todos son est�ticos, y su estado interno es muy simple.
 * 
 * Tan solo hay que invocar cualquiera de sus miembros utilizando el operador de acceso a miembro
 * sobre la clase. <br>
 * Ej:<strong>EntradaTeclado.pitar();</strong>
 * 
 * (Nota: el modificador <em>abstract</em> que ves en la cabecera de la clase impide que se instancie)
 * @author Victor
 * @version 7/Feb/2013
 */

public class EntradaTeclado
{
    //Como �sta clase se dedicar� a comunicarse con el teclado, el famoso
    //BufferedReader in ser� su estado
    private static BufferedReader in;
    
    //Como esta clase no se instancia, in es variable de clase, y lo 
    //inicializo con el inicializador est�tico
    static
    {
        in=new BufferedReader(new InputStreamReader(System.in));
    }
    

    //Un constructor privado y vac�o impide que la clase se instancie
    private EntradaTeclado(){}

    
    /**
     * Emite un pitidito.
     */
    public static void pitar()
    {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }

    /**
     * Pide una cadena por teclado, con un mensaje cort�s.
     * 
     * @param msg El mensaje que se presenta al usuario
     * @returns La cadena que introduce el usuario por teclado
     */
    public static String pedirCadena(String msg) throws Exception
    {
        System.out.format("%s: ",msg);
        return in.readLine();
    }
    
    /**
     * Pide un entero por teclado, y se asegura de que est� entre un m�nimo y un m�ximo
     * dados como par�metro
     * 
     * @param msg El mensaje que se presenta al usuario
     * @param min El n�mero m�nimo que se admite (inclu�do)
     * @param max El n�mero m�ximo que se admite (inclu�do)
     * @returns el n�mero introducido por el usuario y ya validado
     */    
    public static int pedirEntero(String msg, int min, int max) throws Exception
    {   
        int n;
        boolean estaEnRango;
        do
        {
            n=Integer.parseInt(pedirCadena(String.format("%s [%d-%d]",msg,min,max)));
            estaEnRango=n>=min && n<=max;
            if (!estaEnRango)
            {
                System.out.println("    El n�mero no est� en el rango correcto");
                System.out.println("    Por favor, vuelva a introducirlo");
                pitar();
            }
        } while (!estaEnRango);
        return n;
    }

    /**
     * Pide un entero por teclado, y se asegura de que sea superior a un m�nimo
     * dado como par�metro. 
     * <br>
     * Observa que �ste m�todo est� <strong>SOBRECARGADO</strong>: hay otro m�todo con �ste nombre... 
     * porque <span style="color:green">realmente ambos piden enteros</span>.
     * <br>
     * Y, s�... si quieres, �stos comentarios de documentaci�n autom�tica admiten HTML 
     * 
     * @param msg El mensaje que se presenta al usuario
     * @param min El n�mero m�nimo que se admite (inclu�do)
     * @returns el n�mero introducido por el usuario y ya validado
     */    
    public static int pedirEntero(String msg, int min) throws Exception
    {   
        int n;
        boolean estaEnRango;
        do
        {
            n=Integer.parseInt(pedirCadena(String.format("%s [mayor o igual que %d]",msg,min)));
            estaEnRango=n>=min;
            if (!estaEnRango)
            {
                System.out.println("    El n�mero no est� en el rango correcto");
                System.out.println("    Por favor, vuelva a introducirlo");
                pitar();
            }
        } while (!estaEnRango);
        return n;
    }

    /**
     * Pide un double por teclado, y se asegura de que est� entre un m�nimo y un m�ximo
     * dados como par�metro
     * 
     * @param msg El mensaje que se presenta al usuario
     * @param min El n�mero m�nimo que se admite (inclu�do)
     * @param max El n�mero m�ximo que se admite (inclu�do)
     * @returns el n�mero introducido por el usuario y ya validado
     */    
    public static double pedirDouble(String msg, double min, double max) throws Exception
    {   
        double d;
        boolean estaEnRango;
        do
        {
            d=Double.parseDouble(pedirCadena(String.format("%s [%.2f-%.2f]",msg,min,max)));
            estaEnRango=d>=min && d<=max;
            if (!estaEnRango)
            {
                System.out.println("    El n�mero no est� en el rango correcto");
                System.out.println("    Por favor, vuelva a introducirlo");
                pitar();
            }
        } while (!estaEnRango);
        return d;
    }

    /**
     * Pide un double por teclado, y se asegura de que sea superior a un m�nimo
     * dado como par�metro. 
     * <br>
     * Observa que �ste m�todo est� <strong>SOBRECARGADO</strong>: hay otro m�todo con �ste nombre... 
     * porque <span style="color:green">realmente ambos piden doubles</span>.
     * <br>
     * Y, s�... si quieres, �stos comentarios de documentaci�n autom�tica admiten HTML 
     * 
     * @param msg El mensaje que se presenta al usuario
     * @param min El n�mero m�nimo que se admite (inclu�do)
     * @returns el n�mero introducido por el usuario y ya validado
     */    
    public static double pedirDouble(String msg, double min) throws Exception
    {   
        double d;
        boolean estaEnRango;
        do
        {
            d=Double.parseDouble(pedirCadena(String.format("%s [mayor o igual que %d]",msg,min)));
            estaEnRango=d>=min;
            if (!estaEnRango)
            {
                System.out.println("    El n�mero no est� en el rango correcto");
                System.out.println("    Por favor, vuelva a introducirlo");
                pitar();
            }
        } while (!estaEnRango);
        return d;
    }    
    
}
