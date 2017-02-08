import java.io.*;

public class AppPruebaMoto
{

    public void run() throws Exception
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       Moto miMoto=new Moto("1234HJK",35000);
       System.out.format("El número de kilómetros de la moto es %d\n",
           miMoto.getNumKilometros());

       
       
    }
    
    public static void main(String[] args) throws Exception
    {
        new AppPruebaMoto().run();
    }
}
