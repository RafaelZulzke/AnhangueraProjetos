package testes;

public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void imprime();

    public static void imprime2() {
        System.out.println("teste teste teste teste...");
    }

}
