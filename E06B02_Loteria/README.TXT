------------------------------------------------------------------------
EJERCICIO E06B02

La resolución de éste ejercicio se simplifica mucho si nos detenemos
a pensar que se puede dividir en partes sencillas.
    -Debemos hacer 6 veces:
        -Escoger un número al azar entre 1 y 15
        -Comprobar si ya ha salido, y en cuyo caso, escogemos otro
        
Con lo que sabemos ahora mismo, la estructura de datos candidata a
mantener el estado del problema debe ser un array, de 6 enteros, que,
por supuesto, acompañaremos de un contador para saber por donde vamos, y 
utilizar el array como si fuera una lista.

Hacer algo 6 veces supone un bucle for.
Escoger un número y vover a hacerlo una segunda y una tercera vez 
  mientras el número escogido ya haya salido es claramente un bucle while.

Saber si un úmero ha salido es lógicamente, una búsqueda del número 
entre los anteriores.

Colocándolo todo junto y en orden sale el algoritmo sin esfuerzo
------------------------------------------------------------------------
