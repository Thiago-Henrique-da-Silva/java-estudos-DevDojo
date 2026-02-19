package Kenumeracao.test;

import Kenumeracao.dominio.Cliente;
import Kenumeracao.dominio.TipoPagamento;
import Kenumeracao.dominio.tipoCliente;

public class clienteTest01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Tsubasa", tipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        Cliente cliente02 = new Cliente("Tsubasa", tipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);

        System.out.println(cliente02);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // valueOf → método automático do enum que converte String no nome exato da constante
        tipoCliente tipocliente = tipoCliente.valueOf("PESSOA_FISICA");

        System.out.println(tipocliente.getNomerelatorio());

        tipoCliente tipocliente2 = tipoCliente.tipoClientePorNomeRelatorio("pessoa fisica");

        System.out.println(tipocliente2);
    }
}


