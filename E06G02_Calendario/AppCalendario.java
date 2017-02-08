import java.io.*;

/**
 * La clase principal
 */
public class AppCalendario
{
   
    public static void main(String[] args) throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int mes, anno;
        boolean entradaValida;
        do
        {
            System.out.print("Dime un mes [1-12}: ");
            mes=Integer.parseInt(in.readLine());
            entradaValida=(mes>=1 && mes<=12);
            if (!entradaValida)
            {
                System.out.println("   ERROR: El mes debe estar entre 1 y 12");
            }
        } while (!entradaValida);
        System.out.print("Dime un año: ");
        anno=Integer.parseInt(in.readLine());
        System.out.println();
        System.out.println(Calendario.dibujarMes(mes, anno));
        
    }
}
