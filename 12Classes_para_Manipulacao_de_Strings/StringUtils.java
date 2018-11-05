/**
 * A classe StringUtils cont�m alguns m�todos que processam strings que n�o
 * existem na classe String. Estes m�todos s�o implementados como m�todos est�ticos
 * e usam internamente m�todos da classe StringBuffer para implementar os algoritmos.
 */
class StringUtils
  {

 /**
  * O m�todo replace, que recebe como argumentos tr�s strings, e troca todas as 
  * ocorr�ncias da segunda string pela terceira na primeira string. Este m�todo
  * complementa o m�todo replace na classe String, mas em vez de substituir 
  * caracteres por caracteres substitui strings por strings.
  * @param original a string original que sofrer� as substitui��es
  * @param de a string que ser� procurada para substitui��es
  * @param para a string que substituir� a string passada como argumento "de".
  * @return uma string onde todas as ocorr�ncias de "de" foram trocadas por "para".
  */
  public static String replace(String original,String de,String para)
    {
    // Criamos uma inst�ncia de StringBuffer com capacidade inicial para o mesmo 
    // n�mero de caracteres da string original.
    StringBuffer resultado = new StringBuffer(original.length());
    // Para cada caractere na string original, vemos se ele � o in�cio da string 
    // "de". O la�o n�o percorrer� todos os caracteres da string original, deixando
    // de lado os que n�o poder�o ser iguais � string procurada por causa do tamanho
    // desta.
    for(int posi��o=0;posi��o<original.length()-de.length()+1;posi��o++)
      {
      // Comparamos a string que come�a nesta posi��o com a "de".
      if (de.equals(original.substring(posi��o,posi��o+de.length())))
        {
        // Se s�o iguais, juntamos a string "para" ao StringBuffer.
        resultado.append(para);
        // Precisamos evitar que os outros caracteres que foram substitu�dos sejam
        // analisados pelo la�o, pulando o seu processamento.
        posi��o = posi��o + de.length() - 1;
        }
      else // Se n�o, juntamos o caractere naquela posi��o.
        {
        resultado.append(original.charAt(posi��o));
        }
      }
    // Retornamos o resultado, convertido para uma inst�ncia da classe String.
    return resultado.toString();
    } // fim do m�todo replace

 /**
  * O m�todo ordena, que recebe como argumento uma string e retorna uma string
  * contendo os caracteres da primeira ordenados.
  * @param original a string original que ser� ordenada
  * @return uma string com os caracteres da string passada como argumento, ordenados.
  */
  public static String ordena(String original)
    {
    // Criamos uma inst�ncia de StringBuffer com capacidade inicial para o mesmo 
    // n�mero de caracteres da string original.
    StringBuffer resultado = new StringBuffer(original.length());
    // Para o algoritmo iniciar adequadamente, usamos o primeiro caractere da string
    // original para inicializar o StringBuffer.
    resultado.append(original.charAt(0));
    // Para cada caractere na string original (exceto o primeiro), vemos em que
    // posi��o ele deve ser inserido na string resultante.
    for(int posi��o=1;posi��o<original.length();posi��o++)
      {
      // Se o caractere naquela posi��o for menor ou igual ao primeiro caractere do
      // StringBuffer, inserimos o caractere no in�cio do StringBuffer.
      if (original.charAt(posi��o) <= resultado.charAt(0))
        resultado.insert(0,original.charAt(posi��o));
      // Se o caractere naquela posi��o for maior ou igual ao �ltimo caractere do
      // StringBuffer, inserimos o caractere no final do StringBuffer.
      else if (original.charAt(posi��o) >= resultado.charAt(resultado.length()-1))
        resultado.append(original.charAt(posi��o));
      // Se n�o for um dos extremos, temos que procurar, no StringBuffer, em que 
      // posi��o este caractere dever� ser inserido. Basta localizar o primeiro
      // caractere maior que este e inseri-lo antes.
      else 
        {
        for(int outraPosi��o=0;outraPosi��o<resultado.length();outraPosi��o++)
          {
          // Se achar um caractere no StringBuffer maior que o caractere sendo
          // procurado,
          if (resultado.charAt(outraPosi��o) > original.charAt(posi��o))
            {
            // Insere o caractere naquela posi��o e termina a busca.
            resultado.insert(outraPosi��o,original.charAt(posi��o));
            break;
            }
          } // terminou a procura da posi��o de inser��o
        } 
      } // terminou de analisar os caracteres da string original   
    // Retornamos o resultado, convertido para uma inst�ncia da classe String.
    return resultado.toString();
    } // fim do m�todo ordena

  } // fim da classe StringUtils
