package Kenumeracao.dominio;

// declaração de enum (tipo especial que define conjunto fixo de constantes)
public enum tipoCliente {
    // constantes do enum com parâmetros (cada constante chama o construtor)
    PESSOA_FISICA(1, "pessoa fisica"),
    PESSOA_JURIDICA(2, "pessoa juridica");
    private int valor;
    private String Nomerelatorio;

    // construtor de enum (sempre privado implicitamente e chamado pelas constantes)
    tipoCliente(int valor, String Nomerelatorio) {
        this.valor = valor;
        this.Nomerelatorio = Nomerelatorio;
    }

    // método static dentro de enum (comportamento associado ao tipo)
    public static tipoCliente tipoClientePorNomeRelatorio(String Nomerelatorio) {

        // values() → método automático que retorna todas as constantes do enum
        for (tipoCliente tipoCliente : tipoCliente.values()) {

            if (tipoCliente.Nomerelatorio.equals(Nomerelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public String getNomerelatorio() {
        return Nomerelatorio;
    }

    public int getValor() {
        return valor;
    }
}

