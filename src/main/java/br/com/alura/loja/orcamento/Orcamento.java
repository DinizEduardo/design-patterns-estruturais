package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdItens;

    public Orcamento(BigDecimal valor, Integer qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

}
