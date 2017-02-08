
/**
 * Clase abstracta que representa a un vehículo de nuestro ejercicio
 * 
 * @author Victor
 * @version 1.0
 */
public abstract class Vehiculo implements IImprimible
{
    
    private String matricula;
    private String descripcion;
    private int anno;
    private double precio;
    
    /**
     * Constructor para la clase que inicializa las propiedades
     */
    public Vehiculo(String matricula, String descripcion, int anno, double precio)
    {
        this.matricula=matricula;
        this.descripcion=descripcion;
        this.anno=anno;
        this.precio=precio;
    }
    
    /**
     * Constructor sin parámetros. Si hubiera alguna operación de inicialización independiente
     * de los parámetros la pondríamos aquí. 
     */
    public Vehiculo()
    {
    }
    
    
    /**
     * Devuelve la matrícula de un vehículo
     * @return la matrícula almacenada como propiedad del vehículo
     */
    public String getMatricula()
    {
        return this.matricula;
    }
    
    /**
     * Establece la matrícula de un vehículo
     * @param matricula la nueva matrícula
     */
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    
    /**
     * Devuelve la descripción de un vehículo. Probablemente también se utilice esta
     * propiedad para almacenar cosas como la marca y modelo de un vehículo
     * @return la descripción almacenada como propiedad del vehículo
     */    
    public String getDescripcion()
    {
        return this.descripcion;
    }

    /**
     * Establece la descripción de un vehículo. Probablemente también se utilice esta
     * propiedad para almacenar cosas como la marca y modelo de un vehículo
     * @param descripcion la nueva descripción del vehículo
     */
    
    public void setDescripcion(String descripcion)
    {
        this.descripcion=descripcion;
    }
    
     /**
     * Devuelve el año de fabricación de un vehículo
     * @return el año de fabricación 
     */ 
    public int getAnno()
    {
        return this.anno;
    }
    
    /**
     * Establece el anño de fabricación de un vehículo.
     * @param anno Un año, que será el que se almacene en el vehículo
     */    
    public void setAnno(int anno)
    {
        this.anno=anno;
    }
    
    /**
     * Devuelve el precio de un vehículo en el contexto de nuestro ejemplo
     * @return el precio almacenado como propiedad del vehículo
     */    
    public double getPrecio()
    {
        return this.precio;
    }
    
    /**
     * Establece el precio de un vehículo.
     * @param precio Un precio, expresado en unidades monetarias,
     * que será el que se almacene en el vehículo
     */   
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    
    /** 
     * Éste método lo voy a utilizar ayudar al método imprimir() de tal manera que  
     * que cada clase devuelva la cadena "MOTO" "QUAD", o "TURISMO" del método imprimir()
     * Como estamos en la clase Vehículo... y nunca va a haber instancias, no necesito programar
     * nada aquí... así que declararé el método abstracto.
     * Lo he puesto protegido porque:
     * <ol>
     * <li> No quiero que se utilice desde el exterior </li>
     * <li>Sí quiero que se herede y que se haga overriding</li>
     * </ol>
     * 
     * @return En las clases derivadas devolverá la cadena "MOTO", "QUAD" o "TURISMO",
     * según proceda
     */
    
    protected abstract String getTipoVehiculo();
    
    /**
     * Un método que devuelve una cadena con información acerca del vehículo, tal y como se describe en el
     * enunciado del ejercicio
     * Como ésta clase es abstracta, no se va a utilizar nunca éste método -porque es de instancia, y la 
     * clase vehículo no va a tener instancias... pero me va a servir de base para hacer una cadena de métodos con
     * overriding en el que cada uno aprovecha el heredado de la clase anterior.
     */
    public String imprimir()
    {
        String resultado;
        resultado=String.format("%s matricula:%s, descripcion:%s, año:%d, precio:%.2f",
             getTipoVehiculo(),
             getMatricula(),
             getDescripcion(),
             getAnno(),
             getPrecio()
             );
        return resultado;
    };
}
