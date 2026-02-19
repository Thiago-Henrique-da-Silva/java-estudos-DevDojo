// aula 41

package AintroducaoClasses.Test;

import AintroducaoClasses.dominio.Professor; // Importa a classe Professor do pacote de domínio

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor(); // Cria objeto Professor

        professor.nome = "mestre kami";
        professor.idade = 21;
        professor.sexo = 'M';

        // Exibe todos os atributos do objeto em uma única linha usando concatenação
        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}


