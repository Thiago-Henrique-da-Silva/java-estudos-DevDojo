package Fmodificadoresestatico.test;

import Fmodificadoresestatico.dominio.Carro;

public class carroTest {
    public static void main(String[] args) {
        System.out.println(Carro.velocidadeLimite); // Acesso direto ao atributo estático
        Carro.setVelocidadeLimite(180); // Altera atributo estático para todos os objetos
        System.out.println(Carro.velocidadeLimite); // Mostra novo valor do atributo estático
    }
}


