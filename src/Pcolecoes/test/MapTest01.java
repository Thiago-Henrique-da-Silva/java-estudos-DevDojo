package Pcolecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

// HashMap foi importado mas não usado — removido
public class MapTest01 {
    public static void main(String[] args) {

        // LinkedHashMap mantém a ordem de inserção (diferente do HashMap que não garante ordem)
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", " mouse");
        map.put("vc", "você");
        map.put("vc2", "você");

        // Imprime o mapa inteiro no formato {chave=valor, ...}
        System.out.println(map);

        // Itera apenas pelas CHAVES e busca o valor de cada uma com get()
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("------------");

        // Itera apenas pelos VALORES, sem acesso às chaves
        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("-------------");

        // Itera pelos pares CHAVE + VALOR ao mesmo tempo via Map.Entry — forma mais eficiente
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}