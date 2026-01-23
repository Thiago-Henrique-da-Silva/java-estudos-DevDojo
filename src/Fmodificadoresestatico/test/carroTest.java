package Fmodificadoresestatico.test;

import Fmodificadoresestatico.dominio.Carro;

public class carroTest {
    public static void main(String[] args) {
        System.out.println(Carro.velocidadeLimite);
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.velocidadeLimite);

    }
}
