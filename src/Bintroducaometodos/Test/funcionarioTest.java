package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Thiago");
        funcionario1.setIdade(21);
        funcionario1.setSalarios(new double[]{2200, 2341, 3459});
        funcionario1.imprimir();
        funcionario1.imprimeMediaSalarial();

    }
}
