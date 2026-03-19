package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    //transformar os metodos em "static" para não precisar criar um objeto desta classe no main.
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        //executou o metodo "calcularImposto"
        //mostra "calculando imposto" no console
        //guarda o valor(return) na variavel "imposto"
        System.out.println("Produto: " + produto.getNome());
        System.out.println("valor: " + produto.getValor());
        System.out.println("imposto: " + imposto);
        // NÂO chamou o metodo "calcularImposto" novamente
        // APENAS mostrou o valor que foi salvo na variavel "imposto"

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("data de validade: " +tomate.getDataDeValidade());

            //ou

            /* String dataValidade = ((Tomate) produto).getDataValidade();
               System.out.println("data de validade: " + dataValidade);
            */
        }
    }
}
