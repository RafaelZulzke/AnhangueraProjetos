/* As seguintes linhas permitem o uso das classes de entrada e sa�da e de processamento
   de tokens */
import java.io.*;
import java.util.*;

/**
 * A classe <tt>Keyboard</tt> permite a leitura de dados de tipos nativos e de
 * inst�ncias da classe <tt>String</tt> a partir do teclado. Basicamente esta classe 
 * encapsula o funcionamento do Stream <tt>System.in</tt>, que pode ser usado como 
 * entrada padr�o de dados.
 * <p>                         
 * Esta classe � baseada na classe <tt>EasyIn</tt>, de Peter van der Linden. As
 * principais modifica��es foram:
 * <ul>
 * <li>Os m�todos s�o est�ticos para facilitar o uso da classe
 * <li>Cria��o de m�todos sobrecarregados para que valores <i>default</i> possam ser 
 *     usados
 * <li>Melhor tratamento das exce��es
 * <li>Reconhecimento de v�rios valores como booleanos e capacidade de leitura de 
 *     <tt>NaNs</tt> e infinitos para valores dos tipos <tt>float</tt> e 
 *     <tt>double</tt>
 * <li>Descri��o dos detalhes de implementa��o com coment�rios
 * </ul>                        
 * A classe permite o uso de arquivos de respostas (<i>"answer files"</i>), que s�o 
 * arquivos contendo os dados que deveriam ser entrados pelo teclado. A entrada destes 
 * dados pode ser simulada atrav�s de redirecionamento de arquivos. Se, por exemplo, 
 * tivermos uma aplica��o (classe) <tt>DemoDataKeyboard</tt> e quisermos usar um arquivo 
 * de respostas chamado <tt>dados.dat</tt> que j� cont�m os dados que devem ser 
 * digitados, podemos executar o comando <tt>java DemoDataKeyboard &lt; dados.dat </tt>
 * para ler os dados do arquivo em vez do teclado. O comando ser� o mesmo para 
 * os sistemas operacionais Windows e Linux.
 * <p>
 * O suporte a arquivos de respostas � limitado, somente funcionar� se todos os dados
 * a serem digitados forem entrados no arquivo de respostas, um em cada linha. 
 * Exce��es ocorrer�o caso estas regras n�o sejam seguidas.
 * <p>
 * A mensagem original de copyright de Peter van de Linden � mostrada ao final desta
 * listagem. Vale a pena notar que a sintaxe proposta e mostrada na mensagem � 
 * diferente da usada pela classe <tt>Keyboard</tt>.
 * <p>                   
 * O livro <b>"An Introduction to Computer Science Using Java"</b>, de Samuel N. Kamin,
 * M. Dennis Mickunas e Edward M. Reingold (editora McGraw-Hill, ISBN 0-07-034224-5)
 * tamb�m apresenta uma classe <tt>Keyboard</tt>, cujo funcionamento e c�digo s�o 
 * diferentes desta.
 *   
 * @author Rafael Santos
 * @version 1.2
 */
