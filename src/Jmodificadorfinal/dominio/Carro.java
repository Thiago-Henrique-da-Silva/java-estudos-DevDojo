package Jmodificadorfinal.dominio;

public class Carro {

    private String nome;

    public static final double VELOCIDADE_LIMITE = 250;
    // constante de classe → static pertence à classe
    // final impede que o valor seja alterado

    public final Comprador COMPRADOR = new Comprador();
    // referência final → não pode apontar para outro objeto
    // mas o estado interno do objeto ainda pode ser modificado

    public void imprime() {
        System.out.println(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


