package Pcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]); // converte List para Array
        System.out.println(Arrays.toString(listToArray)); // imprime o array formatado: [1, 2, 3]
        System.out.println("----------");
        Integer[] numerosArray = new  Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); // converte Array para List — mas é uma lista de tamanho fixo, não aceita add/remove
        arrayToList.set(0,12);  // permite alterar valores existentes
        System.out.println(Arrays.toString(numerosArray)); // o array original também é alterado pois compartilham a mesma memória: [12, 2, 3]
        System.out.println(arrayToList);

        System.out.println("-------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray)); // cria um ArrayList independente a partir do array — agora aceita add/remove
        numerosList.add(15); // funciona pois é um ArrayList de verdade
        System.out.println(numerosList); // [12, 2, 3, 15]

        List<String>  strings = Arrays.asList("1", "2"); // lista fixa criada direto de valores
    }
}
