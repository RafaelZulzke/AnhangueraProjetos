package modelo.implementacao;

import modelo.Pessoa;
import modelo.Veiculo;

public class ModeloFabrica {

    public Pessoa getPessoa() {
        return new PessoaImplementacao();
    }

    public Veiculo getVeiculo() {
        return new VeiculoImplementacao();
    }

}
