package Jmodificadorfinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "nome : " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


