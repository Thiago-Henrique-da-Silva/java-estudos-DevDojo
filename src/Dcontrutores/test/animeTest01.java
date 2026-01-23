package Dcontrutores.test;

import Dcontrutores.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("dragon ball", "Animação", 21, "Ação" );
        Anime anime2= new Anime();
        anime.imprimir();
        anime2.imprimir();
    }
}
