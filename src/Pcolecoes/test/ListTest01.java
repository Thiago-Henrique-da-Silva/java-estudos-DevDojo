package Pcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);  // lista com capacidade inicial de 16
        List<String> nomes2 = new ArrayList<>(16); // segunda lista com capacidade inicial de 16
        nomes.add("Willian");   // adiciona na lista nomes
        nomes.add("DevDojo");
        nomes2.add("Suane");    // adiciona na lista nomes2
        nomes2.add("Academy");

        nomes.addAll(nomes2); // copia todos os elementos de nomes2 para o final de nomes

        for (String nome : nomes) { // percorre a lista com for-each
            System.out.println(nome);
        }

        int size = nomes.size(); // pega o tamanho total da lista
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i)); // acessa cada elemento pelo índice
        }

        List<Integer> numeros = new ArrayList<>(); // lista de inteiros sem capacidade definida
        numeros.add(1);
        numeros.add(2);
    }
}
