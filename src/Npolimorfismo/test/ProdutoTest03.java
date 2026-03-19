package Npolimorfismo.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataDeValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
