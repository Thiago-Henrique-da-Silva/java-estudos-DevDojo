package AintroducaoClasses.Test;

import AintroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "palio";
        carro.modelo = "ano 2015";
        carro.ano = 2015;

        System.out.println("nome do carro: "+carro.nome+" modelo do carro: "+carro.modelo+" ano do carro : "+carro.ano);

        carro2.nome = "ideia";
        carro2.modelo = "ano 2014";
        carro2.ano = 2014;

        System.out.println("nome do carro: "+carro2.nome+" modelo do carro: "+carro2.modelo+" ano do carro : "+carro2.ano);


        
    }
    
}
