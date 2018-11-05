/** 
 * A classe DemoEstoqueDeLivraria demonstra o uso dos métodos da classe 
 * EstoqueDeLivraria. 
 */
class DemoEstoqueDeLivraria
  {
 /**
  * Declaração dos campos da classe
  */
  private static EstoqueDeLivraria estoque;

 /**
  * O método main permite a execução desta classe. Este método apresenta para um
  * usuário um pequeno menu que manipula as opções de uma instância da classe
  * EstoqueDeLivraria.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */ 
  public static void main(String[] argumentos)
    {
    // Criamos o estoque de livraria e adicionamos algumas instâncias de LivroDeLivraria
    estoque = new EstoqueDeLivraria();
    estoque.adicionaLivro(new LivroDeLivraria("Distributed Programming with Java",
                                              "Qusay H.Mahmoud",
                                              "1-884777-65-1",(short)10,
                                              32.00f,39.95f));
    estoque.adicionaLivro(new LivroDeLivraria("High-Performance Java Platform Computing",
                                              "Thomas W. Christopher, George K. Thiruvathukal",
                                              "0-13-016164-0",(short)8,
                                              41.00f,49.99f));
    estoque.adicionaLivro(new LivroDeLivraria("Programming and Deploying Java Mobile Agents "+
                                              "with Aglets",
                                              "Danny B. Lange, Mitsuru Oshima",
                                              "0-201-32582-9",(short)5,
                                              28.00f,37.95f));
    estoque.adicionaLivro(new LivroDeLivraria("Constructing Intelligent Agents with Java",
                                              "Joseph P. Bigus, Jennifer Bigus",
                                              "0-471-19135-3",(short)16,
                                              40.00f,44.99f));
    boolean continua=true;
    while(continua)
      {
      // Imprimimos o menu de opções
      System.out.println("Menu:");
      System.out.println("=====");
      System.out.println("1 - Consulta Estoque");
      System.out.println("2 - Vende Livro");
      System.out.println("3 - Compra Livro");
      System.out.println("9 - Mostra caixa");
      System.out.println("X - Sai da aplicação");
      System.out.print("Opção ==>");
      char opção = Keyboard.readChar(); // recebemos a opção do usuário
      switch(opção)
        {
        case '1': System.out.println(estoque); break; 
        case '2': estoque.vendeLivro(); break; 
        case '3': estoque.compraLivro(); break; 
        case '9': estoque.mostraCaixa(); break; 
        case 'x':
        case 'X': continua = false; break; 
        default:  System.out.println("Opção ["+opção+"] desconhecida !");
        }
      } // fim do laço que mostra o menu
    } // fim do método main

  } // fim da classe DemoEstoqueDeLivraria
