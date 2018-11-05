package codigo;

import java.util.ArrayList;

public class CadernoEndereco 
{
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
   
    
    public static void main(String[] args) 
    {
       Pessoa p = new Pessoa();

       p.nome = "Jussiara";
       p.email = "jujuba235@email.com";
       p.telefone = "(19) 35232489";
       p.datanascimento = "16/06/2006";
       p.endereco = new Endereco();
       p.endereco.logradouro = "Rua";
       p.endereco.rua = "5";
       p.endereco.cep = "15662-590";
       p.endereco.bairro = "Parque das Ninfas";
       p.endereco.numero = "687ABCX";
       p.endereco.cidade = "Hell Claro";
       p.endereco.referencia = "Perto do Pontilhão";
       
       CadernoEndereco cadEnd = new CadernoEndereco();
       cadEnd.pessoas.add(p);
       
       System.out.println("1 - Nome / 2 - Email / 3 - Telefone / 4 - Data de Nascimento / 5 - Cidade / 6 - Bairro / 7 -  Rua / 8 - Numero / 9 - Referencia / 10 - Cep");
       System.out.println( cadEnd.pessoas.get(0).nome + " / " + cadEnd.pessoas.get(0).email + " / "+ cadEnd.pessoas.get(0).telefone + " / " + cadEnd.pessoas.get(0).datanascimento + " / " + cadEnd.pessoas.get(0).endereco.cidade + " / " + cadEnd.pessoas.get(0).endereco.bairro + " / " + cadEnd.pessoas.get(0).endereco.rua + " / " + cadEnd.pessoas.get(0).endereco.numero + " / " + cadEnd.pessoas.get(0).endereco.referencia + " / " + cadEnd.pessoas.get(0).endereco.cep);
    }
    
}
