package Bintroducaometodos.dominio;

public class Funcionario { // Classe funcionário
    private String nome; // Encapsulamento: atributo privado, só acessível via getters/setters
    private int idade;
    private double[] salarios; // Array para armazenar múltiplos salários
    private double media; // Guarda a média salarial calculada

    public void imprimir() { // Método que imprime os dados do funcionário
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) { // Verifica se o array existe antes de percorrer
            return; // Sai do método se não houver salários
        }

        // Percorre o array de salários e imprime cada valor
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial() { // Método que calcula e imprime a média salarial
        if (salarios == null) { // Verifica se há salários
            return; // Sai se não houver
        }

        for (double salario : salarios) { // Soma todos os salários
            media += salario; // Acumula na variável media
        }

        media /= salarios.length; // Calcula a média dividindo pelo tamanho do array
        System.out.printf("\nMedia: %.2f", media); // Mostra a média formatada com 2 casas decimais
    }

    // Setters: permitem definir valores para atributos privados
    public void setNome(String nome) { // Setter nome
        this.nome = nome;
    }

    public void setIdade(int idade) { // Setter idade
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) { // Setter salários
        this.salarios = salarios;
    }

    // Getters: permitem acessar valores de atributos privados
    public String getNome() { // Getter nome
        return nome;
    }

    public int getIdade() { // Getter idade
        return idade;
    }

    public double[] getSalarios() { // Getter salários
        return salarios;
    }

    public double getMedia() { // Getter média
        return media;
    }
}


