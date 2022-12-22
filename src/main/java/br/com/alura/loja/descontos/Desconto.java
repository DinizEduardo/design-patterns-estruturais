package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);


    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public Desconto getProximo() {
        return proximo;
    }
}
