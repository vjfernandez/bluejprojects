
/**
 * Un tipo de vehículo, que añade una nueva propiedad con sus getters y sus setters
 * 
 * @author Víctor
 * @version 1.0
 */
public class Moto extends Vehiculo
{

    private int cilindrada;

    
    /**
     * Constructor para la clase que inicializa las propiedades, y que llama en cadena al constructor de la clase antecesora
     */
    public Moto(String matricula, String descripcion, int anno, double precio, int cilindrada)
    {
        super(matricula, descripcion, anno, precio);
        this.cilindrada=cilindrada;
    }
    
    /**
     * Constructor sin parámetros para la clase Moto
     */
    public Moto()
    {
    }
    
    
    /**
     * Devuelve la cilindrada de una moto
     * @return la cilindrada de una moto en centímetros cúbicos
     */ 
    public int getCilindrada()
    {
        return this.cilindrada;
    }
    
    /**
     * Establece la cilindrada de una moto.
     * @param cilindrada La cilindrada, que será la que se almacene en el vehículo
     */    
    public void setCilindrada(int cilindrada)
    {
        this.cilindrada=cilindrada;
    }
    
    /**
     * Vamos a hacer overriding del método getTipoVehiculo() para que conteste
     * correctamente, dado que ésta clase no es abstracta
     * @return "MOTO"... tal cual
     */
    
    protected String getTipoVehiculo()
    {
        return "MOTO";
    }

    /** 
     * Ahora vamos a reescribir el método imprimir() recibido de la clase Vehículo, pero
     * vamos a aprovechar lo recibido, mediante la palabra reservada super.
     */
    public String imprimir()
    {
        String resultado;
        resultado=String.format("%s, cilindrada:%d",
            super.imprimir(), //el método recibido
            getCilindrada() //la propiedad particular de la moto
            );
        return resultado;
    }

}
