package Pcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros); // ordena antes — obrigatório para o binarySearch funcionar corretamente: [0, 2, 3, 4]
        System.out.println(Collections.binarySearch(numeros, 0)); // retorna 0 — índice onde o valor 0 está na lista
        System.out.println(Collections.binarySearch(numeros, -1)); // retorna negativo — valor não encontrado na lista
    }
}
