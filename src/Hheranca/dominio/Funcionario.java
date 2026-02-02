package Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("salario: " + this.salario);
    }

    public void relatorioPagamento() {
        //so consigo usat "this.nome" com "protected" na classe Pessoa.
        System.out.println("eu " + this.nome + ",recebi um salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
