package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora; // Importa a classe Calculadora do pacote de domínio

public class calculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5}; // Array de inteiros
        calculadora.somaArray(numeros); // Passa array como parâmetro

        // Varargs: permite passar vários argumentos sem criar array explicitamente
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}


