/**
 * A classe DemoArrayEsparsoDeDoubles demonstra o uso de uma inst�ncia da classe
 * ArrayEsparsoDeDoubles.
 */
class DemoArrayEsparsoDeDoubles
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
  * classe ArrayEsparsoDeDoubles e usa alguns de seus m�todos.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    ArrayEsparsoDeDoubles aed = new ArrayEsparsoDeDoubles(); // declaramos o array 
    aed.modifica(0,123.456);                // adicionamos alguns valores - notem que
    aed.modifica(123712L,Math.PI);          // o �ndice dos valores � do tipo long
    aed.modifica(9223372036854775807L,1.0);
    System.out.println(aed); // imprimimos chamando o m�todo toString 
    }

  } // fim da classe DemoArrayEsparsoDeDoubles
