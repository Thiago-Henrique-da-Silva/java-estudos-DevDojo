package Pcolecoes.test;

import Pcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on Titans",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99));

        mangas.sort(mangaByIdComparator); // ordena por id usando o Comparator — obrigatório antes do binarySearch

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"Dragon ball Z",2.99); // objeto usado como referência de busca

        // busca pelo id 2 usando o mesmo Comparator da ordenação, retorna o índice encontrado
        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByIdComparator));
    }
}
