package Pcolecoes.test;

import Pcolecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

/*indexOf() percorre a lista do início ao fim comparando cada elemento usando equals(),
 quando encontra retorna o índice da posição, se não encontrar retorna -1. */

// index eu escolho em qual posição quero ele no arrayList.

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1", "iphone");
        SmartPhone s2 = new SmartPhone("22222", "Pixel");
        SmartPhone s3 = new SmartPhone("33333", "Samsung");
        List<SmartPhone> smartphones = new ArrayList<>(6); // lista de SmartPhones com capacidade inicial de 6
        smartphones.add(s1); // adiciona s1 no final da lista
        smartphones.add(s2); // adiciona s2 no final da lista
        smartphones.add(0, s3); // adiciona s3 no índice 0, empurrando os outros para frente

        for (SmartPhone smartphone : smartphones) { // percorre a lista com for-each
            System.out.println(smartphone);
        }

        SmartPhone s4 = new SmartPhone("2222233", "Pixel"); // cria s4 com serialNumber diferente de todos na lista

        int indexSmartphone4 = smartphones.indexOf(s4); // busca o índice de s4 usando equals(), que compara por serialNumber
        // retorna -1 pois nenhum elemento tem serialNumber "2222233"
        System.out.println(smartphones.get(indexSmartphone4)); // get(-1) lança IndexOutOfBoundsException
    }
}
