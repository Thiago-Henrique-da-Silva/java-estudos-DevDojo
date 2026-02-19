package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class seminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Santa Maria");
        Aluno aluno = new Aluno("Joice Martins", 21);
        Aluno[] alunos = {aluno};
        Professor professor = new Professor("Thiago H", "programador");

        // Associação: cria um seminário com alunos e local
        Seminario seminario = new Seminario("Onde achar One Piece", alunos, local);

        // Associação: vincula alunos ao seminário (pode ser redefinido depois)
        seminario.setAluno(alunos);

        // Associação: professor ministra este seminário
        Seminario[] seminarios = {seminario};
        professor.setSeminario(seminarios);

        // Exibe dados do professor, seminário, alunos e local
        professor.imprime();
    }
}
