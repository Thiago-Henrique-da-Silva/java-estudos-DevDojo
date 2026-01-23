// aula 39

package AintroducaoClasses.Test;
import java.util.Scanner;
import AintroducaoClasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) throws Exception {
        Estudante estudante = new Estudante();
        estudante.nome  = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        

        
    }
}
