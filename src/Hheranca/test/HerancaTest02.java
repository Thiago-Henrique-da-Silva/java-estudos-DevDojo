package Hheranca.test;

import Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - bloco de inicialização estático da super classe é executado quando a JVM carregar aclasse pai.
    // 1 - bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filho.
    // 2 - alocado espaço em memória pro objeto da super classe.
    // 3 - cada atributo de super classe é criado e inicializado com valores default ou o que for passado.
    // 4 - bloco de inicialização da super classe é executado na ordem em que aparece.
    // 5 - construtor é excutado da super classe.
    // 6 - alocado espaço em memoria pro objeto da super classe.
    // 7 - cada atributo de subclasse é criado e inicializado com valores default ou o que for passado.
    // 8 - bloco de inicializção da subclasse é executado na ordem em que aparece.
    // 9 - contrutor e executado da subclasse.
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fernando");
    }
}
