public class ExamenProg02Rec03
{


    /**
     * Obtiene el grupo fonético de un carácter
     * 
     * @param c el caracter de entrada
     * @returns el grupo fonético entre "1" y "6" o "" si no se encontró
     */
    public String obtenerGrupo(char c)
    {
        //Es una simple búsqueda lineal. Utilizo arrays paralelos para
        //obtener el grupo, aunque no es estrictamente necesario
        String[] letrasGrupo={"BFPV", "CGJKQSXZ", "DT", "L", "MN", "R"};
        String[] nombreGrupo={"1"   , "2"       , "3" , "4", "5" , "6"};
        int i=0;
        boolean encontrado=false;
        while (!encontrado && i<letrasGrupo.length)
        {
            if (letrasGrupo[i].indexOf(c)>=0)
            {
                encontrado=true;
            }
            else
            {
                i++;
            }
        }
        return encontrado?nombreGrupo[i]:"";
    }
    
    
    public String fonetico(String s)
    {
        String ms=s.toUpperCase();
        String resultado=""+ms.charAt(0);
        int grupo;
        boolean encontrado;
        //recorro la cadena
        for (int i=1;i<ms.length();i++)
           {
               resultado+=obtenerGrupo(ms.charAt(i));
           }
        
        return resultado;
    }
}
