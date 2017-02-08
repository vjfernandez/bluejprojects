
/**
 * El ejercicio de escoger seis números al azar diferentes
 * 
 * @author Victor
 * @version 2013/Mar/01
 */

public class AppLoteria
{
    //algunas constantes
    static final int CANTIDAD_NUMEROS=6;
    static final int MIN_NUMERO=1;
    static final int MAX_NUMERO=15;
    
    //----- Estado de la aplicación
    int numero[]; //array para almacenar los números que saco
    int numNumeros; //contador de los numeros que llevo
    
    /**
     * Escoge un numero al azar entre 1 y 15
     * @return El número escogido
     */    
    public int escogeUnNumero()
    {
        return (int)(Math.random()*(MAX_NUMERO-MIN_NUMERO+1)+MIN_NUMERO);
    }

    /**
     * Comprueba si ya ha salido un número.
     * 
     * @param  n El número a comprobar
     * @return true si el número ya ha salido, false en caso contrario.
     */
    public boolean haSalido(int n)
    {
        //lo planteamos como una búsqueda lineal, del número n entre
        //los números de la lista
        boolean encontrado=false; //una bandera para controlar el bucle
        int i=0; //un índice para moverse
        while (!encontrado && i<numNumeros) //mientras no lo he encontrado y estoy en el rango
        {
            if (numero[i]==n)
            {
                encontrado=true;
            }
            else
            {
                i++;
            }
        }
        return encontrado;
    }
    
    /**
     * El programa principal
     */
    public void run()
    {
        int nuevoNumero;
        boolean yaLoTengo;
        numero=new int[CANTIDAD_NUMEROS];
        numNumeros=0;

        //escoger 6 números: un for.
        for (int i=0; i<CANTIDAD_NUMEROS; i++)
        {
            //saco un número, y si ha salido, lo descarto y cojo otro
            do
            {
                 nuevoNumero=escogeUnNumero();
            } while (haSalido(nuevoNumero));
            //en ésta línea ya sé que el número guardado en nuevoNumero no ha
            //salido previamente. Así que lo guardo en el array
            numero[numNumeros]=nuevoNumero;
            numNumeros++;
        }
        
        
        //Salida:imprimir el contenido del array:
        for (int i=0; i<CANTIDAD_NUMEROS-1; i++)
        {
            System.out.format("%d, ",numero[i]);
        }
        System.out.format("%d\n",numero[CANTIDAD_NUMEROS-1]);
    }

    public static void main(String[] args)
    {
        AppLoteria app=new AppLoteria();
        app.run();
    }
    
}
