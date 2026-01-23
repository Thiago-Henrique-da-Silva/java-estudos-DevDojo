package CsobrecargaMetodos.test;

import CsobrecargaMetodos.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Nanatsu no taizai", "Ação", 21);
        anime.imprimir();

    }
}
