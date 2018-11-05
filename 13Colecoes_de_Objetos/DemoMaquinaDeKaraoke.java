/**
 * A classe DemoMaquinaDeKaraoke demonstra o uso de uma inst�ncia da classe
 * MaquinaDeKaraoke.
 */
class DemoMaquinaDeKaraoke
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
  * classe MaquinaDeKaraoke e faz uma simula��o com esta inst�ncia.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    MaquinaDeKaraoke mk = new MaquinaDeKaraoke(); // criamos uma inst�ncia
    mk.adiciona("Hana"); // adicionamos algumas m�sicas
    mk.adiciona("Kitaguni no Haru");
    mk.adiciona("Shimauta");
    System.out.println(mk); // imprimimos a lista de m�sicas
    mk.adiciona("Kitaguni no Haru"); // oops, entramos de novo
    if (mk.remove("Kitaguni no Haru")) // vamos apagar esta m�sica da lista
      System.out.println("Kitaguni no Haru removida !"); // sucesso
    mk.adiciona("Yousaku");
    System.out.println(mk); // imprimimos novamente a lista
    System.out.println(mk.procura("Shimauta")); // posi��o 2
    System.out.println(mk.procura("Matsuri")); // posi��o -1 (n�o encontrada)
    System.out.println(mk.procura("Kitaguni no Haru")); // posi��o 3 
    System.out.println(mk.procura("Aoi usagi")); // posi��o -1 (n�o encontrada)
    }  

  } // fim da classe DemoMaquinaDeKaraoke
