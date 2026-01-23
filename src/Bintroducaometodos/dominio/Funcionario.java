package Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if( salarios == null){
            return;
        }
        // para cada "salario" dentro da classe "salarios" faça isso.
        for( double salario: this.salarios){
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial(){
        if(salarios == null){
            return;
        }

        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.printf("\nMedia: %.2f",media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

}
