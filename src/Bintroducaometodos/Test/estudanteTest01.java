package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.impressoraEstudante;

public class estudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        System.out.println("-----");
        impressora.imprime(estudante02);

        
    }
    
}
