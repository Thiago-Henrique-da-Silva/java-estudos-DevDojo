package Kenumeracao.dominio;

public class Cliente {

    private String nome;

    // uso de enum como tipo de atributo (conceito novo)
    private tipoCliente tipoCliente;

    // outro enum sendo usado como atributo
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, tipoCliente tipoCliente, TipoPagamento tipoPagamento) {

        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {

        return "Cliente{" +
                "nome='" + nome + '\'' +

                // chamada de método específico de enum
                ", tipoCliente=" + tipoCliente.getNomerelatorio() +

                // enum possuindo atributo interno (valor numérico)
                ", tipoClienteint=" + tipoCliente.getValor() +

                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}


