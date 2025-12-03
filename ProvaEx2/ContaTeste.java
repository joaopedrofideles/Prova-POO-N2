package ProvaEx2;

import java.util.Locale;

public class ContaTeste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Conta poup = new ContaPoupanca(1000);

        System.out.println(" TESTE CONTA POUPANÇA ");
        System.out.println("Saldo inicial: " + poup.getSaldo());

        poup.depositar(200);
        System.out.println("Após depósito de 200: " + poup.getSaldo());

        poup.sacar(150);
        System.out.println("Após saque de 150: " + poup.getSaldo());


        Conta corr = new ContaCorrente(1000);

        System.out.println("\n TESTE CONTA CORRENTE ");
        System.out.println("Saldo inicial: " + corr.getSaldo());

        corr.depositar(200);
        System.out.println("Após depósito de 200 (com taxa): " + corr.getSaldo());

        corr.sacar(100);
        System.out.println("Após saque de 100 (com taxa): " + corr.getSaldo());
    }
}
