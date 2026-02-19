// Aula 40

package AintroducaoClasses.Test;

import AintroducaoClasses.dominio.Estudante;
import java.util.Scanner; // Import para leitura de dados (não usado neste teste)

public class EstudantTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // Cria o primeiro objeto Estudante
        Estudante estudante2 = new Estudante(); // Cria o segundo objeto Estudante

        estudante.nome = "sanji";

        // Exibe atributos dos objetos; atributos não inicializados (idade, sexo) mostram valores padrão
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
