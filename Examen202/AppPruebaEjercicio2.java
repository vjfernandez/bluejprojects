
public class AppPruebaEjercicio2
{
    public static void main(String[] args)
    {
        AppEjercicio2 app=new AppEjercicio2();
        
        System.out.println(app.esUnDigito('a'));
        System.out.println(app.esUnDigito('7'));

        System.out.println(app.contieneUnDigito("Hola"));
        System.out.println(app.contieneUnDigito("free4all"));
        
        System.out.println(app.buscarDigito(new String[]{"Roma", "Paris", "Milan"}));
        System.out.println(app.buscarDigito(new String[]{"Fairy", "kh-7", "Mistol"}));        
    }
}
