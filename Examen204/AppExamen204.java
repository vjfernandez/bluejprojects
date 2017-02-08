public class AppExamen204
{
    public double sumaNumerosSeparadosPorComas(String s)
    {
        double suma=0;
        String[] trozos;
        
        trozos=s.split(",");
        for(int i=0; i<trozos.length;i++)
        {
            suma+=Double.parseDouble(trozos[i]);
        }
        
        return suma;
    }
}
