package Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

        //1-alocado espaço em memoria para o objeto.
        //2-cada atributo de classe e criado e inicializado com valores default ou o que fo passado.
        //3-bloco de inicialização e executado;
        //4-contrutor e executado.
    {
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
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
