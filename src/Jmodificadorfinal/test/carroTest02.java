package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;
import Jmodificadorfinal.dominio.Ferrari;

public class carroTest02 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Kuririn");

        System.out.println(carro.COMPRADOR);

        // polimorfismo via herança (Ferrari é uma subclasse de Carro)
        Ferrari ferrari = new Ferrari();

        ferrari.setNome("Enzo");

        // chamada de método herdado ou sobrescrito
        ferrari.imprime();
    }
}
