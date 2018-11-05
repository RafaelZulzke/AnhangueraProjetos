package exemplosJE;


import exemplosJE.Aluno;

public class TestaAluno {

    public static void main(String[] args) {

        Data d = new Data((byte)15, (byte)8, (short)1975);

        Materia m = new Materia();
        m.setNome("Linguagem de Programacao");

        Aluno a = new Aluno();
        a.setNome("Nathalia");
        a.setDataNascimento(d);
        a.setMateria(m);

        System.out.println(a);

    }

}
