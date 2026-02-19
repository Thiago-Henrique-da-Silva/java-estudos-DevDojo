package Gassociacao.test;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professo;

public class escolaTest01 {
    public static void main(String[] args) {
        // Criando professores disponíveis
        Professo professor = new Professo("Joice Martins");
        Professo professor2 = new Professo("Thiago Henrique da Silva");

        Professo[] professores = {professor, professor2}; // Array de professores: exemplo de associação

        Escola escola = new Escola("Elza Mendonça", professores); // Cria escola associando professores
        escola.imprime(); // Imprime dados da escola e professores
    }
}


