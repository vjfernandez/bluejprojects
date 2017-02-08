public class Desafio20130301
{

  /**
   * Procesa el array pasado como parámetro, de tal manera que devuelve otro array que
   * contiene los mismos números, pero excluyendo los negativos y en orden inverso...<br>
   * Por ejemplo, si se le pasa {4,-7, 12, -4, 9} devolverá {9, 12, 4}
   * @param n el array de entrada
   * @return un array que contiene los no negativos de n, pero en orden inverso 
   * a como estaban en n
   */
  public int[] invertirTirandoLosNegativos(int[] n)
  {
      int[] r; //resultado
      int cantidad=0; //contador de números no negativos
      int indiceResultado=0; //un índice para rellenar el resultado
      
      //contar numeros no negativos
      for(int i=0;i<n.length;i++)
      {
          if (n[i]>=0)
          {
              cantidad++;
          }
      }

      //reservar memoria para el resultado
      r=new int[cantidad];

      //recorrer el parámetro y rellenar resultado
      for(int i =n.length-1;i>=0; i--)     
      {
          if(n[i]>=0)
          {
              r[indiceResultado]=n[i];
              indiceResultado++;
          }
      }
      
      return r; 
  }
     
}

