package Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
// GET:metodo usado para pegar um valor de um atributo privado
    public void setNome(String nome){
        this.nome = nome;
    }
// SET:metodo usado para retornar/ler um valor de um atributo privado
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade negativo");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }



}
