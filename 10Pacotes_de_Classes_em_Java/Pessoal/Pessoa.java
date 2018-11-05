/* Esta classe faz parte do pacote Pessoal */
package Pessoal;

/* Esta classe usa a classe Data, definida no pacote DataHora */
import DataHora.Data;

/** 
 * A classe Pessoa encapsula os dados de identificação de uma pessoa. Os campos
 * desta classe são declarados como protected, podendo ser utilizados diretamente em
 * classes herdeiras. A classe é declarada pública, para poder ser usada em outras
 * classes fora do pacote Pessoal.
 */
public class Pessoa // declaração da classe
  {
 // Declaração dos campos da classe 
 /**
  * Este campo contém o nome da pessoa
  */
  protected String nome;    
 /**
  * Este campo contém o número da identidade da pessoa
  */
  protected int identidade;  
 /**
  * Este campo contém a data de nascimento da pessoa
  */
  protected Data nascimento; 

 /**
  * O construtor da classe Pessoa, que recebe argumentos para inicializar seus campos.
  * @param n o nome da pessoa
  * @param i o número da identidade da pessoa
  * @param d a data de nascimento da pessoa
  */
  public Pessoa(String n,int i,Data d)
    {
    nome = n; identidade = i; nascimento = d;
    }

 /**
  * O método toString não recebe argumentos, e retorna uma string contendo os valores 
  * dos campos da classe formatados.
  * @return uma string com os valores dos campos formatados.
  */
  public String toString()
    {
    return "Nome: "+nome+"\nIdentidade: "+identidade+" "+
           "\nData de Nascimento: "+nascimento;
    }

  } // fim da classe Pessoa
