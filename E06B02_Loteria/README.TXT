------------------------------------------------------------------------
EJERCICIO E06B02

La resoluci�n de �ste ejercicio se simplifica mucho si nos detenemos
a pensar que se puede dividir en partes sencillas.
    -Debemos hacer 6 veces:
        -Escoger un n�mero al azar entre 1 y 15
        -Comprobar si ya ha salido, y en cuyo caso, escogemos otro
        
Con lo que sabemos ahora mismo, la estructura de datos candidata a
mantener el estado del problema debe ser un array, de 6 enteros, que,
por supuesto, acompa�aremos de un contador para saber por donde vamos, y 
utilizar el array como si fuera una lista.

Hacer algo 6 veces supone un bucle for.
Escoger un n�mero y vover a hacerlo una segunda y una tercera vez 
  mientras el n�mero escogido ya haya salido es claramente un bucle while.

Saber si un �mero ha salido es l�gicamente, una b�squeda del n�mero 
entre los anteriores.

Coloc�ndolo todo junto y en orden sale el algoritmo sin esfuerzo
------------------------------------------------------------------------
