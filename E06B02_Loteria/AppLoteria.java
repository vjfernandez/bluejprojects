
/**
 * El ejercicio de escoger seis n�meros al azar diferentes
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
    
    //----- Estado de la aplicaci�n
    int numero[]; //array para almacenar los n�meros que saco
    int numNumeros; //contador de los numeros que llevo
    
    /**
     * Escoge un numero al azar entre 1 y 15
     * @return El n�mero escogido
     */    
    public int escogeUnNumero()
    {
        return (int)(Math.random()*(MAX_NUMERO-MIN_NUMERO+1)+MIN_NUMERO);
    }

    /**
     * Comprueba si ya ha salido un n�mero.
     * 
     * @param  n El n�mero a comprobar
     * @return true si el n�mero ya ha salido, false en caso contrario.
     */
    public boolean haSalido(int n)
    {
        //lo planteamos como una b�squeda lineal, del n�mero n entre
        //los n�meros de la lista
        boolean encontrado=false; //una bandera para controlar el bucle
        int i=0; //un �ndice para moverse
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

        //escoger 6 n�meros: un for.
        for (int i=0; i<CANTIDAD_NUMEROS; i++)
        {
            //saco un n�mero, y si ha salido, lo descarto y cojo otro
            do
            {
                 nuevoNumero=escogeUnNumero();
            } while (haSalido(nuevoNumero));
            //en �sta l�nea ya s� que el n�mero guardado en nuevoNumero no ha
            //salido previamente. As� que lo guardo en el array
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
