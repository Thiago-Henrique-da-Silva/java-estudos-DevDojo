package Gassociacao.test;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professo;

public class escolaTest01 {
    public static void main(String[] args) {
        //criando professor disponivel.
        Professo professor = new Professo("Joice Martins");
        Professo professor2 = new Professo("Thiago Henrique da Silva");
        Professo[] professores = {professor,  professor2};
        Escola escola = new Escola("Elza mendonça", professores);
        escola.imprime();

    }
}
