package AintroducaoClasses.Test;

import java.util.Scanner; // Permite ler entradas do usuário (não usado neste teste)
import AintroducaoClasses.dominio.Estudante; // Importa a classe Estudante do pacote de domínio

public class EstudanteTest {
    public static void main(String[] args) throws Exception {
        Estudante estudante = new Estudante(); // Cria objeto Estudante

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}


