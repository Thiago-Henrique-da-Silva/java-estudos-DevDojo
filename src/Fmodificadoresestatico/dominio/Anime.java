package Fmodificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

        //1-alocado espaço em memoria para o objeto.
        //2-cada atributo de classe é criado e inicializado com valores default ou o que fo passado.
        //3-bloco de inicialização é executado;
        //4-contrutor e executado.

    //bloco de inicialização executa primeiro.
    //static faz com que "episodios" inicie sempre com o valor colocado nele independente da quantidade de objetos "anime" seja criado.
    //bloco de inicialização e execugtado apenas uma vez quando a classe e carregada,isso acontece antes de qualquer coisa.
    //e executado apenas uma vez,se estiver mais de um e executado na ordem em que aparecem.
    static {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }

    public Anime(){
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
