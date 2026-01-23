package Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome,String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }


    public void imprime() {
        System.out.println("------");
        System.out.println("professor: " + this.nome);
        System.out.println("------");
        System.out.println("seminarios");
        if (this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("titulo: "+ seminario.getTitulo());
            if (seminario.getLocal() == null) continue;
            System.out.println("endereço: "+ seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("** alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("nome: "+ aluno.getNome()+ " idade: "+ aluno.getIdade());

            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
