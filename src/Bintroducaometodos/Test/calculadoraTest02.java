package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora; // Importa a classe Calculadora do pacote de domínio

public class calculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Cria objeto da classe Calculadora

        // Chama método passando parâmetros diretamente; conceito novo: métodos com argumentos
        calculadora.multiplicaDoisNumeros(10, 10.5);
    }
}


