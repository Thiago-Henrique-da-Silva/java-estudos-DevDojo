package Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores; // Associação: um Time possui vários Jogadores

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) { // Construtor completo
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}


