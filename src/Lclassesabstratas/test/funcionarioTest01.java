package Lclassesabstratas.test;

import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Gerente;

public class funcionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvovedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvovedor);

        // polimorfismo: método definido na classe abstrata sendo usado pelas subclasses
        desenvovedor.imprimir();
        gerente.imprimir();
    }
}

