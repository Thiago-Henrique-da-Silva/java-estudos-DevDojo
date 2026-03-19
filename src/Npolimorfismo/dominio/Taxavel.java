package Npolimorfismo.dominio;

public interface Taxavel {
    //metodo "calcularImposto" é abstract entao nao foi preciso colocar o metodo na classe "Produto".
    public abstract double calcularImposto();
}
