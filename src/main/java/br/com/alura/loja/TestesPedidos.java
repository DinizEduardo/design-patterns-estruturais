package br.com.alura.loja;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBD;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "Eduardo Diniz 2";
        BigDecimal valorOrcamento = new BigDecimal("300");
        Integer qtdItens = 2;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido(), new LogDePedido())
        );
        handler.execute(gerador);
    }

}
