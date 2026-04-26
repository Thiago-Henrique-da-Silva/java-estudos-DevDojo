package Pcolecoes.test;

import Pcolecoes.dominio.Consumidor;
import Pcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        // Cria dois consumidores com id aleatório
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        // Cria 5 mangas para distribuir entre os consumidores
        Manga manga1 = new Manga(5L,"Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Pokemon",3.2);
        Manga manga4 = new Manga(3L,"Attack on Titans",11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z",2.99);

        // Cada consumidor tem uma lista de mangas associada
        // List.of() cria uma lista imutável — não permite add() ou remove() depois
        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga3); // manga3 é compartilhada entre os dois

        // Mapa onde a chave é o Consumidor e o valor é sua lista de mangas
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        // Loop externo: percorre cada par consumidor -> lista de mangas
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("----" + entry.getKey().getNome());

            // Loop interno: percorre cada manga da lista do consumidor atual
            for (Manga manga : entry.getValue()) {
                System.out.println("------" + manga.getNome());
            }
        }
    }
}