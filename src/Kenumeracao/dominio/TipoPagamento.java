package Kenumeracao.dominio;

// enum com corpo e comportamento específico por constante
public enum TipoPagamento {

    // constante do enum com classe anônima interna (conceito novo)
    DEBITO {

        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },

    // outra constante com implementação própria
    CREDITO {

        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // método abstrato dentro de enum (obriga cada constante a implementar)
    public abstract double calcularDesconto(double valor);
}
