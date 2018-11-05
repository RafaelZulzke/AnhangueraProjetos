
/** 
 * A classe RegistroAcademicoSimples cont�m somente alguns campos que exemplificam 
 * as declara��es de campos e tipos de dados em Java. Esta classe depende da classe 
 * Data para ser compilada com sucesso.
 */
class RegistroAcademicoSimples // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    String nomeDoAluno; // uma cadeia de caracteres para representar um nome
    int n�meroDeMatr�cula; // pode representar n�meros com at� 9 d�gitos !
    Data dataDeNascimento = new Data(); // uma refer�ncia a uma inst�ncia da classe Data
    boolean �Bolsista;  // valor simples: sim ou n�o (true ou false)
    short anoDeMatr�cula; // um short basta para representar anos
  /* Se houvesse m�todos para esta classe, eles seriam declarados aqui dentro. */
} // fim da classe RegistroAcademicoSimples
