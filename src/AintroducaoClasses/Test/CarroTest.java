package AintroducaoClasses.Test;

import AintroducaoClasses.dominio.Carro; // Importa a classe Carro do pacote de domínio

public class CarroTest { // Classe usada para testar objetos Carro
    public static void main(String[] args) { // Método principal que roda o programa
        Carro carro = new Carro(); // Cria um objeto Carro chamado carro
        Carro carro2 = new Carro(); // Cria outro objeto Carro chamado carro2

        carro.nome = "palio"; // Define o nome do carro
        carro.modelo = "ano 2015"; // Define o modelo do carro
        carro.ano = 2015; // Define o ano de fabricação

        // Exibe os dados do carro no console
        System.out.println("nome do carro: " + carro.nome + " modelo do carro: " + carro.modelo + " ano do carro: " + carro.ano);

        carro2.nome = "ideia"; // Define nome do segundo carro
        carro2.modelo = "ano 2014"; // Define modelo do segundo carro
        carro2.ano = 2014; // Define ano do segundo carro

        // Exibe os dados do segundo carro no console
        System.out.println("nome do carro: " + carro2.nome + " modelo do carro: " + carro2.modelo + " ano do carro: " + carro2.ano);
    }
}
