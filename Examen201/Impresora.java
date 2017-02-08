public class Impresora
{
    //Variables de instancia
    private String dniCliente;
    private String marcaYModelo;
    private boolean completado;
    private double horasTecnico;
    
    //Variables de clase
    private static double precioHoraTecnico;
    
    //inicializador estático
    static
    {
        precioHoraTecnico=17;
    }
     
    //constructor
    public Impresora(String dniCliente, String marcaYModelo)
    {
        this.dniCliente=dniCliente;
        this.marcaYModelo=marcaYModelo;
        completado=false;
        horasTecnico=0;
    }

    //accesores de instancia
    public void setDniCliente(String d)
    {
        dniCliente=d;
    }
    
    public String getDniCliente()
    {
        return dniCliente;
    }
    
    public void setMarcaYModelo(String mm)
    {
        marcaYModelo=mm;
    }
    
    public String getMarcaYModelo()
    {
        return marcaYModelo;
    }
    
    public void setCompletado(boolean c)
    {
        completado=c;
    }
    
    public boolean getCompletado()
    {
        return completado;
    }
    
    public void setHorasTecnico(double ht)
    {
        horasTecnico=ht;
    }
    
    public double getHorasTecnico()
    {
        return horasTecnico;
    }

    //accesores de clase
    public static void setPrecioHoraTecnico(double pht)
    {
        precioHoraTecnico=pht;
    }
    
    public static double getPrecioHoraTecnico()
    {
        return precioHoraTecnico;
    }
    
    //el método de cálculo    
    public double getImporte()
    {
        return completado?horasTecnico*precioHoraTecnico:0;
    }
}
