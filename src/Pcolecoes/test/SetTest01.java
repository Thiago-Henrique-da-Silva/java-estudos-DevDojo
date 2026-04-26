package Pcolecoes.test;

import Pcolecoes.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

/* Set é uma coleção que não permite duplicatas. Se tentar adicionar um objeto igual a um que já existe, ele ignora silenciosamente.
Para saber se são iguais, usa o equals e hashCode implementado na classe "Manga". */
// Existem 3 tipos principais:

// HashSet — sem ordem garantida, o mais rápido
// LinkedHashSet — mantém a ordem de inserção
// TreeSet — ordena automaticamente pelo compareTo

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<Manga>(); // Set que mantém a ordem de inserção e não permite Mangas duplicadas
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L,"Berserk", 9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titans",11.20,2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99,0));
        // se tentasse adicionar outro Manga com o mesmo id/nome/preco, seria ignorado

        // percorre na mesma ordem em que foram inseridos
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
