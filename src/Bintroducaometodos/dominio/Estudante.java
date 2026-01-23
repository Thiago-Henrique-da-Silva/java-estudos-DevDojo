package Bintroducaometodos.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;


public void imprime(){


    //estudanteTest02
    //"this" referencia o proprio objeto. "esse" em portugues.
    System.out.println(this.nome);
    System.out.println(this.idade);
    System.out.println(this.sexo);
}

}
