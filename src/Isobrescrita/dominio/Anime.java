package Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        // sobrescrevendo o toString da classe Object
        // permite que o objeto seja exibido de forma legível ao usar System.out.println(obj)
        return "Nome : " + nome;
    }

    public String getNome() {
        return nome;
    }
}

