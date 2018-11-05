/**
 * A classe StringUtils contém alguns métodos que processam strings que não
 * existem na classe String. Estes métodos são implementados como métodos estáticos
 * e usam internamente métodos da classe StringBuffer para implementar os algoritmos.
 */
class StringUtils
  {

 /**
  * O método replace, que recebe como argumentos três strings, e troca todas as 
  * ocorrências da segunda string pela terceira na primeira string. Este método
  * complementa o método replace na classe String, mas em vez de substituir 
  * caracteres por caracteres substitui strings por strings.
  * @param original a string original que sofrerá as substituições
  * @param de a string que será procurada para substituições
  * @param para a string que substituirá a string passada como argumento "de".
  * @return uma string onde todas as ocorrências de "de" foram trocadas por "para".
  */
  public static String replace(String original,String de,String para)
    {
    // Criamos uma instância de StringBuffer com capacidade inicial para o mesmo 
    // número de caracteres da string original.
    StringBuffer resultado = new StringBuffer(original.length());
    // Para cada caractere na string original, vemos se ele é o início da string 
    // "de". O laço não percorrerá todos os caracteres da string original, deixando
    // de lado os que não poderão ser iguais à string procurada por causa do tamanho
    // desta.
    for(int posição=0;posição<original.length()-de.length()+1;posição++)
      {
      // Comparamos a string que começa nesta posição com a "de".
      if (de.equals(original.substring(posição,posição+de.length())))
        {
        // Se são iguais, juntamos a string "para" ao StringBuffer.
        resultado.append(para);
        // Precisamos evitar que os outros caracteres que foram substituídos sejam
        // analisados pelo laço, pulando o seu processamento.
        posição = posição + de.length() - 1;
        }
      else // Se não, juntamos o caractere naquela posição.
        {
        resultado.append(original.charAt(posição));
        }
      }
    // Retornamos o resultado, convertido para uma instância da classe String.
    return resultado.toString();
    } // fim do método replace

 /**
  * O método ordena, que recebe como argumento uma string e retorna uma string
  * contendo os caracteres da primeira ordenados.
  * @param original a string original que será ordenada
  * @return uma string com os caracteres da string passada como argumento, ordenados.
  */
  public static String ordena(String original)
    {
    // Criamos uma instância de StringBuffer com capacidade inicial para o mesmo 
    // número de caracteres da string original.
    StringBuffer resultado = new StringBuffer(original.length());
    // Para o algoritmo iniciar adequadamente, usamos o primeiro caractere da string
    // original para inicializar o StringBuffer.
    resultado.append(original.charAt(0));
    // Para cada caractere na string original (exceto o primeiro), vemos em que
    // posição ele deve ser inserido na string resultante.
    for(int posição=1;posição<original.length();posição++)
      {
      // Se o caractere naquela posição for menor ou igual ao primeiro caractere do
      // StringBuffer, inserimos o caractere no início do StringBuffer.
      if (original.charAt(posição) <= resultado.charAt(0))
        resultado.insert(0,original.charAt(posição));
      // Se o caractere naquela posição for maior ou igual ao último caractere do
      // StringBuffer, inserimos o caractere no final do StringBuffer.
      else if (original.charAt(posição) >= resultado.charAt(resultado.length()-1))
        resultado.append(original.charAt(posição));
      // Se não for um dos extremos, temos que procurar, no StringBuffer, em que 
      // posição este caractere deverá ser inserido. Basta localizar o primeiro
      // caractere maior que este e inseri-lo antes.
      else 
        {
        for(int outraPosição=0;outraPosição<resultado.length();outraPosição++)
          {
          // Se achar um caractere no StringBuffer maior que o caractere sendo
          // procurado,
          if (resultado.charAt(outraPosição) > original.charAt(posição))
            {
            // Insere o caractere naquela posição e termina a busca.
            resultado.insert(outraPosição,original.charAt(posição));
            break;
            }
          } // terminou a procura da posição de inserção
        } 
      } // terminou de analisar os caracteres da string original   
    // Retornamos o resultado, convertido para uma instância da classe String.
    return resultado.toString();
    } // fim do método ordena

  } // fim da classe StringUtils
