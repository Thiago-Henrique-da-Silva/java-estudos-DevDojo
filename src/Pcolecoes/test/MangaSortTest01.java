package Pcolecoes.test;

import Pcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* A diferença entre Comparable e Comparator: o Comparable é definido dentro da própria classe e
representa a ordenação padrão. O Comparator é uma classe externa,
útil quando você precisa de múltiplas formas de ordenar o mesmo objeto,
como por id, nome ou preço, sem alterar a classe original. */

class MangaByIdComparator implements Comparator<Manga> {
    // Comparator externo para ordenar Mangas por id
    // usado quando não quer usar o compareTo() da própria classe, ou quando a classe não implementa Comparable

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId()); // compara dois Mangas pelo id, retorna negativo, 0 ou positivo
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on Titans",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99));

        for(Manga manga : mangas){ // percorre a lista antes da ordenação
            System.out.println(manga);
        }

        Collections.sort(mangas); // ordena usando o compareTo() da classe Manga, nesse caso por id crescente
        System.out.println("-------");

        for (Manga manga : mangas){ // percorre a lista já ordenada
            System.out.println(manga);
        }

        // Collections.sort(mangas, new MangaByIdComparator()); - funciona mais tem outras maneiras
        mangas.sort(new MangaByIdComparator()); /* ordena a lista passando o Comparator como argumento,
        forma mais prática que Collections.sort() */
        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
