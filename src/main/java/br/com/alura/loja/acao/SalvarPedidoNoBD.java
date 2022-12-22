package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBD implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Salvando no banco de dados o pedido.");
    }

}
