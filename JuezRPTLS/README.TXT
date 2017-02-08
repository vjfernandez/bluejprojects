------------------------------------------------------------------------
 * Una clase para juzgar una jugada de Roca, Papel, Tijeras, Lagarto, Spock.
 * 
 * Tiene un único método para juzgar una jugada. Como no tiene sentido instanciarla 
 * (porque no tiene estado), he decidido que dicho método sea privado.
------------------------------------------------------------------------

USER INSTRUCTIONS: Basta invocar al método estático quienGana(...) pasándole dos carácteres que
representen a las jugadas del jugador 1 y el jugador 2.

ej:
   int ganador=JuezRPTLS.quienGana('R','T');