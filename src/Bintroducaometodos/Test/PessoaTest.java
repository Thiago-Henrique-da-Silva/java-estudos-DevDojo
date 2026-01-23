package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joice");
        pessoa.setIdade(21);
        System.out.println("seu nome: " + pessoa.getNome());
        System.out.println("sua idade: " + pessoa.getIdade());
        pessoa.imprime();
    }
}
