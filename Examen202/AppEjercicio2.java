public class AppEjercicio2
{

    public boolean esUnDigito(char c)
    {
        return c>='0' && c<='9';
    }
    
    public boolean contieneUnDigito(String s)
    {
        //busco un dígito
        boolean encontrado=false;
        int indice=0;
        while (!encontrado && indice<s.length())
        {
            if (esUnDigito(s.charAt(indice)))
            {
                encontrado=true;
            }
            else
            {
                indice++;
            }
        }
        return encontrado;
    }
    
    public int buscarDigito(String[] a)
    {
        //busco una cadena con un dígito
        boolean encontrado=false;
        int indice=0;
        while (!encontrado && indice<a.length)
        {
            if (contieneUnDigito(a[indice]))
            {
                encontrado=true;
            }
            else
            {
                indice++;
            }
        }
        return encontrado?indice:-1;
    }
       
}
