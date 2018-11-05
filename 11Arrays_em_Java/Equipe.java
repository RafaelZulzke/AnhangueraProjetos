/** 
 * A classe Equipe demonstra o uso de um array de instâncias da classe 
 * Funcionario. O método main desta classe declara e inicializa o array de instâncias.
 */
class Equipe
  {
 /**
  * O método main permite a execução desta classe. Este método declara e inicializa o 
  * array de instâncias da classe Funcionario, demonstrando características e 
  * problemas potenciais de arrays de instâncias de classes.
  * @param argumentos os argumentos que podem ser passados para o método via linha 
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Declaramos um array de funcionários com cinco posições
    Funcionario[] equipe = new Funcionario[5];
    // Temos agora cinco posições para armazenar instâncias da classe Funcionario no
    // array, mas as instâncias ainda não foram alocadas ! Devemos fazer isto
    // manualmente para cada elemento do array.
    equipe[0] = new Funcionario("Alan Moore",234924,
                                new Data((byte)12,(byte)10,(short)1955),
                                new Data((byte)22,(byte)3,(short)1978),
                                12500f);
    equipe[1] = new Funcionario("Charles Vess",987120,
                                new Data((byte)8,(byte)9,(short)1932),
                                new Data((byte)5,(byte)1,(short)1943),
                                43320f);
    equipe[2] = new Funcionario("Dave McKean",876451,
                                new Data((byte)27,(byte)12,(short)1940),
                                new Data((byte)17,(byte)11,(short)1968),
                                38200f);
    equipe[3] = new ChefeDeDepartamento("Neil Gaiman",769721,
                                new Data((byte)15,(byte)9,(short)1959),
                                new Data((byte)18,(byte)8,(short)1980),
                                41000f,
                                "Departamento de Criação",
                                new Data((byte)30,(byte)4,(short)1987));
    // Podemos imprimir diretamente os elementos do array pois são instâncias da classe
    // Funcionario, que contêm o método mágico toString.
    System.out.println(equipe[0]);
    System.out.println(equipe[3]);
    System.out.println(equipe[4]); // imprimirá null !
    }

  } // fim da classe Equipe
