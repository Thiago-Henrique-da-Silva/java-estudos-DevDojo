package Lclassesabstratas.dominio;

// classe abstrata → não pode ser instanciada diretamente
public abstract class Funcionario extends Pessoa {

    // protected → visível para subclasses (conceito novo)
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        // chamada de método abstrato dentro do construtor
        // será executado usando a implementação da subclasse (polimorfismo em tempo de execução)
        calcularBonus();
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo...");
    }

    // método abstrato → não possui corpo e obriga subclasses a implementar
    public abstract void calcularBonus();

}




