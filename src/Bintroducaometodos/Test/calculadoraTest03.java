package Bintroducaometodos.Test;

import Bintroducaometodos.dominio.Calculadora;

public class calculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        //ou
        System.out.println(calculadora.divideDoisNumeros(20, 0));

        

        
    }
}