
import DataHora.Data;
import Pessoal.ChefeDeDepartamento;
import Pessoal.Funcionario;
import Pessoal.Pessoa;

/* Esta classe precisa das classes que estão nos pacotes DataHora e Pessoal */


/**
 * A classe DemoPessoal demonstra usos de instâncias das classes que fazem
 * parte do pacote Pessoal. Esta classe declara, inicializa e usa algumas instâncias
 * das classes Pessoa, Funcionario e ChefeDeDepartamento. A classe mostra também que 
 * campos declarados como protected não podem ser acessados diretamente de classes
 * não herdeiras.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.        
 */
class DemoPessoal {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias das classes Pessoa, Funcionario e ChefeDeDepartamento.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Pessoa
        Pessoa dawkins = new Pessoa("Richard Dawkins",
                8275123,
                new Data((byte) 20, (byte) 10, (short) 1943));
        // Criamos uma instância da classe Funcionario
        Funcionario payne = new Funcionario("Roger Payne",
                617653,
                new Data((byte) 12, (byte) 7, (short) 1933),
                new Data((byte) 17, (byte) 3, (short) 1956),
                8241.0f);
        // Criamos uma instância da classe ChefeDeDepartamento
        ChefeDeDepartamento lorenz = new ChefeDeDepartamento("Konrad Lorenz",
                981002,
                new Data((byte) 31, (byte) 1, (short) 1941),
                new Data((byte) 3, (byte) 1, (short) 1967),
                18200.0f,
                "Ciências do Comportamento",
                new Data((byte) 7, (byte) 3, (short) 1981));
        // Imprimimos as três instâncias.
        System.out.println(dawkins);
        System.out.println(payne);
        System.out.println(lorenz);

        // Tentamos acessar campos das classes, o que não é permitido pelo compilador.
//        System.out.println(dawkins.nome);
//        System.out.println(payne.salário);
//        System.out.println(lorenz.departamento);
    }
} // fim da classe DemoPessoal
