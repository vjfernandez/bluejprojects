
public class ExamenProg02Rec04
{

    public String eliminaDuplicadosSeguidos(String s)
    {
        String resultado="";
        char c;
        if (s.length()>0) //si s no está vacía
          {
             resultado+=s.charAt(0); //copiamos el primer carácter
          }
        for (int i=1; i<s.length(); i++) //revisamos del segundo en adelante
        {
            c=s.charAt(i);
            if (resultado.charAt(resultado.length()-1)!=c) //Si no está repe al final de resultado
               {
                   resultado+=c; //lo concatenamos
               }

        }
        return resultado;
        
    }
}
