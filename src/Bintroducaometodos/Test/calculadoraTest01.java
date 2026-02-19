package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora; // Importa a classe Calculadora do pacote de domínio

public class calculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Cria objeto da classe Calculadora

        calculadora.somaDoisNumeros(); // Chama o método que soma dois números (método definido na classe Calculadora)

        System.out.println("finalizando 'calculadoraTest01'"); // Indica fim da execução de um passo

        calculadora.subtrairDoisNumeros(); // Chama o método que subtrai dois números

        System.out.println("finalizando 'calculadoraTest01'"); // Indica fim do teste
    }
}

