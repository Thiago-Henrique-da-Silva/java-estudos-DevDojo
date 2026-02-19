package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class jogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jose");
        Jogador jogador2 = new Jogador("Maria Alice");
        Jogador jogador3 = new Jogador("Thiago");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // Associação: define o time de cada jogador
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        // Associação: define todos os jogadores que pertencem a este time
        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");
        jogador1.imprime(); // Exibe dados do jogador e seu time
        System.out.println("--- time ---");
    }
}

