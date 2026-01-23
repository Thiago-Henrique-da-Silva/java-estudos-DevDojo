package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("josé");
        Time time = new Time("seleçao brasileira");

        //adicionando jogador a um time.
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
