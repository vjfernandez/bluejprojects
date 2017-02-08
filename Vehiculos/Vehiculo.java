
/**
 * Clase abstracta que representa a un veh�culo de nuestro ejercicio
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
     * Constructor sin par�metros. Si hubiera alguna operaci�n de inicializaci�n independiente
     * de los par�metros la pondr�amos aqu�. 
     */
    public Vehiculo()
    {
    }
    
    
    /**
     * Devuelve la matr�cula de un veh�culo
     * @return la matr�cula almacenada como propiedad del veh�culo
     */
    public String getMatricula()
    {
        return this.matricula;
    }
    
    /**
     * Establece la matr�cula de un veh�culo
     * @param matricula la nueva matr�cula
     */
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    
    /**
     * Devuelve la descripci�n de un veh�culo. Probablemente tambi�n se utilice esta
     * propiedad para almacenar cosas como la marca y modelo de un veh�culo
     * @return la descripci�n almacenada como propiedad del veh�culo
     */    
    public String getDescripcion()
    {
        return this.descripcion;
    }

    /**
     * Establece la descripci�n de un veh�culo. Probablemente tambi�n se utilice esta
     * propiedad para almacenar cosas como la marca y modelo de un veh�culo
     * @param descripcion la nueva descripci�n del veh�culo
     */
    
    public void setDescripcion(String descripcion)
    {
        this.descripcion=descripcion;
    }
    
     /**
     * Devuelve el a�o de fabricaci�n de un veh�culo
     * @return el a�o de fabricaci�n 
     */ 
    public int getAnno()
    {
        return this.anno;
    }
    
    /**
     * Establece el an�o de fabricaci�n de un veh�culo.
     * @param anno Un a�o, que ser� el que se almacene en el veh�culo
     */    
    public void setAnno(int anno)
    {
        this.anno=anno;
    }
    
    /**
     * Devuelve el precio de un veh�culo en el contexto de nuestro ejemplo
     * @return el precio almacenado como propiedad del veh�culo
     */    
    public double getPrecio()
    {
        return this.precio;
    }
    
    /**
     * Establece el precio de un veh�culo.
     * @param precio Un precio, expresado en unidades monetarias,
     * que ser� el que se almacene en el veh�culo
     */   
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    
    /** 
     * �ste m�todo lo voy a utilizar ayudar al m�todo imprimir() de tal manera que  
     * que cada clase devuelva la cadena "MOTO" "QUAD", o "TURISMO" del m�todo imprimir()
     * Como estamos en la clase Veh�culo... y nunca va a haber instancias, no necesito programar
     * nada aqu�... as� que declarar� el m�todo abstracto.
     * Lo he puesto protegido porque:
     * <ol>
     * <li> No quiero que se utilice desde el exterior </li>
     * <li>S� quiero que se herede y que se haga overriding</li>
     * </ol>
     * 
     * @return En las clases derivadas devolver� la cadena "MOTO", "QUAD" o "TURISMO",
     * seg�n proceda
     */
    
    protected abstract String getTipoVehiculo();
    
    /**
     * Un m�todo que devuelve una cadena con informaci�n acerca del veh�culo, tal y como se describe en el
     * enunciado del ejercicio
     * Como �sta clase es abstracta, no se va a utilizar nunca �ste m�todo -porque es de instancia, y la 
     * clase veh�culo no va a tener instancias... pero me va a servir de base para hacer una cadena de m�todos con
     * overriding en el que cada uno aprovecha el heredado de la clase anterior.
     */
    public String imprimir()
    {
        String resultado;
        resultado=String.format("%s matricula:%s, descripcion:%s, a�o:%d, precio:%.2f",
             getTipoVehiculo(),
             getMatricula(),
             getDescripcion(),
             getAnno(),
             getPrecio()
             );
        return resultado;
    };
}
