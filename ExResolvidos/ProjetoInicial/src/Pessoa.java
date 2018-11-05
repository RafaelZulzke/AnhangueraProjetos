/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof
 */
public class Pessoa {
    
    String nome;
    int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public static void main(String args[]){
        Pessoa p = new Pessoa("Rafa");
//        p.nome = "Rafa";
        System.out.println("Nome: " + p.nome);
        
    }

}
