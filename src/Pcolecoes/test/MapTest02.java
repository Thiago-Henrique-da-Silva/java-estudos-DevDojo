package Pcolecoes.test;

import Pcolecoes.dominio.Consumidor;
import Pcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        // Cria dois consumidores — cada um recebe um id aleatório via ThreadLocalRandom
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        // Cria 5 mangas, mas apenas manga1 e manga4 serão usadas no mapa
        Manga manga1 = new Manga(5L,"Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Pokemon",3.2);
        Manga manga4 = new Manga(3L,"Attack on Titans",11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z",2.99);

        // HashMap usando Consumidor como chave e Manga como valor
        // funciona corretamente pois Consumidor implementa equals() e hashCode()
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        // Percorre os pares chave-valor e imprime nome do consumidor e nome da manga
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}