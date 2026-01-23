package Gassociacao.test;

import Gassociacao.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Joice");
        Jogador jogador2 = new Jogador("Thiago");
        Jogador jogador3 = new Jogador("Cassiana");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
