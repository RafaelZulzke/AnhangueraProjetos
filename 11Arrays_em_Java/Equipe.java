/** 
 * A classe Equipe demonstra o uso de um array de inst�ncias da classe 
 * Funcionario. O m�todo main desta classe declara e inicializa o array de inst�ncias.
 */
class Equipe
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo declara e inicializa o 
  * array de inst�ncias da classe Funcionario, demonstrando caracter�sticas e 
  * problemas potenciais de arrays de inst�ncias de classes.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Declaramos um array de funcion�rios com cinco posi��es
    Funcionario[] equipe = new Funcionario[5];
    // Temos agora cinco posi��es para armazenar inst�ncias da classe Funcionario no
    // array, mas as inst�ncias ainda n�o foram alocadas ! Devemos fazer isto
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
                                "Departamento de Cria��o",
                                new Data((byte)30,(byte)4,(short)1987));
    // Podemos imprimir diretamente os elementos do array pois s�o inst�ncias da classe
    // Funcionario, que cont�m o m�todo m�gico toString.
    System.out.println(equipe[0]);
    System.out.println(equipe[3]);
    System.out.println(equipe[4]); // imprimir� null !
    }

  } // fim da classe Equipe
