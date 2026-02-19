package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora; // Importa a classe Calculadora do pacote de domínio

public class calculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Cria objeto da classe Calculadora

        // Método que retorna um valor; armazenando em variável
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result); // Exibe o resultado armazenado

        // Chamada direta do método dentro do println; conceito novo: uso direto do retorno de método
        System.out.println(calculadora.divideDoisNumeros(20, 0));
    }
}

