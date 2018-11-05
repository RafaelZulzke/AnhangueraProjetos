/**
 * A classe DemoCasamentoDePadroes mostra exemplos de uso da classe 
 * CasamentoDePadroes. 
 */
class DemoCasamentoDePadroes // declaração da classe 
  {
 /**
  * O método main permite a execução desta classe. Este método contém a declaração
  * de duas instâncias da classe CasamentoDePadroes, e as usa para verificar se 
  * algumas strings casam com aqueles padrões.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] args)
    {
    CasamentoDePadroes datas = 
      new CasamentoDePadroes("1{1|2|3|4|5} de {janeiro|fevereiro|março} de 200{1|2}");
    System.out.println(datas.casa("15 de fevereiro de 2001")); // true 
    System.out.println(datas.casa("11 de março de 2002"));     // true
    System.out.println(datas.casa("31 de janeiro de 2003"));   // false
    CasamentoDePadroes horas = new CasamentoDePadroes("{00|04|08|12|16|20}:00:00");
    System.out.println(horas.casa("12:00:00"));         // true 
    System.out.println(horas.casa("12:00:01"));         // false
    System.out.println(horas.casa("12:00"));            // false
    System.out.println(horas.casa("12:00:00 de hoje")); // false
    System.out.println(horas.casa("às 12:00:00"));      // false
    } // fim do método main

  } // fim da classe DemoCasamentoDePadroes