public class Keyboard
  {
 /**
  * Declara��o dos campos privados desta classe.
  */
  // O campo is � uma inst�ncia da classe InputStreamReader que ser� constru�da a 
  // partir do stream System.in. Note que j� que esta classe s� tem m�todos est�ticos,
  // n�o ter� construtor, mas podemos inicializar inst�ncias de classes da forma mostrada 
  // abaixo.
  private static InputStreamReader is = new InputStreamReader( System.in );
  // O campo br � uma inst�ncia da classe BufferedReader que usa 
  // is como argumento para seu construtor.
  private static BufferedReader br = new BufferedReader( is );
  // O campo st � uma inst�ncia da classe StringTokenizer que ser� 
  // usada em v�rios m�todos nesta classe.
  private static StringTokenizer st;
  // O campo nt � uma inst�ncia da classe String que ser� usada em 
  // v�rios m�todos nesta classe.
  private static String nt;
  // O campo debug estabelece se mensagens de erro de convers�o e leitura 
  // devem ser mostradas ou n�o. O campo n�o pode ser modificado diretamente, 
  // somente atrav�s de m�todos espec�ficos descritos abaixo.
  private static boolean debug = false;

 /**
  * O m�todo <tt>getToken</tt> l� uma string do <tt>BufferedReader</tt> associado com 
  * a entrada padr�o e retorna uma inst�ncia de <tt>StringTokenizer</tt> contendo os 
  * <i>tokens</i> criados a partir da linha lida. O m�todo � declarado como 
  * <tt>private</tt> pois s� dever� ser chamado a partir de outros m�todos da classe.
  * @return uma inst�ncia de <tt>StringTokenizer</tt> contendo os <i>tokens</i> 
  *         obtidos da linha lida
  * @exception IOException se um erro de entrada e sa�da ocorrer.
  * @exception NullPointerException se uma string vazia for lida e tentarmos construir
  *                                 uma inst�ncia de <tt>StringTokenizer</tt> com ela
  * @see java.util.StringTokenizer <tt>StringTokenizer</tt>
  */
  private static StringTokenizer getToken() throws IOException, NullPointerException 
    {
    String s = br.readLine();
    return new StringTokenizer(s);
    } // fim do m�todo getToken

 /**
  * O m�todo <tt>readBoolean</tt> l� e retorna um valor do tipo <tt>boolean</tt>. 
  * Este m�todo simplesmente chama o m�todo <tt>readBoolean</tt> com argumentos, 
  * descrito abaixo, considerando o valor <i>default</i> como sendo <tt>true</tt>.
  * @return o valor do tipo boolean lido (ou, em caso de erro de leitura, 
  *         <tt>true</tt>)
  */
  public static boolean readBoolean() 
    {
    return readBoolean(true);
    }

 /**
  * O m�todo <tt>readBoolean</tt> l� e retorna um valor do tipo <tt>boolean</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o compara
  *  com algumas strings constantes para verificar a igualdade, retornando <tt>true</tt> 
  * ou <tt>false</tt> dependendo do resultado da compara��o.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e decodificar
  *                     um valor booleano
  * @return o valor do tipo <tt>boolean</tt> lido (ou, em caso de erro de leitura, igual ao 
  *         argumento passado para o m�todo)
  */
  public static boolean readBoolean(boolean defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // Retorna true se a string for igual a...
      if (nt.equalsIgnoreCase("true") ||        // true
          nt.equalsIgnoreCase("t") ||           // t
          nt.equalsIgnoreCase("yes") ||         // yes
          nt.equalsIgnoreCase("y") ||           // y
          nt.equalsIgnoreCase("on") ||          // on
          nt.equalsIgnoreCase("v") ||           // v
          nt.equalsIgnoreCase("s") ||           // s
          nt.equalsIgnoreCase("sim") ||         // sim
          nt.equalsIgnoreCase("verdadeiro"))    // verdadeiro
          return true; 
      // Retorna false se a string for igual a...
      else if (nt.equalsIgnoreCase("false") ||  // false
               nt.equalsIgnoreCase("f") ||      // f
               nt.equalsIgnoreCase("no") ||     // no
               nt.equalsIgnoreCase("n") ||      // n
               nt.equalsIgnoreCase("off") ||    // off
               nt.equalsIgnoreCase("nao") ||    // nao
               nt.equalsIgnoreCase("n�o") ||    // n�o
               nt.equalsIgnoreCase("falso"))    // falso
          return false; 
      // Se n�o for nenhum dos valores reconhecidos, retorna o default
      else return defaultvalue;
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um boolean. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um boolean. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readBoolean

 /**
  * O m�todo <tt>readByte</tt> l� e retorna um valor do tipo <tt>byte</tt>. Este 
  * m�todo simplesmente chama o m�todo <tt>readByte</tt> com argumentos, descrito 
  * abaixo, considerando o valor <i>default</i> como sendo <tt>(byte)0</tt>.
  * @return o valor do tipo <tt>byte</tt> lido (ou, em caso de erro de leitura, 
  *         <tt>(byte)0</tt>)
  */
  public static byte readByte() 
    {
    return readByte((byte)0);
    } // fim do m�todo readByte

 /**
  * O m�todo <tt>readByte</tt> l� e retorna um valor do tipo <tt>byte</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o 
  * passa como argumento para o m�todo <tt>parseByte</tt> da classe <tt>Byte</tt>, 
  * que tenta convert�-lo. Se a leitura e convers�o puderem ser feitas, um valor
  * do tipo <tt>byte</tt> � retornado, caso contr�rio o valor <i>default</i> 
  * (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e 
  *                     decodificar um valor do tipo <tt>byte</tt>
  * @return o valor do tipo <tt>byte</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static byte readByte(byte defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // retorna o valor processado pela classe Byte
      return Byte.parseByte(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um byte. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um byte. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um byte. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readByte

 /**
  * O m�todo <tt>readShort</tt> l� e retorna um valor do tipo <tt>short</tt>. 
  * Este m�todo simplesmente chama o m�todo <tt>readShort</tt> com argumentos, 
  * descrito abaixo, considerando o valor <i>default</i> como sendo <tt>(short)0</tt>.
  * @return o valor do tipo <tt>short</tt> lido (ou, em caso de erro de leitura, 
  *         <tt>(short)0</tt>)
  */
  public static short readShort() 
    {
    return readShort((short)0);
    } // fim do m�todo readShort

 /**
  * O m�todo <tt>readShort</tt> l� e retorna um valor do tipo <tt>short</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o passa 
  * como argumento para o m�todo <tt>parseShort</tt> da classe <tt>Short</tt>, que 
  * tenta convert�-lo. Se a leitura e convers�o puderem ser feitas, um valor do tipo 
  * <tt>short</tt> � retornado, caso contr�rio o valor <i>default</i> (passado 
  * como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e 
  *                     decodificar um valor do tipo short
  * @return o valor do tipo <tt>short</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static short readShort(short defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // retorna o valor processado pela classe Short
      return Short.parseShort(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um short. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um short. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um short. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readShort

 /**
  * O m�todo <tt>readInt</tt> l� e retorna um valor do tipo <tt>int</tt>. Este
  * m�todo simplesmente chama o m�todo <tt>readInt</tt> com argumentos, descrito 
  * abaixo, considerando o valor <i>default</i> como sendo <tt>0</tt>.
  * @return o valor do tipo <tt>int</tt> lido (ou, em caso de erro de leitura,
  *         </tt>0</tt>)
  */
  public static int readInt() 
    {
    return readInt(0);
    } // fim do m�todo readInt

 /**
  * O m�todo <tt>readInt</tt> l� e retorna um valor do tipo <tt>int</tt>. Este
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o 
  * passa como argumento para o m�todo <tt>parseInt<tt> da classe <tt>Integer</tt>,
  * que tenta convert�-lo. Se a leitura e convers�o puderem ser feitas, um valor 
  * do tipo <tt>int</tt> � retornado, caso contr�rio o valor <i>default</i> 
  * (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e 
  *                     decodificar um valor do tipo <tt>int</tt>
  * @return o valor do tipo <tt>int</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static int readInt(int defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // retorna o valor processado pela classe Integer
      return Integer.parseInt(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um int. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um int. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um int. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readInt

 /**
  * O m�todo <tt>readLong</tt> l� e retorna um valor do tipo <tt>long</tt>. Este
  * m�todo simplesmente chama o m�todo <tt>readLong</tt> com argumentos, descrito
  * abaixo, considerando o valor <i>default</i> como sendo <tt>0l</tt>.
  * @return o valor do tipo <tt>long</tt> lido (ou, em caso de erro de leitura, 
  *         <tt>0l</tt>)
  */
  public static long readLong() 
    {
    return readLong(0l);
    } // fim do m�todo readLong

 /**
  * O m�todo <tt>readLong</tt> l� e retorna um valor do tipo <tt>long</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o 
  * passa como argumento para o m�todo <tt>parseLong</tt> da classe <tt>Long</tt>,
  * que tenta convert�-lo. Se a leitura e convers�o puderem ser feitas, um valor 
  * do tipo <tt>long</tt> � retornado, caso contr�rio o valor <i>default</i> 
  * (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e 
  *                     decodificar um valor do tipo <tt>long</tt>
  * @return o valor do tipo <tt>long</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static long readLong(long defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // retorna o valor processado pela classe Long
      return Long.parseLong(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um long. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um long. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um long. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readLong

 /**
  * O m�todo <tt>readFloat</tt> l� e retorna um valor do tipo <tt>float</tt>. Este 
  * m�todo simplesmente chama o m�todo <tt>readFloat</tt> com argumentos, descrito 
  * abaixo, considerando o valor <i>default</i> como sendo <tt>0f</tt>.
  * @return o valor do tipo <tt>float</tt> lido (ou, em caso de erro de leitura, 
  *         <tt>0f</tt>)
  */
  public static float readFloat() 
    {
    return readFloat(0f);
    } // fim do m�todo readFloat

 /**
  * O m�todo <tt>readFloat</tt> l� e retorna um valor do tipo <tt>float</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e o 
  * analisa, verificando se aparentemente � <tt>NaN</tt> ou infinito. Se n�o for, 
  * passa o valor lido como argumento para o m�todo <tt>parseFloat</tt> da classe 
  * <tt>Float</tt>, que tenta convert�-lo. Se a leitura e convers�o puderem ser 
  * feitas, um valor do tipo <tt>float</tt> � retornado, caso contr�rio o valor
  * <i>default</i> (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e decodificar
  *                     um valor do tipo <tt>float</tt>
  * @return o valor do tipo <tt>float</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static float readFloat(float defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // Verifica se o valor � aparentemente NaN ou infinito
      if (nt.toLowerCase().startsWith("nan")) return Float.NaN;
      else if (nt.toLowerCase().startsWith("inf")) return Float.POSITIVE_INFINITY;
      else if (nt.toLowerCase().startsWith("+inf")) return Float.POSITIVE_INFINITY;
      else if (nt.toLowerCase().startsWith("-inf")) return Float.NEGATIVE_INFINITY;
      // Retorna o valor processado pela classe Float
      else return Float.parseFloat(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um float. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um float. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um float. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readFloat

 /**
  * O m�todo <tt>readDouble</tt> l� e retorna um valor do tipo <tt>double</tt>. 
  * Este m�todo simplesmente chama o m�todo <tt>readDouble</tt> com argumentos, 
  * descrito abaixo, considerando o valor <i>default</i> como sendo <tt>0.0</tt>.
  * @return o valor do tipo <tt>double</tt> lido (ou, em caso de erro de leitura, 
  *         <tt>0.0</tt>)
  */
  public static double readDouble() 
    {
    return readDouble(0.0);
    } // fim do m�todo readDouble

 /**
  * O m�todo <tt>readDouble</tt> l� e retorna um valor do tipo <tt>double</tt>. Este
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o, 
  * analisando o valor para ver se � <tt>NaN</tt> ou infinito, e se n�o for, usa o 
  * valor como argumento para o m�todo <tt>parseDouble</tt> da classe <tt>Double</tt>,
  * que tenta convert�-lo. Se a leitura e convers�o puderem ser feitas, um valor 
  * do tipo <tt>double</tt> � retornado, caso contr�rio o valor <i>default</i> 
  * (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler e 
  *                     decodificar um valor do tipo <tt>double</tt>
  * @return o valor do tipo <tt>double</tt> lido (ou, em caso de erro de leitura, 
  *         igual ao argumento passado para o m�todo)
  */
  public static double readDouble(double defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // Verifica se o valor � aparentemente NaN ou infinito
      if (nt.toLowerCase().startsWith("nan")) return Double.NaN;
      else if (nt.toLowerCase().startsWith("inf")) return Double.POSITIVE_INFINITY;
      else if (nt.toLowerCase().startsWith("+inf")) return Double.POSITIVE_INFINITY;
      else if (nt.toLowerCase().startsWith("-inf")) return Double.NEGATIVE_INFINITY;
      // Retorna o valor processado pela classe Double
      return Double.parseDouble(nt);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um double. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NumberFormatException nfe) // se houver algum erro de convers�o
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de convers�o de "+nt+" para um double. "+
                           "Retorna "+defaultvalue);
      return defaultvalue;
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um double. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readDouble

 /**
  * O m�todo <tt>readChar</tt> l� e retorna um valor do tipo <tt>char</tt>. Este
  * m�todo simplesmente chama o m�todo <tt>readChar</tt> com argumentos, descrito
  * abaixo, considerando o valor <i>default</i> como sendo <tt>' '</tt> (espa�o).
  * @return o valor do tipo <tt>char</tt> lido (ou, em caso de erro de leitura, 
  *         espa�o)
  */
  public static char readChar() 
    {
    return readChar(' ');
    } // fim do m�todo readChar

 /**
  * O m�todo <tt>readChar</tt> l� e retorna um valor do tipo <tt>char</tt>. Este 
  * m�todo tenta pegar o pr�ximo <i>token</i> a ser lido da entrada padr�o e retorna
  * o primeiro caractere deste <i>token</i>, ignorando os outros. Se a leitura puder ser 
  * feita, um valor do tipo <tt>char</tt> � retornado, caso contr�rio o valor
  * <i>default</i> (passado como argumento) � retornado.
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler um valor do tipo
  *                     <tt>char</tt>
  * @return o valor do tipo <tt>char</tt> lido (ou, em caso de erro de leitura, igual ao 
  *         argumento passado para o m�todo)
  */
  public static char readChar(char defaultvalue) 
    {
    try 
      {
      st = getToken(); // pega os tokens a partir da linha lida
      nt = st.nextToken(); // e a primeira string do token.
      // retorna o primeiro caractere da string acima
      return nt.charAt(0);
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo um char. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    catch (NoSuchElementException nsee) // se n�o houver tokens
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Entrada n�o cont�m um char. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readChar

 /**
  * O m�todo <tt>readString</tt> l� e retorna uma inst�ncia da classe <tt>String</tt>.
  * Este m�todo simplesmente chama o m�todo <tt>readString</tt> com argumentos, descrito
  * abaixo, considerando o valor <i>default</i> como sendo <tt>""</tt> (string vazia).
  * @return o valor da string lida (ou, em caso de erro de leitura, uma string
  *         vazia)
  */
  public static String readString() 
    {
    return readString("");
    } // fim do m�todo readString

 /**
  * O m�todo <tt>readString</tt> l� e retorna uma inst�ncia da classe <tt>String</tt>. 
  * Este m�todo retorna uma linha inteira lida da entrada padr�o, sem process�-la como
  * <i>tokens</i>. Se a leitura puder ser feita, a string lida � retornada, caso 
  * contr�rio o valor <i>default</i> (passado como argumento) � retornado. O valor
  * <i>default</i> tamb�m � retornado no caso de uma string vazia. 
  * @param defaultvalue o valor <i>default</i> caso n�o seja poss�vel ler uma inst�ncia
  *                     da classe <tt>String</tt>
  * @return o valor da string lida (ou, em caso de erro de leitura, igual ao 
  *         argumento passado para o m�todo)
  */
  public static String readString(String defaultvalue) 
    {
    try 
      {
      nt = br.readLine(); // uma string lida diretamente 
      if (nt.trim().length() == 0) // nada foi entrado, ent�o
        return defaultvalue; // retorna o valor default
      else return nt; // retorna o que foi lido
      }
    catch (IOException ioe) // se houver algum erro de leitura
      {
      if (debug) // se for pedida a impress�o de mensagens de erro
        System.err.println("KEYBOARD:: Erro de entrada e sa�da lendo uma string. "+
                           "Retorna "+defaultvalue);
      return defaultvalue; // retorna o valor default
      }
    } // fim do m�todo readString

 /**
  * O m�todo <tt>debugOn</tt> modifica o campo que indica que mensagens de erro 
  * dever�o ser mostradas, fazendo com que sejam mostradas at� que o m�todo 
  * <tt>debugOff</tt> seja chamado.
  */
  public static void debugOn() 
    {
    debug = true;
    System.err.println("KEYBOARD:: Mostrando mensagens de erro e avisos...");
    } // fim do m�todo debugOn

 /**
  * O m�todo <tt>debugOff</tt> modifica o campo que indica que mensagens de erro 
  * dever�o ser mostradas, fazendo com que n�o sejam mostradas at� que o m�todo 
  * <tt>debugOn</tt> seja chamado.
  */
  public static void debugOff() 
    {
    debug = false;
    } // fim do m�todo debugOff

  } // fim da classe Keyboard

// Segue a mensagem original da classe EasyIn de Peter van der Linden

// Simple input from the keyboard for all primitive types. ver 1.0
// Copyright (c) Peter van der Linden,  May 5 1997.
//     corrected error message 11/21/97
//
// The creator of this software hereby gives you permission to:
//  1. copy the work without changing it
//  2. modify the work providing you send me a copy which I can
//     use in any way I want, including incorporating into this work.
//  3. distribute copies of the work to the public by sale, lease, 
//     rental, or lending
//  4. perform the work
//  5. display the work
//  6. fold the work into a funny hat and wear it on your head.
//
// This is not thread safe, not high performance, and doesn't tell EOF.
// It's intended for low-volume easy keyboard input.
// An example of use is:
//     EasyIn easy = new EasyIn();
//     int i = easy.readInt();   // reads an int from System.in
//     float f = easy.readFloat();   // reads a float from System.in
