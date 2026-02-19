package Bintroducaometodos.dominio;

public class mediaFuncionario { // Classe responsável por calcular a média salarial de um funcionário

    // Método que recebe três salários como parâmetros e calcula a média
    public double calcularmedia(double salario1, double salario2, double salario3) {
        double media = (salario1 + salario2 + salario3) / 3; // Soma os valores e divide por 3 para obter média
        System.out.println("Media salarial: " + media); // Exibe a média no console
        return media; // Retorna o valor da média para uso posterior
    }
}


