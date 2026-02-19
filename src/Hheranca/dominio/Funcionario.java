package Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        // Bloco estático → executa apenas uma vez quando a classe é carregada
        System.out.println("dentro do bloco de inicialização estático");
    }

    {
        // Bloco comum → executa toda vez que um objeto é criado, antes do construtor
        System.out.println("dentro do bloco de inicialização comum 1");
    }

    {
        System.out.println("dentro do bloco de inicialização comum 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("salario: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("eu " + this.nome + ", recebi um salario de " + this.salario);
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}


