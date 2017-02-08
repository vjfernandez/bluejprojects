import java.util.*;

/**
 * Una clase para juzgar una jugada de Roca, Papel, Tijeras, Lagarto, Spock.
 * 
 * Tiene un único método para juzgar una jugada. Como no tiene sentido instanciarla 
 * (porque no tiene estado), he decidido que dicho método sea privado.
 * 
 * He decido también, que voy a representar la forma en la que se gana mendiante un Map, que estará 
 * permamentemente accesible. Ese map va a ser una variable de clase, y lo voy a incializar en el
 * inicializador estático.
 * 
 * Para evitar que la clase se instancie por error (que no sería peligroso, pero no tendría sentido),
 * voy a colocar un constructor privado. Eso indica que no se puede instanciar. Marcar la clase como 'abstract'
 * hubiera tenido un efecto similar, pero 'abstract' tiene otras connotaciones: indica que es el inicio
 * de una jerarquía de herencia, y no es el caso.
 */

public class JuezRTPLS
{
    
    private static Map<Character, Set<Character>> ganadoras;


    static
    {
       /*la inicialización de la variable de instancia ganadoras es compleja.
         El inicilizador estático lo permite.
         La variable ganadoras se utiliza únicamente en el método quienGana, y podíamos haberla
         inicializado allí, pero entonces, estaríamos montando una construcción compleja y
         constante cada vez que se invocara el método.
         Haciéndolo aquí se iniciliza una única vez durante el arranque de la aplicación.
       */

       Set<Character> sc;  //referencia a un set de caracteres
       ganadoras=new HashMap<Character, Set<Character>>();
       /* ganadoras es un map, que contendrá las cinco jugadas: R, P, T, L o S como clave (key)
        * El valor (value) será un set de carácteres, con las jugadas a las que gana la de la clave.
        * Es decir, intento crear una asociación entre cada jugada, y las jugadas a las que gana.
        * R-->T, L
        * P-->R, S
        * T-->P, L
        * L-->P, S
        * S-->R, T
        */
      
       //a quién gana la roca
       sc=new HashSet<Character>();
       sc.add('T'); //tijeras
       sc.add('L'); //lagarto
       ganadoras.put('R', sc); //roca gana a tijeras y lagarto
       
       //a quién gana el papel
       sc=new HashSet<Character>();
       sc.add('R'); 
       sc.add('S'); 
       ganadoras.put('P', sc); 

       //a quién gana tijeras
       sc=new HashSet<Character>();
       sc.add('P'); 
       sc.add('L'); 
       ganadoras.put('T', sc); 

       //a quién gana lagarto
       sc=new HashSet<Character>();
       sc.add('P'); 
       sc.add('S'); 
       ganadoras.put('L', sc); 
       
       //a quién gana Spock
       sc=new HashSet<Character>();
       sc.add('R'); 
       sc.add('T'); 
       ganadoras.put('S', sc); 
       
    }
    
    /*
     * Con un constructor privado se evita la instanciación, sin marcar la clase como Abstract.
     */
    private JuezRTPLS()
    {
    }
    
    /**
     * Juzga una jugada de Roca, Papel, Tijeras, Lagarto, Spock, devolviendo del resultado
     * @param jugada1 Un carácter que representa a la jugada del primer jugador, y que puede ser 'R',
     *       'P', 'T', 'L' o 'S' en mayúsculas o minúsculas.
     * @param jugada2 Un carácter que representa a la jugada del segundo jugador, y que puede ser 'R',
     *       'P', 'T', 'L' o 'S' en mayúsculas o minúsculas.
     * @returns un 0 si han empatado, un 1 si gana la jugada del jugador 1 y un 2 si gana la jugada del
     *       jugador 2
     * @throws IllegalArgumentException Si el valor de jugada1 o jugada2 no es uno de los carácteres 
     *        válidos para representar a una jugada.
     */
    public static int quienGana(char jugada1, char jugada2)
    {
        char j1=Character.toUpperCase(jugada1);
        char j2=Character.toUpperCase(jugada2);
        
        if (!ganadoras.containsKey(j1) || !ganadoras.containsKey(j2))
           {
               throw new IllegalArgumentException("no se reconoce una jugada pasada como parámetro");
           }
        //si son iguales, empate y se devuelve 0.
        //si la jugada está en el map, buscando con j1 como clave, entonces gana j1
        //y si no, gana j2 (porque no hay más posibilidades)
        return (j1==j2)?0:ganadoras.get(j1).contains(j2)?1:2;
    }
    

}
