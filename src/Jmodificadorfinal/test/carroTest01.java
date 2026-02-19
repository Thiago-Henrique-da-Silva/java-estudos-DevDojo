package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;

public class carroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        // acesso a membro static pela própria classe (não pelo objeto)
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}


