package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {
    public static void main(String[] args) {

        var cliente = new Cliente("Talita");
        var conta = new Conta(cliente, new BigDecimal(2000));
        var operacao = new OperacaoSaque(conta,new BigDecimal(2000));

        Thread thread1 = new Thread(operacao);
        Thread thread2 = new Thread(operacao);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Saldo final: "+ conta.getSaldo());
    }
}
