package modelo.implementacao;

import modelo.Pessoa;

class PessoaImplementacao implements Pessoa {

    protected String nome;
    private int  idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString()  {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n";
    }

}
