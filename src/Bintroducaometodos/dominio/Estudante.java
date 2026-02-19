package Bintroducaometodos.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    // Método que exibe os atributos do próprio objeto
    public void imprime() {
        // 'this' refere-se ao objeto atual, garantindo que acessamos os atributos deste objeto
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}

