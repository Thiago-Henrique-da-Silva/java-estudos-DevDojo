package Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professo[] professores;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (professores == null) return;
        for (Professo professor : professores){
            System.out.println(professor.getNome());
        }
    }

    //professores so entra se estiver professor disponivel,no caso criamos um no escolaTest
    public Escola(String nome,  Professo[] professores) {
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
