package Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professo[] professores; // Associação: cada Escola possui um array de Professores

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (professores == null) return;
        for (Professo professor : professores){ // Percorre todos os professores associados
            System.out.println(professor.getNome());
        }
    }

    // Construtor com associação a professores
    public Escola(String nome, Professo[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professo[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professo[] professores) {
        this.professores = professores;
    }
}

