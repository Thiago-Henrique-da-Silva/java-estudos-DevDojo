package Bintroducaometodos.dominio;

public class Pessoa { // Classe que representa uma pessoa com atributos privados

    private String nome; // Encapsulamento: atributo privado
    private int idade; // Encapsulamento: atributo privado

    // Método que imprime os atributos do objeto
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter da idade com validação
    public void setIdade(int idade) {
        if (idade < 0) { // Valida se a idade é negativa
            System.out.println("Idade negativa não permitida"); // Mostra aviso de erro
            return; // Sai do método sem alterar o atributo
        }
        this.idade = idade; // Define a idade se for válida
    }

    // Getters
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
}


