package Fmodificadoresestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // Atributo estático: compartilhado por todos os objetos da classe

    // Construtor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir(){
        System.out.println("--------------");
        System.out.println("nome " + this.nome);
        System.out.println("velocidadeMaxima " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite " + Carro.velocidadeLimite); // Acesso a atributo estático
    }

    // Setter estático: altera o valor do atributo estático para todos os objetos
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // Getter que retorna valor do atributo estático
    public double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    // Getters e setters padrões
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(double velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }
}


