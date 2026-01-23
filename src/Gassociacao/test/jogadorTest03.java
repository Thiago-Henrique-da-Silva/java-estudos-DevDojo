package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class jogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jose");
        Jogador jogador2 = new Jogador("Maria Alice");
        Jogador jogador3 = new Jogador("Thiago");
        Time time = new Time("brasil");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        //define o time ao qual este jogador pertence.
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        //define a lista de jogadores que fazem arte deste time.
        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");
        jogador1.imprime();
        System.out.println("--- time ---");
        time.imprime();


    }
}
