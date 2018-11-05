/**
 * A classe DemoMaquinaDeKaraoke demonstra o uso de uma instância da classe
 * MaquinaDeKaraoke.
 */
class DemoMaquinaDeKaraoke
  {
 /**
  * O método main permite a execução desta classe. Este método cria uma instância da
  * classe MaquinaDeKaraoke e faz uma simulação com esta instância.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    MaquinaDeKaraoke mk = new MaquinaDeKaraoke(); // criamos uma instância
    mk.adiciona("Hana"); // adicionamos algumas músicas
    mk.adiciona("Kitaguni no Haru");
    mk.adiciona("Shimauta");
    System.out.println(mk); // imprimimos a lista de músicas
    mk.adiciona("Kitaguni no Haru"); // oops, entramos de novo
    if (mk.remove("Kitaguni no Haru")) // vamos apagar esta música da lista
      System.out.println("Kitaguni no Haru removida !"); // sucesso
    mk.adiciona("Yousaku");
    System.out.println(mk); // imprimimos novamente a lista
    System.out.println(mk.procura("Shimauta")); // posição 2
    System.out.println(mk.procura("Matsuri")); // posição -1 (não encontrada)
    System.out.println(mk.procura("Kitaguni no Haru")); // posição 3 
    System.out.println(mk.procura("Aoi usagi")); // posição -1 (não encontrada)
    }  

  } // fim da classe DemoMaquinaDeKaraoke
