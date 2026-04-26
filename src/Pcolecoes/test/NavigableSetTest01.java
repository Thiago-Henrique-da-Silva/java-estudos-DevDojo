package Pcolecoes.test;

import Pcolecoes.dominio.Manga;
import Pcolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* O NavigableSet é um TreeSet com métodos extras de navegação como lower, floor, higher e ceiling,
úteis quando precisa encontrar elementos próximos a um valor de referência dentro do Set ordenado . */

class SmartphoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator()); // TreeSet ordenado por marca usando Comparator externo
        SmartPhone smartPhone = new SmartPhone("123", "Nokia");
        set.add(smartPhone);

        NavigableSet<Manga> mangas = new TreeSet<>(); // TreeSet ordenado pelo compareTo da classe Manga (por id), não permite duplicatas
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on Titans",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99));
        mangas.add(new Manga(10L, "Aaragon",10.0,0));
        mangas.add(new Manga(10L, "Aaragon",10.0,0));

        for (Manga manga : mangas) { // percorre o Set já ordenado por id
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho",3.2,5 ); // usado como referência para as buscas abaixo

        System.out.println(mangas.lower(yuyu));   // retorna o maior elemento com id < 21
        System.out.println(mangas.floor(yuyu));   // retorna o maior elemento com id <= 21
        System.out.println(mangas.higher(yuyu));  // retorna o menor elemento com id > 21
        System.out.println(mangas.ceiling(yuyu)); // retorna o menor elemento com id >= 21

        System.out.println(mangas.size());      // retorna a quantidade de elementos
        System.out.println(mangas.pollFirst()); // remove e retorna o primeiro elemento (menor id)
        System.out.println(mangas.size());      // tamanho após a remoção
    }
}
