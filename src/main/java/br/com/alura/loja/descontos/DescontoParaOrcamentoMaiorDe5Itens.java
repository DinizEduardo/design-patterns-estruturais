package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorDe5Itens extends Desconto {

    public DescontoParaOrcamentoMaiorDe5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getQtdItens() > 5);
    }
}
