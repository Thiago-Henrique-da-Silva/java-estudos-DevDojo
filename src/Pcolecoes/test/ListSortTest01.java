package Pcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6); // cria uma lista de Strings com capacidade inicial de 6 elementos
        mangas.add("Hellsing Ultimate"); // adiciona elementos na ordem em que foram inseridos
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on Titans");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas); // ordena a lista de Strings em ordem alfabética (A-Z)

        List<Double> dinheiros = new ArrayList<>(); // cria uma lista de Doubles sem capacidade inicial definida
        dinheiros.add(100.21); // adiciona elementos na ordem em que foram inseridos
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros); // ordena a lista de Doubles em ordem crescente (menor para maior)

        for (String manga : mangas) { // percorre cada elemento da lista um por um
            System.out.println(manga); // imprime cada String individualmente
        }

        System.out.println(dinheiros); // imprime a lista inteira de uma vez, no formato [21.21, 23.98, 98.10, 100.21]
    }
}
