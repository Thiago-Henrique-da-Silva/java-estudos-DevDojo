package Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time; // Associação: cada Jogador pode ter um Time

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (time != null) { // Verifica se o jogador tem um time associado
            System.out.println("Time: " + this.time);
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}


