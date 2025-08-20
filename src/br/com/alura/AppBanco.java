package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {
    public static void main(String[] args) {

        var cliente = new Cliente("Talita");
        var conta = new Conta(cliente, new BigDecimal(2000));


        var operacao = new OperacaoSaque(conta,new BigDecimal(2000));

        operacao.executa();
        operacao.executa();
    }
}
