
/** 
 * A classe RegistroAcademicoSimples contém somente alguns campos que exemplificam 
 * as declarações de campos e tipos de dados em Java. Esta classe depende da classe 
 * Data para ser compilada com sucesso.
 */
class RegistroAcademicoSimples // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    String nomeDoAluno; // uma cadeia de caracteres para representar um nome
    int númeroDeMatrícula; // pode representar números com até 9 dígitos !
    Data dataDeNascimento = new Data(); // uma referência a uma instância da classe Data
    boolean éBolsista;  // valor simples: sim ou não (true ou false)
    short anoDeMatrícula; // um short basta para representar anos
  /* Se houvesse métodos para esta classe, eles seriam declarados aqui dentro. */
} // fim da classe RegistroAcademicoSimples
