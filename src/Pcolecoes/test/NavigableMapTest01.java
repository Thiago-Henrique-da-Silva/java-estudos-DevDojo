package Pcolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        // TreeMap implementa NavigableMap e mantém as chaves ordenadas alfabeticamente
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        // Percorre o mapa em ordem natural das chaves (A, B, C, D, E)
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // headMap("C", true) → retorna tudo que vem ANTES de "C", incluindo "C" (true = inclusivo)
        System.out.println(map.headMap("C", true));

        // ceilingKey("C") → menor chave MAIOR OU IGUAL a "C" → retorna "C"
        System.out.println(map.ceilingKey("C"));

        // higherKey("C") → menor chave ESTRITAMENTE MAIOR que "C" → retorna "D"
        System.out.println(map.higherKey("C"));

        // lowerKey("C") → maior chave ESTRITAMENTE MENOR que "C" → retorna "B"
        System.out.println(map.lowerKey("C"));

        // floorKey("C") → maior chave MENOR OU IGUAL a "C" → retorna "C"
        System.out.println(map.floorKey("C"));
    }
}
