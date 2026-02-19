package Gassociacao.dominio;

public class Local {
    private String endereco;
    private Seminario[] seminarios; // Associação: cada Local pode ter vários Seminários

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


