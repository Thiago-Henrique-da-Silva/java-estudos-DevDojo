package Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos; // Associação: um Seminário pode ter vários Alunos
    private Local local; // Associação: um Seminário ocorre em um Local

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAluno(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}


