package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class seminarioTest {
    public static void main(String[] args) {
        // criação
        Local local = new Local("Santa Maria");
        Aluno aluno = new Aluno("Joice Martins", 21);
        Aluno[] alunos = {aluno};
        Professor professor = new Professor("Thiago H", "programador");
        //vinculando aluno e local
        //atribuir alunos e local ao seminario assim.
        Seminario seminario = new Seminario("onde achar one piece", alunos, local);
        //ou atribuir alunos ao seminnario assim.
        seminario.setAluno(alunos);
        Seminario[] seminarios ={seminario};
        professor.setSeminario(seminarios);


        professor.imprime();











    }
}
