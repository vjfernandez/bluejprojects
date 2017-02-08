
public class Moto
{
 
    private String matricula;
    private int numKilometros;
    private double dineroFacturado;
    
    private static double precioPorKilometro;
    
    public Moto(String matr, int nk)
    {
        matricula=matr;
        numKilometros=nk;
        dineroFacturado=0;
    }
    
    static
    {
        precioPorKilometro=2.5;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public void setNumKilometros(int numKilometros)
    {
        this.numKilometros=numKilometros;
    }
    
    public int getNumKilometros()
    {
        return numKilometros;
    }
    
    public double getDineroFacturado()
    {
        return dineroFacturado;
    }
    
    public int kmQueFaltanHastaRevision()
    {
        return 10000-(numKilometros%10000);
    }
    
    public static void setPrecioPorKilometro(double d)
    {
        precioPorKilometro=d;
    }
    
    public static double getPrecioPorKilometro()
    {
        return precioPorKilometro;
    }
    
    public void repartir(int kmDestino)
    {
        numKilometros+=kmDestino;
        dineroFacturado+=precioPorKilometro*kmDestino;
    }
    
    public void repartir(int kmRemitente, int kmDestino)
    {
        repartir(kmRemitente+kmDestino);
    }
}
