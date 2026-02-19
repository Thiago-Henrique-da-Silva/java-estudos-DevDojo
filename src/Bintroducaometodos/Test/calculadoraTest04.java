package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora; // Importa a classe Calculadora do pacote de domínio

public class calculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Cria objeto da classe Calculadora

        int a = 1; // Valor inicial
        int b = 2; // Valor inicial

        // Passagem de parâmetros por valor: a e b não serão alterados fora do método
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("dentro de calculadoraTest04:");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
    }
}


