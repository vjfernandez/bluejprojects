import java.util.*;

public class Papagallo
{
    private String nombre;
    private boolean vacunado;
    
    public Papagallo(String nombre, boolean v)
    {
        this.nombre=nombre;
        vacunado=v;
    }
    
    public Papagallo(String nombre)
    {
        this.nombre=nombre;
        vacunado=false;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void vacunar()
    {
        vacunado=true;
    }
    
    public boolean getVacunado()
    {
        return vacunado;
    }

}
