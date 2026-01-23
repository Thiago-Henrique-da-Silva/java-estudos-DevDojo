package Bintroducaometodos.dominio;

public class mediaFuncionario {

    public double calcularmedia(double salario1, double salario2, double salario3){
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("Media salarial: " +media);
        return media;
    }

    
}
