package testes;

public class TestaModalidade {

    public static void main(String[] args) {

        Modalidade m1 = Modalidade.getModalidade("Basquete", -1767);
        Modalidade m2 = Modalidade.getModalidade("Hokey");
        Modalidade m3 = Modalidade.getModalidade(1656);

        m1.setAnoCriacao(2000);
        m2.setAnoCriacao(-1900);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println("Quantidade: " + Modalidade.getQtd());

    }

}
