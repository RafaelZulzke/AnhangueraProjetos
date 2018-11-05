/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex218;

import java.util.ArrayList;

/**
 *
 * @author prof
 */
public class CadernoDeEnderecos {
    
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public static void main(String args[]){
        
        Pessoa p = new Pessoa();
        p.nome = "Rafa";
        p.email = "email@email.com";
        p.endereco.logradouro = "Av";
        p.endereco.rua = "Saudade";
        p.endereco.cidade = "Rio Claro";
        
        CadernoDeEnderecos cadEnderecos = new CadernoDeEnderecos();
        cadEnderecos.pessoas.add(p);
        
        System.out.println( cadEnderecos.pessoas.get(0).nome + " " + 
                cadEnderecos.pessoas.get(0).endereco.cidade);
    }
    
}
