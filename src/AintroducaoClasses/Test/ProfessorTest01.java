// aula 41

package AintroducaoClasses.Test;

import AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "mestre kami";
        professor.idade = 21;
        professor.sexo = 'M';

        System.out.println("nome : "+professor.nome +" idade: "+professor.idade +" sexo: "+professor.sexo);
    }
    
}
