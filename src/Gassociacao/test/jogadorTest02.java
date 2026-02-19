package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("José");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time); // Associação: jogador agora pertence a um time
        jogador1.imprime();     // Mostra dados do jogador incluindo o time
    }
}


