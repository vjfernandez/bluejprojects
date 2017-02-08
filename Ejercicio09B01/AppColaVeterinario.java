
/**
 * La aplicación de la cola del veterinario.
 * Esta clase representa a las acciones de la capa de PRESENTACIÓN:
 * 
 * Es decir, se dedica exclusivalemte a comunicarse con el usuario.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppColaVeterinario
{
    // 
    private LogicaColaVeterinario logica;

    /**
     * Constructor.
     * Inicializa variables de instancia.
     * Crea la instancia de la clase que maneja la lógica
     * La cola no está en ésta clase. Ésta clase solo sirve para comunicarse con el usuario.
     */
    public AppColaVeterinario()
    {
        logica=new LogicaColaVeterinario();
    }


    /**
     * Resuelve el caso de uso 1.
     * Sustituye éste comentario cutre por algo coherente.
     */
    public void menuAnotarCita() throws Exception
    {
        //POR-HACER: Borra el contenido de éste método y sustituyelo
        //por código adecuado para resolver el caso de uso
        //Recuerda que debes apoyarte en el objeto de la lógica, y que puedes
        //utilizar los objetos de datos (en este caso, de la clase Animal)
        System.out.println("POR HACER");
        EntradaTeclado.pitar();
    }

    /**
     * Resuelve el caso de uso 2
     * Sustituye éste comentario cutre por algo coherente.
     */
    public void menuLlamarPaciente() throws Exception
    {
        //POR-HACER: Borra el contenido de éste método y sustituyelo
        //por código adecuado para resolver el caso de uso
        //Recuerda que debes apoyarte en el objeto de la lógica, y que puedes
        //utilizar los objetos de datos (en este caso, de la clase Animal)
        System.out.println("POR HACER");
        EntradaTeclado.pitar();
    }
    

  
    /**
     * Presenta el menú principal por consola, y espera del usuario una opción válida,
     * que será un número del 0 al 2.<br>
     * Se valida la entrada, de tal manera que éste método nunca devuelve una opción incorrecta
     *
     * @returns La opción escogida por el usuario, un número del 0 al 2
     */
    public int presentarMenuYObtenerOpcion() throws Exception
    {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println(" MENU PRINCIPAL ");
        System.out.println(" Aplicacion pacientes de veterinario");
        System.out.println("-------------------------------------");
        System.out.println("1.- Anotar cita");
        System.out.println("2.- Llamar al paciente siguiente");

        System.out.println("0.- Salir");
        return EntradaTeclado.pedirEntero("  ==> Opcion", 0, 2);
    }
    
    /**
     * El método principal. Contiene el bucle del menú.
     */
    public void run() throws Exception
    {
        int opcion;
        do
        {
            //cabecera();
            opcion=presentarMenuYObtenerOpcion();
            switch (opcion)
            {
                case 1:
                   menuAnotarCita();
                   break;
                case 2:
                   menuLlamarPaciente();
                   break;

            }// fin switch
        } while (opcion!=0);
        System.out.println("\n\nAdiós");
    }
    

    /**
     * El método main se utiliza como <em>bootstrapping</em> para poner en marcha
     * la aplicación
     */
    public static void main(String[] args) throws Exception
    {
        new AppColaVeterinario().run();
    }
}
