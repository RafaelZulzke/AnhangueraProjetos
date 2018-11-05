/**
 * A classe DemoArrayEsparsoDeDoubles demonstra o uso de uma instância da classe
 * ArrayEsparsoDeDoubles.
 */
class DemoArrayEsparsoDeDoubles
  {
 /**
  * O método main permite a execução desta classe. Este método cria uma instância da
  * classe ArrayEsparsoDeDoubles e usa alguns de seus métodos.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    ArrayEsparsoDeDoubles aed = new ArrayEsparsoDeDoubles(); // declaramos o array 
    aed.modifica(0,123.456);                // adicionamos alguns valores - notem que
    aed.modifica(123712L,Math.PI);          // o índice dos valores é do tipo long
    aed.modifica(9223372036854775807L,1.0);
    System.out.println(aed); // imprimimos chamando o método toString 
    }

  } // fim da classe DemoArrayEsparsoDeDoubles
