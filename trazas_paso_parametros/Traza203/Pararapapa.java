import java.util.*;

public class Pararapapa
{
    private String nombre;
    private boolean furruntumado;
    
    public Pararapapa(String nombre, boolean v)
    {
        this.nombre=nombre;
        furruntumado=v;
    }
    
    public Pararapapa(String nombre)
    {
        this.nombre=nombre;
        furruntumado=false;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void furruntumar()
    {
        furruntumado=true;
    }
    
    public boolean getFurruntumado()
    {
        return furruntumado;
    }

}
