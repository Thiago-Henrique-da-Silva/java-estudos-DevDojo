package Pcolecoes.dominio;

import java.util.Objects;

/* O hashCode() transforma o objeto em um número inteiro, esse número é usado
     como "endereço" para guardar e localizar o objeto rapidamente em collections como HashMap e HashSet,
     sem precisar percorrer tudo. */

/*O Comparable<Manga> na assinatura da classe é o que permite usar Collections.sort()
 diretamente na lista de Mangas, sem precisar passar um Comparator externo. */

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco); // gera um hashCode baseado nos três campos combinados
        // deve usar os mesmos campos do equals para garantir consistência em collections como HashMap e HashSet
    }

    //compareTo e com base na ordem alfabetica,compara qual letra vem primeiro,assim que ele separa por ordem alfabetica.
    // ex: Livro e Casa - o "C" vem priemrio que o "l". (sendo organizado por String esse metodo de execução)

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se this < outroManga
        //se this == outroManga,return 0
        // positivo se this > outroManga

        /* if (this.id < outroManga.id) {
            return -1;
        } else if (this.id.equals(outroManga.id)) {
            return 0;
        } else {
            return 1;
        }  */

        return this.id.compareTo(outroManga.id); // sendo organizado por id.
        //return this.nome.compareTo(outroManga.nome); - sendo organizado por nome.
        //return Double.valueOf(preco).compareTo(outroManga.preco); - sendo organizado por preço  (MESMA COISA)
        //return  Double.compare(preco, outroManga.preco); sendo organizado por preço  ( MESMA COISA)

    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
